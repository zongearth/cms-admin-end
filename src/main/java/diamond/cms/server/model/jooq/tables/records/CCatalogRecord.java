/**
 * This class is generated by jOOQ
 */
package diamond.cms.server.model.jooq.tables.records;


import diamond.cms.server.model.jooq.tables.CCatalog;
import diamond.cms.server.model.jooq.tables.interfaces.ICCatalog;

import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CCatalogRecord extends UpdatableRecordImpl<CCatalogRecord> implements Record5<String, String, String, Timestamp, Timestamp>, ICCatalog {

	private static final long serialVersionUID = -1149180252;

	/**
	 * Setter for <code>cms.c_catalog.id</code>.
	 */
	@Override
	public void setId(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cms.c_catalog.id</code>.
	 */
	@NotNull
	@Size(max = 40)
	@Override
	public String getId() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>cms.c_catalog.name</code>.
	 */
	@Override
	public void setName(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cms.c_catalog.name</code>.
	 */
	@NotNull
	@Size(max = 30)
	@Override
	public String getName() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>cms.c_catalog.parent_id</code>.
	 */
	@Override
	public void setParentId(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cms.c_catalog.parent_id</code>.
	 */
	@Size(max = 40)
	@Override
	public String getParentId() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>cms.c_catalog.create_time</code>.
	 */
	@Override
	public void setCreateTime(Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>cms.c_catalog.create_time</code>.
	 */
	@NotNull
	@Override
	public Timestamp getCreateTime() {
		return (Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>cms.c_catalog.update_time</code>.
	 */
	@Override
	public void setUpdateTime(Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>cms.c_catalog.update_time</code>.
	 */
	@NotNull
	@Override
	public Timestamp getUpdateTime() {
		return (Timestamp) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<String> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<String, String, String, Timestamp, Timestamp> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<String, String, String, Timestamp, Timestamp> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return CCatalog.C_CATALOG.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return CCatalog.C_CATALOG.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return CCatalog.C_CATALOG.PARENT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field4() {
		return CCatalog.C_CATALOG.CREATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field5() {
		return CCatalog.C_CATALOG.UPDATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getParentId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value4() {
		return getCreateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value5() {
		return getUpdateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CCatalogRecord value1(String value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CCatalogRecord value2(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CCatalogRecord value3(String value) {
		setParentId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CCatalogRecord value4(Timestamp value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CCatalogRecord value5(Timestamp value) {
		setUpdateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CCatalogRecord values(String value1, String value2, String value3, Timestamp value4, Timestamp value5) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(ICCatalog from) {
		setId(from.getId());
		setName(from.getName());
		setParentId(from.getParentId());
		setCreateTime(from.getCreateTime());
		setUpdateTime(from.getUpdateTime());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends ICCatalog> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CCatalogRecord
	 */
	public CCatalogRecord() {
		super(CCatalog.C_CATALOG);
	}

	/**
	 * Create a detached, initialised CCatalogRecord
	 */
	public CCatalogRecord(String id, String name, String parentId, Timestamp createTime, Timestamp updateTime) {
		super(CCatalog.C_CATALOG);

		setValue(0, id);
		setValue(1, name);
		setValue(2, parentId);
		setValue(3, createTime);
		setValue(4, updateTime);
	}
}
