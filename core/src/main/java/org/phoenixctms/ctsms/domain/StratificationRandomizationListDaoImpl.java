// Generated by: hibernate/SpringHibernateDaoImpl.vsl in andromda-spring-cartridge.
// This file is part of the Phoenix CTMS project (www.phoenixctms.org),
// distributed under LGPL v2.1. Copyright (C) 2011 - 2017.
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package org.phoenixctms.ctsms.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Hibernate;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.phoenixctms.ctsms.compare.Comparators;
import org.phoenixctms.ctsms.query.CriteriaUtil;
import org.phoenixctms.ctsms.query.SubCriteriaMap;
import org.phoenixctms.ctsms.vo.InputFieldSelectionSetValueOutVO;
import org.phoenixctms.ctsms.vo.PSFVO;
import org.phoenixctms.ctsms.vo.StratificationRandomizationListInVO;
import org.phoenixctms.ctsms.vo.StratificationRandomizationListOutVO;
import org.phoenixctms.ctsms.vo.TrialOutVO;
import org.phoenixctms.ctsms.vo.UserOutVO;

/**
 * @see StratificationRandomizationList
 */
public class StratificationRandomizationListDaoImpl
		extends StratificationRandomizationListDaoBase {

	public static ArrayList<Long> toInputFieldSelectionSetValueIdCollection(Collection<InputFieldSelectionSetValue> selectionSetValues) { // lazyload persistentset prevention
		// ArrayList<Long> result;
		// if (substances != null && substances.size() > 0) {
		// result = new ArrayList<Long>(substances.size());
		// Iterator<AspSubstance> it = substances.iterator();
		// while (it.hasNext()) {
		// result.add(it.next().getId());
		// }
		// } else {
		// result = new ArrayList<Long>();
		// }
		// return result;
		ArrayList<Long> result = new ArrayList<Long>(selectionSetValues.size());
		Iterator<InputFieldSelectionSetValue> it = selectionSetValues.iterator();
		while (it.hasNext()) {
			result.add(it.next().getId());
		}
		Collections.sort(result); // InVO ID sorting
		return result;
	}

	private org.hibernate.Criteria createStratificationRandomizationListCriteria(String alias) {
		org.hibernate.Criteria stratificationRandomizationListCriteria;
		if (alias != null && alias.length() > 0) {
			stratificationRandomizationListCriteria = this.getSession().createCriteria(StratificationRandomizationList.class, alias);
		} else {
			stratificationRandomizationListCriteria = this.getSession().createCriteria(StratificationRandomizationList.class);
		}
		return stratificationRandomizationListCriteria;
	}

	@Override
	protected Collection<StratificationRandomizationList> handleFindByTrial(Long trialId, PSFVO psf) throws Exception {
		org.hibernate.Criteria stratificationRandomizationListCriteria = createStratificationRandomizationListCriteria(null);
		SubCriteriaMap criteriaMap = new SubCriteriaMap(StratificationRandomizationList.class, stratificationRandomizationListCriteria);
		if (trialId != null) {
			stratificationRandomizationListCriteria.add(Restrictions.eq("trial.id", trialId.longValue()));
		}
		return CriteriaUtil.listDistinctRootPSFVO(criteriaMap, psf, this); // support filter by selection set value
		// CriteriaUtil.applyPSFVO(criteriaMap, psf);
		// return stratificationRandomizationListCriteria.list();
	}

	@Override
	protected Collection<StratificationRandomizationList> handleFindByTrialTagValues(Long trialId, Set<Long> selectionSetValueIds) throws Exception {
		org.hibernate.Criteria stratificationRandomizationListCriteria = createStratificationRandomizationListCriteria("stratificationRandomizationList0");
		if (trialId != null) {
			stratificationRandomizationListCriteria.add(Restrictions.eq("trial.id", trialId.longValue()));
		}
		// multiple joins dont produce "duplicate association" exception
		// https://forum.hibernate.org/viewtopic.php?t=931249
		// if (selectionSetValueIds != null) {
		// Iterator<Long> it = selectionSetValueIds.iterator();
		// int i = 0;
		// while (it.hasNext()) {
		// Long selectionSetValueId = it.next();
		// if (selectionSetValueId != null) {
		// stratificationRandomizationListCriteria.createCriteria("selectionSetValues", "selectionSetValues" +
		// i,CriteriaSpecification.INNER_JOIN).add(Restrictions.idEq(selectionSetValueId.longValue()));
		// i++;
		// }
		// }
		// }
		if (selectionSetValueIds != null && selectionSetValueIds.size() > 0) {
			org.hibernate.Criteria selectionSetValuesCriteria = stratificationRandomizationListCriteria.createCriteria("selectionSetValues", // "selectionSetValues0",
					CriteriaSpecification.INNER_JOIN);
			selectionSetValuesCriteria.add(Restrictions.in("id", selectionSetValueIds));
			ProjectionList proj = Projections.projectionList();
			proj.add(Projections.id());
			proj.add(Projections.sqlGroupProjection(
					"count(*) as selectionSetValuesCount",
					"{alias}.id having count(*) = " + selectionSetValueIds.size(),
					new String[] { "selectionSetValuesCount" },
					new org.hibernate.type.Type[] { Hibernate.LONG }));
			stratificationRandomizationListCriteria.setProjection(proj);
			ArrayList<StratificationRandomizationList> result = new ArrayList<StratificationRandomizationList>();
			Iterator it = stratificationRandomizationListCriteria.list().iterator();
			while (it.hasNext()) {
				result.add(this.load((Long) ((Object[]) it.next())[0]));
			}
			return result;
			// ArrayList<StratificationRandomizationList> result = new ArrayList<StratificationRandomizationList>();
			// Iterator it = CriteriaUtil.listDistinctRoot(stratificationRandomizationListCriteria, this).iterator();
			// while (it.hasNext()) {
			// StratificationRandomizationList randomizationList = (StratificationRandomizationList) it.next();
			// HashSet<Long> randomizationListSelectionSetValueIds = new HashSet<Long>();
			// Iterator<InputFieldSelectionSetValue> randomizationListSelectionSetValuesIt = randomizationList.getSelectionSetValues().iterator();
			// while (randomizationListSelectionSetValuesIt.hasNext()) {
			// randomizationListSelectionSetValueIds.add(randomizationListSelectionSetValuesIt.next().getId());
			// }
			// if (randomizationListSelectionSetValueIds.equals(selectionSetValueIds)) {
			// result.add(randomizationList);
			// }
			// // if (randomizationListSelectionSetValueIds.removeAll(selectionSetValueIds) && randomizationListSelectionSetValueIds.size() == 0) {
			// // result.add(randomizationList);
			// // }
			// }
			// return result;
		} else {
			return stratificationRandomizationListCriteria.list();
		}
	}

	@Override
	protected long handleGetCount(Long trialId) throws Exception {
		org.hibernate.Criteria stratificationRandomizationListCriteria = createStratificationRandomizationListCriteria(null);
		if (trialId != null) {
			stratificationRandomizationListCriteria.add(Restrictions.eq("trial.id", trialId.longValue()));
		}
		return (Long) stratificationRandomizationListCriteria.setProjection(Projections.rowCount()).uniqueResult();
	}

	/**
	 * Retrieves the entity object that is associated with the specified value object
	 * from the object store. If no such entity object exists in the object store,
	 * a new, blank entity is created
	 */
	private StratificationRandomizationList loadStratificationRandomizationListFromStratificationRandomizationListInVO(
			StratificationRandomizationListInVO stratificationRandomizationListInVO) {
		// TODO implement loadStratificationRandomizationListFromStratificationRandomizationListInVO
		// throw new
		// UnsupportedOperationException("org.phoenixctms.ctsms.domain.loadStratificationRandomizationListFromStratificationRandomizationListInVO(StratificationRandomizationListInVO)
		// not yet
		// implemented.");
		Long id = stratificationRandomizationListInVO.getId();
		StratificationRandomizationList stratificationRandomizationList = null;
		if (id != null) {
			stratificationRandomizationList = this.load(id);
		}
		if (stratificationRandomizationList == null) {
			stratificationRandomizationList = StratificationRandomizationList.Factory.newInstance();
		}
		return stratificationRandomizationList;
	}

	/**
	 * Retrieves the entity object that is associated with the specified value object
	 * from the object store. If no such entity object exists in the object store,
	 * a new, blank entity is created
	 */
	private StratificationRandomizationList loadStratificationRandomizationListFromStratificationRandomizationListOutVO(
			StratificationRandomizationListOutVO stratificationRandomizationListOutVO) {
		// TODO implement loadStratificationRandomizationListFromStratificationRandomizationListOutVO
		// throw new
		// UnsupportedOperationException("org.phoenixctms.ctsms.domain.loadStratificationRandomizationListFromStratificationRandomizationListOutVO(StratificationRandomizationListOutVO)
		// not
		// yet implemented.");
		StratificationRandomizationList stratificationRandomizationList = this.get(stratificationRandomizationListOutVO.getId());
		if (stratificationRandomizationList == null) {
			stratificationRandomizationList = StratificationRandomizationList.Factory.newInstance();
		}
		return stratificationRandomizationList;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StratificationRandomizationList stratificationRandomizationListInVOToEntity(StratificationRandomizationListInVO stratificationRandomizationListInVO) {
		StratificationRandomizationList entity = this.loadStratificationRandomizationListFromStratificationRandomizationListInVO(stratificationRandomizationListInVO);
		this.stratificationRandomizationListInVOToEntity(stratificationRandomizationListInVO, entity, true);
		return entity;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void stratificationRandomizationListInVOToEntity(
			StratificationRandomizationListInVO source,
			StratificationRandomizationList target,
			boolean copyIfNull) {
		super.stratificationRandomizationListInVOToEntity(source, target, copyIfNull);
		Long trialId = source.getTrialId();
		if (trialId != null) {
			Trial trial = this.getTrialDao().load(trialId);
			target.setTrial(trial);
			trial.addRandomizationLists(target);
		} else if (copyIfNull) {
			Trial trial = target.getTrial();
			target.setTrial(null);
			if (trial != null) {
				trial.removeRandomizationLists(target);
			}
		}
		Collection selectionSetValueIds;
		if ((selectionSetValueIds = source.getSelectionSetValueIds()).size() > 0 || copyIfNull) {
			target.setSelectionSetValues(toInputFieldSelectionSetValueSet(selectionSetValueIds));
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StratificationRandomizationList stratificationRandomizationListOutVOToEntity(StratificationRandomizationListOutVO stratificationRandomizationListOutVO) {
		StratificationRandomizationList entity = this.loadStratificationRandomizationListFromStratificationRandomizationListOutVO(stratificationRandomizationListOutVO);
		this.stratificationRandomizationListOutVOToEntity(stratificationRandomizationListOutVO, entity, true);
		return entity;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void stratificationRandomizationListOutVOToEntity(
			StratificationRandomizationListOutVO source,
			StratificationRandomizationList target,
			boolean copyIfNull) {
		super.stratificationRandomizationListOutVOToEntity(source, target, copyIfNull);
		TrialOutVO trialVO = source.getTrial();
		UserOutVO modifiedUserVO = source.getModifiedUser();
		if (trialVO != null) {
			Trial trial = this.getTrialDao().trialOutVOToEntity(trialVO);
			target.setTrial(trial);
			trial.addRandomizationLists(target);
		} else if (copyIfNull) {
			Trial trial = target.getTrial();
			target.setTrial(null);
			if (trial != null) {
				trial.removeRandomizationLists(target);
			}
		}
		Collection selectionSetValues;
		if ((selectionSetValues = source.getSelectionSetValues()).size() > 0 || copyIfNull) {
			this.getInputFieldSelectionSetValueDao().inputFieldSelectionSetValueOutVOToEntityCollection(selectionSetValues);
			target.setSelectionSetValues(selectionSetValues); // hashset-exception!!!
		}
		if (modifiedUserVO != null) {
			target.setModifiedUser(this.getUserDao().userOutVOToEntity(modifiedUserVO));
		} else if (copyIfNull) {
			target.setModifiedUser(null);
		}
	}

	private ArrayList<InputFieldSelectionSetValueOutVO> toInputFieldSelectionSetValueOutVOCollection(Collection<InputFieldSelectionSetValue> selectionSetValues) { // lazyload persistentset prevention
		// related to http://forum.andromda.org/viewtopic.php?t=4288
		InputFieldSelectionSetValueDao inputFieldSelectionSetValueDao = this.getInputFieldSelectionSetValueDao();
		ArrayList<InputFieldSelectionSetValueOutVO> result = new ArrayList<InputFieldSelectionSetValueOutVO>(selectionSetValues.size());
		Iterator<InputFieldSelectionSetValue> it = selectionSetValues.iterator();
		while (it.hasNext()) {
			result.add(inputFieldSelectionSetValueDao.toInputFieldSelectionSetValueOutVO(it.next()));
		}
		Collections.sort(result, Comparators.INPUT_FIELD_SELECTION_SET_VALUE_OUT_VO);
		return result;
	}

	private HashSet<InputFieldSelectionSetValue> toInputFieldSelectionSetValueSet(Collection<Long> selectionSetValueIds) { // lazyload persistentset prevention
		InputFieldSelectionSetValueDao inputFieldSelectionSetValueDao = this.getInputFieldSelectionSetValueDao();
		HashSet<InputFieldSelectionSetValue> result = new HashSet<InputFieldSelectionSetValue>(selectionSetValueIds.size());
		Iterator<Long> it = selectionSetValueIds.iterator();
		while (it.hasNext()) {
			result.add(inputFieldSelectionSetValueDao.load(it.next()));
		}
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StratificationRandomizationListInVO toStratificationRandomizationListInVO(final StratificationRandomizationList entity) {
		// TODO verify behavior of toStratificationRandomizationListInVO
		return super.toStratificationRandomizationListInVO(entity);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void toStratificationRandomizationListInVO(
			StratificationRandomizationList source,
			StratificationRandomizationListInVO target) {
		// TODO verify behavior of toStratificationRandomizationListInVO
		super.toStratificationRandomizationListInVO(source, target);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StratificationRandomizationListOutVO toStratificationRandomizationListOutVO(final StratificationRandomizationList entity) {
		return super.toStratificationRandomizationListOutVO(entity);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void toStratificationRandomizationListOutVO(
			StratificationRandomizationList source,
			StratificationRandomizationListOutVO target) {
		// TODO verify behavior of toStratificationRandomizationListOutVO
		super.toStratificationRandomizationListOutVO(source, target);
		// WARNING! No conversion for target.modifiedUser (can't convert source.getModifiedUser():org.phoenixctms.ctsms.domain.User to org.phoenixctms.ctsms.vo.UserOutVO
		// WARNING! No conversion for target.trial (can't convert source.getTrial():org.phoenixctms.ctsms.domain.Trial to org.phoenixctms.ctsms.vo.TrialOutVO
		// WARNING! No conversion for target.selectionSetValues (can't convert source.getSelectionSetValues():org.phoenixctms.ctsms.domain.InputFieldSelectionSetValue to
		// org.phoenixctms.ctsms.vo.InputFieldSelectionSetValueOutVO
		Trial trial = source.getTrial();
		User modifiedUser = source.getModifiedUser();
		if (trial != null) {
			target.setTrial(this.getTrialDao().toTrialOutVO(trial));
		}
		if (modifiedUser != null) {
			target.setModifiedUser(this.getUserDao().toUserOutVO(modifiedUser));
		}
		target.setSelectionSetValues(toInputFieldSelectionSetValueOutVOCollection(source.getSelectionSetValues()));
	}
}