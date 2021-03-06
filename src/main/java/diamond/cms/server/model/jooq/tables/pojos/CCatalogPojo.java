/**
 * This class is generated by jOOQ
 */
package diamond.cms.server.model.jooq.tables.pojos;


import diamond.cms.server.model.jooq.tables.interfaces.ICCatalog;

import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


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
public class CCatalogPojo implements ICCatalog {

	private static final long serialVersionUID = -587848820;

	private String    id;
	private String    name;
	private String    parentId;
	private Timestamp createTime;
	private Timestamp updateTime;

	public CCatalogPojo() {}

	public CCatalogPojo(CCatalogPojo value) {
		this.id = value.id;
		this.name = value.name;
		this.parentId = value.parentId;
		this.createTime = value.createTime;
		this.updateTime = value.updateTime;
	}

	public CCatalogPojo(
		String    id,
		String    name,
		String    parentId,
		Timestamp createTime,
		Timestamp updateTime
	) {
		this.id = id;
		this.name = name;
		this.parentId = parentId;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	@NotNull
	@Size(max = 40)
	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

	@NotNull
	@Size(max = 30)
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Size(max = 40)
	@Override
	public String getParentId() {
		return this.parentId;
	}

	@Override
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	@NotNull
	@Override
	public Timestamp getCreateTime() {
		return this.createTime;
	}

	@Override
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	@NotNull
	@Override
	public Timestamp getUpdateTime() {
		return this.updateTime;
	}

	@Override
	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("CCatalogPojo (");

		sb.append(id);
		sb.append(", ").append(name);
		sb.append(", ").append(parentId);
		sb.append(", ").append(createTime);
		sb.append(", ").append(updateTime);

		sb.append(")");
		return sb.toString();
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
}
