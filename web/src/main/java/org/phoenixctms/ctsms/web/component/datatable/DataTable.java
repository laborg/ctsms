package org.phoenixctms.ctsms.web.component.datatable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

import org.phoenixctms.ctsms.web.util.WebUtil;
import org.primefaces.component.column.Column;
import org.primefaces.component.columngroup.ColumnGroup;
import org.primefaces.component.columns.Columns;
import org.primefaces.component.row.Row;
import org.primefaces.component.subtable.SubTable;

/**
 * Extending PF data table to allow for binding of the filter map.
 */
public class DataTable extends org.primefaces.component.datatable.DataTable {

	private ArrayList<Column> columns;

	public List<Column> getColumns() {
		if (columns == null) {
			columns = new ArrayList<Column>();
			for (UIComponent child : this.getChildren()) {
				if (child.isRendered()
						&& child instanceof Column
						&& ColumnManagementBean.isVisible((Column) child)) {
					columns.add((Column) child);
				}
			}
		}
		return columns;
	}

	public List<Column> getAllColumns() {
		return super.getColumns();
	}

	private Map<String, Column> filterMap;

	public Map<String, Column> getFilterMap() {
		if (filterMap == null) {
			filterMap = new HashMap<String, Column>();
			ColumnGroup group = getColumnGroup("header");
			if (group != null) {
				//column group
				for (UIComponent child : group.getChildren()) {
					Row headerRow = (Row) child;
					if (headerRow.isRendered()) {
						for (UIComponent headerRowChild : headerRow.getChildren()) {
							Column column = (Column) headerRowChild;
							if (column.isRendered()
									&& column.getValueExpression("filterBy") != null
									&& (ColumnManagementBean.FILTER_INVISIBLE || ColumnManagementBean.isVisible(column))) {
								filterMap.put(column.getClientId(FacesContext.getCurrentInstance()) + "_filter", column);
							}
						}
					}
				}
			} else {
				for (UIComponent child : getChildren()) {
					if (child instanceof Columns) {
						Columns columns = (Columns) child;
						List<?> columnModel = (List<?>) columns.getValue();
						if (columnModel != null
								&& columns.getValueExpression("filterBy") != null
								&& (ColumnManagementBean.FILTER_INVISIBLE || ColumnManagementBean.isVisible(columns))) {
							for (int i = 0; i < columnModel.size(); i++) {
								columns.setColIndex(i);
								filterMap.put(columns.getClientId(FacesContext.getCurrentInstance()) + "_filter", columns);
							}
							columns.setColIndex(-1); //reset
						}
					} else if (child instanceof Column) {
						Column column = (Column) child;
						if (column.getValueExpression("filterBy") != null
								&& (ColumnManagementBean.FILTER_INVISIBLE || ColumnManagementBean.isVisible(column))) {
							filterMap.put(column.getClientId(FacesContext.getCurrentInstance()) + "_filter", column);
						}
					}
				}
			}
		}
		return filterMap;
	}

	private int columnsCount = -1;

	public int getColumnsCount() {
		if (columnsCount == -1) {
			columnsCount = 0;
			for (UIComponent kid : getChildren()) {
				if (kid.isRendered()) {
					if (kid instanceof Columns) {
						if (ColumnManagementBean.isVisible((Columns) kid)) {
							Columns uicolumns = (Columns) kid;
							Collection collection = (Collection) uicolumns.getValue();
							if (collection != null) {
								columnsCount += collection.size();
							}
						}
					} else if (kid instanceof Column) {
						if (ColumnManagementBean.isVisible((Column) kid)) {
							columnsCount++;
						}
					} else if (kid instanceof SubTable) {
						SubTable subTable = (SubTable) kid;
						for (UIComponent subTableKid : subTable.getChildren()) {
							if (subTableKid.isRendered()
									&& subTableKid instanceof Column
									&& ColumnManagementBean.isVisible((Column) subTableKid)) {
								columnsCount++;
							}
						}
					}
				}
			}
		}
		return columnsCount;
	}

	public List<Object> getSelectedRowKeys() {
		return getSelectedRowKeys();
	}

	@Override
	public java.util.Map<String, String> getFilters() {
		return WebUtil.getSessionScopeBean().getFilterMap(this.getClientId());
	}

	@Override
	public void setFilters(java.util.Map<String, String> filters) {
		WebUtil.getSessionScopeBean().setFilterMap(this.getClientId(), filters);
	}

	public void clearFilters() {
		// http://www.tekbytes.in/tutorial/jsf/how-primefaces-server-side-clear-filter-solution-improve-the-application-performance
		// http://stackoverflow.com/questions/18313011/reset-primefaces-datatable-state-filter-sorting-paging
		getFilters().clear();
		setFirst(0);
	}

	public static void clearFilters(String id) {
		//((DataTable) WebUtil.findComponentById(id)).clearFilters();
		DataTable dataTable = (DataTable) WebUtil.findComponentById(id);
		if (dataTable != null) {
			dataTable.clearFilters();
			//} else {
			//	System.out.println("cannot find: " + id);
		}
	}
}