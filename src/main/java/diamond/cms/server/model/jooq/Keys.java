/**
 * This class is generated by jOOQ
 */
package diamond.cms.server.model.jooq;


import diamond.cms.server.model.jooq.tables.CArticle;
import diamond.cms.server.model.jooq.tables.CCatalog;
import diamond.cms.server.model.jooq.tables.CUser;
import diamond.cms.server.model.jooq.tables.records.CArticleRecord;
import diamond.cms.server.model.jooq.tables.records.CCatalogRecord;
import diamond.cms.server.model.jooq.tables.records.CUserRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>cms</code> 
 * schema
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<CArticleRecord> KEY_C_ARTICLE_PRIMARY = UniqueKeys0.KEY_C_ARTICLE_PRIMARY;
	public static final UniqueKey<CCatalogRecord> KEY_C_CATALOG_PRIMARY = UniqueKeys0.KEY_C_CATALOG_PRIMARY;
	public static final UniqueKey<CUserRecord> KEY_C_USER_PRIMARY = UniqueKeys0.KEY_C_USER_PRIMARY;
	public static final UniqueKey<CUserRecord> KEY_C_USER_UK_E4YLW9V9NHRB2RJVY09B1Y7XS = UniqueKeys0.KEY_C_USER_UK_E4YLW9V9NHRB2RJVY09B1Y7XS;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final ForeignKey<CCatalogRecord, CCatalogRecord> FK_C6HY5PU5MCARTL5YWDWEHMXD3 = ForeignKeys0.FK_C6HY5PU5MCARTL5YWDWEHMXD3;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<CArticleRecord> KEY_C_ARTICLE_PRIMARY = createUniqueKey(CArticle.C_ARTICLE, CArticle.C_ARTICLE.ID);
		public static final UniqueKey<CCatalogRecord> KEY_C_CATALOG_PRIMARY = createUniqueKey(CCatalog.C_CATALOG, CCatalog.C_CATALOG.ID);
		public static final UniqueKey<CUserRecord> KEY_C_USER_PRIMARY = createUniqueKey(CUser.C_USER, CUser.C_USER.ID);
		public static final UniqueKey<CUserRecord> KEY_C_USER_UK_E4YLW9V9NHRB2RJVY09B1Y7XS = createUniqueKey(CUser.C_USER, CUser.C_USER.USERNAME);
	}

	private static class ForeignKeys0 extends AbstractKeys {
		public static final ForeignKey<CCatalogRecord, CCatalogRecord> FK_C6HY5PU5MCARTL5YWDWEHMXD3 = createForeignKey(diamond.cms.server.model.jooq.Keys.KEY_C_CATALOG_PRIMARY, CCatalog.C_CATALOG, CCatalog.C_CATALOG.PARENT_ID);
	}
}
