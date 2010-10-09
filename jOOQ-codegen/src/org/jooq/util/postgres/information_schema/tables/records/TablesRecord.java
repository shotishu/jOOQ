/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.information_schema.tables.records;


import org.jooq.FieldProvider;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableRecordImpl;
import org.jooq.util.postgres.information_schema.tables.Tables;


/**
 * This class is generated by jOOQ.
 */
public class TablesRecord extends TableRecordImpl<TablesRecord> {

	private static final long serialVersionUID = 1L;

	/**
	 * An uncommented item
	 */
	public void setTableCatalog(String value) {
		setValue(Tables.TABLE_CATALOG, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTableCatalog() {
		return getValue(Tables.TABLE_CATALOG);
	}

	/**
	 * An uncommented item
	 */
	public void setTableSchema(String value) {
		setValue(Tables.TABLE_SCHEMA, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTableSchema() {
		return getValue(Tables.TABLE_SCHEMA);
	}

	/**
	 * An uncommented item
	 */
	public void setTableName(String value) {
		setValue(Tables.TABLE_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTableName() {
		return getValue(Tables.TABLE_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setTableType(String value) {
		setValue(Tables.TABLE_TYPE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getTableType() {
		return getValue(Tables.TABLE_TYPE);
	}

	/**
	 * An uncommented item
	 */
	public void setSelfReferencingColumnName(String value) {
		setValue(Tables.SELF_REFERENCING_COLUMN_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getSelfReferencingColumnName() {
		return getValue(Tables.SELF_REFERENCING_COLUMN_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setReferenceGeneration(String value) {
		setValue(Tables.REFERENCE_GENERATION, value);
	}

	/**
	 * An uncommented item
	 */
	public String getReferenceGeneration() {
		return getValue(Tables.REFERENCE_GENERATION);
	}

	/**
	 * An uncommented item
	 */
	public void setUserDefinedTypeCatalog(String value) {
		setValue(Tables.USER_DEFINED_TYPE_CATALOG, value);
	}

	/**
	 * An uncommented item
	 */
	public String getUserDefinedTypeCatalog() {
		return getValue(Tables.USER_DEFINED_TYPE_CATALOG);
	}

	/**
	 * An uncommented item
	 */
	public void setUserDefinedTypeSchema(String value) {
		setValue(Tables.USER_DEFINED_TYPE_SCHEMA, value);
	}

	/**
	 * An uncommented item
	 */
	public String getUserDefinedTypeSchema() {
		return getValue(Tables.USER_DEFINED_TYPE_SCHEMA);
	}

	/**
	 * An uncommented item
	 */
	public void setUserDefinedTypeName(String value) {
		setValue(Tables.USER_DEFINED_TYPE_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public String getUserDefinedTypeName() {
		return getValue(Tables.USER_DEFINED_TYPE_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setIsInsertableInto(String value) {
		setValue(Tables.IS_INSERTABLE_INTO, value);
	}

	/**
	 * An uncommented item
	 */
	public String getIsInsertableInto() {
		return getValue(Tables.IS_INSERTABLE_INTO);
	}

	/**
	 * An uncommented item
	 */
	public void setIsTyped(String value) {
		setValue(Tables.IS_TYPED, value);
	}

	/**
	 * An uncommented item
	 */
	public String getIsTyped() {
		return getValue(Tables.IS_TYPED);
	}

	/**
	 * An uncommented item
	 */
	public void setCommitAction(String value) {
		setValue(Tables.COMMIT_ACTION, value);
	}

	/**
	 * An uncommented item
	 */
	public String getCommitAction() {
		return getValue(Tables.COMMIT_ACTION);
	}

	/**
	 * This constructor has no effect, as a {@link TableFieldImpl} will always
	 * use its underlying table as a FieldProvider descriptor
	 */
	public TablesRecord(FieldProvider metaData) {
		this();
	}

	public TablesRecord() {
		super(Tables.TABLES);
	}
}
