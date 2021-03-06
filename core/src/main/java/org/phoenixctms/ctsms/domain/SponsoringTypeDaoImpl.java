// Generated by: hibernate/SpringHibernateDaoImpl.vsl in andromda-spring-cartridge.
// license-header java merge-point
/**
 * This is only generated once! It will never be overwritten.
 * You can (and have to!) safely modify it by hand.
 */
package org.phoenixctms.ctsms.domain;

import java.util.Collection;

import org.phoenixctms.ctsms.query.CriteriaUtil;
import org.phoenixctms.ctsms.util.L10nUtil;
import org.phoenixctms.ctsms.util.L10nUtil.Locales;
import org.phoenixctms.ctsms.vo.SponsoringTypeVO;

/**
 * @see SponsoringType
 */
public class SponsoringTypeDaoImpl
		extends SponsoringTypeDaoBase {

	private org.hibernate.Criteria createSponsoringTypeCriteria() {
		org.hibernate.Criteria sponsoringTypeCriteria = this.getSession().createCriteria(SponsoringType.class);
		sponsoringTypeCriteria.setCacheable(true);
		return sponsoringTypeCriteria;
	}

	/**
	 * @inheritDoc
	 */
	@Override
	protected Collection<SponsoringType> handleFindByVisibleId(Boolean visible, Long typeId) {
		org.hibernate.Criteria sponsoringTypeCriteria = createSponsoringTypeCriteria();
		CriteriaUtil.applyVisibleIdCriterion("visible", sponsoringTypeCriteria, visible, typeId);
		return sponsoringTypeCriteria.list();
	}

	/**
	 * Retrieves the entity object that is associated with the specified value object
	 * from the object store. If no such entity object exists in the object store,
	 * a new, blank entity is created
	 */
	private SponsoringType loadSponsoringTypeFromSponsoringTypeVO(SponsoringTypeVO sponsoringTypeVO) {
		// TODO implement loadSponsoringTypeFromSponsoringTypeVO
		// throw new UnsupportedOperationException("org.phoenixctms.ctsms.domain.loadSponsoringTypeFromSponsoringTypeVO(SponsoringTypeVO) not yet implemented.");
		SponsoringType sponsoringType = null;
		Long id = sponsoringTypeVO.getId();
		if (id != null) {
			sponsoringType = this.load(id);
		}
		if (sponsoringType == null) {
			sponsoringType = SponsoringType.Factory.newInstance();
		}
		return sponsoringType;
	}

	/**
	 * @inheritDoc
	 */
	@Override
	public SponsoringType sponsoringTypeVOToEntity(SponsoringTypeVO sponsoringTypeVO) {
		SponsoringType entity = this.loadSponsoringTypeFromSponsoringTypeVO(sponsoringTypeVO);
		this.sponsoringTypeVOToEntity(sponsoringTypeVO, entity, true);
		return entity;
	}

	/**
	 * @inheritDoc
	 */
	@Override
	public void sponsoringTypeVOToEntity(
			SponsoringTypeVO source,
			SponsoringType target,
			boolean copyIfNull) {
		super.sponsoringTypeVOToEntity(source, target, copyIfNull);
	}

	/**
	 * @inheritDoc
	 */
	@Override
	public SponsoringTypeVO toSponsoringTypeVO(final SponsoringType entity) {
		return super.toSponsoringTypeVO(entity);
	}

	/**
	 * @inheritDoc
	 */
	@Override
	public void toSponsoringTypeVO(
			SponsoringType source,
			SponsoringTypeVO target) {
		super.toSponsoringTypeVO(source, target);
		target.setName(L10nUtil.getSponsoringTypeName(Locales.USER, source.getNameL10nKey()));
	}
}