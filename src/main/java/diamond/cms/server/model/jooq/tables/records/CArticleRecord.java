/**
 * This class is generated by jOOQ
 */
package diamond.cms.server.model.jooq.tables.records;


import diamond.cms.server.model.jooq.tables.CArticle;
import diamond.cms.server.model.jooq.tables.interfaces.ICArticle;

import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class CArticleRecord extends UpdatableRecordImpl<CArticleRecord> implements Record6<String, String, String, Timestamp, Timestamp, String>, ICArticle {

	private static final long serialVersionUID = -1886907293;

	/**
	 * Setter for <code>cms.c_article.id</code>.
	 */
	@Override
	public void setId(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cms.c_article.id</code>.
	 */
	@NotNull
	@Size(max = 40)
	@Override
	public String getId() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>cms.c_article.title</code>.
	 */
	@Override
	public void setTitle(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cms.c_article.title</code>.
	 */
	@NotNull
	@Size(max = 255)
	@Override
	public String getTitle() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>cms.c_article.content</code>.
	 */
	@Override
	public void setContent(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cms.c_article.content</code>.
	 */
	@Size(max = 65535)
	@Override
	public String getContent() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>cms.c_article.create_time</code>.
	 */
	@Override
	public void setCreateTime(Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>cms.c_article.create_time</code>.
	 */
	@NotNull
	@Override
	public Timestamp getCreateTime() {
		return (Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>cms.c_article.update_time</code>.
	 */
	@Override
	public void setUpdateTime(Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>cms.c_article.update_time</code>.
	 */
	@NotNull
	@Override
	public Timestamp getUpdateTime() {
		return (Timestamp) getValue(4);
	}

	/**
	 * Setter for <code>cms.c_article.catalog_id</code>.
	 */
	@Override
	public void setCatalogId(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>cms.c_article.catalog_id</code>.
	 */
	@Size(max = 40)
	@Override
	public String getCatalogId() {
		return (String) getValue(5);
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
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<String, String, String, Timestamp, Timestamp, String> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<String, String, String, Timestamp, Timestamp, String> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return CArticle.C_ARTICLE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return CArticle.C_ARTICLE.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return CArticle.C_ARTICLE.CONTENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field4() {
		return CArticle.C_ARTICLE.CREATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field5() {
		return CArticle.C_ARTICLE.UPDATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return CArticle.C_ARTICLE.CATALOG_ID;
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
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getContent();
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
	public String value6() {
		return getCatalogId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CArticleRecord value1(String value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CArticleRecord value2(String value) {
		setTitle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CArticleRecord value3(String value) {
		setContent(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CArticleRecord value4(Timestamp value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CArticleRecord value5(Timestamp value) {
		setUpdateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CArticleRecord value6(String value) {
		setCatalogId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CArticleRecord values(String value1, String value2, String value3, Timestamp value4, Timestamp value5, String value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(ICArticle from) {
		setId(from.getId());
		setTitle(from.getTitle());
		setContent(from.getContent());
		setCreateTime(from.getCreateTime());
		setUpdateTime(from.getUpdateTime());
		setCatalogId(from.getCatalogId());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends ICArticle> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CArticleRecord
	 */
	public CArticleRecord() {
		super(CArticle.C_ARTICLE);
	}

	/**
	 * Create a detached, initialised CArticleRecord
	 */
	public CArticleRecord(String id, String title, String content, Timestamp createTime, Timestamp updateTime, String catalogId) {
		super(CArticle.C_ARTICLE);

		setValue(0, id);
		setValue(1, title);
		setValue(2, content);
		setValue(3, createTime);
		setValue(4, updateTime);
		setValue(5, catalogId);
	}
}
