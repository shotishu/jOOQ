/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbc.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class T_725LobTestRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.jdbc.generatedclasses.tables.records.T_725LobTestRecord> implements org.jooq.Record2<java.lang.Integer, byte[]>, org.jooq.test.jdbc.generatedclasses.tables.interfaces.IT_725LobTest {

	private static final long serialVersionUID = 332374930;

	/**
	 * Setter for <code>PUBLIC.T_725_LOB_TEST.ID</code>. 
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.jdbc.generatedclasses.tables.T_725LobTest.ID, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_725_LOB_TEST.ID</code>. 
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.jdbc.generatedclasses.tables.T_725LobTest.ID);
	}

	/**
	 * Setter for <code>PUBLIC.T_725_LOB_TEST.LOB</code>. 
	 */
	@Override
	public void setLob(byte[] value) {
		setValue(org.jooq.test.jdbc.generatedclasses.tables.T_725LobTest.LOB, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_725_LOB_TEST.LOB</code>. 
	 */
	@Override
	public byte[] getLob() {
		return getValue(org.jooq.test.jdbc.generatedclasses.tables.T_725LobTest.LOB);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, byte[]> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, byte[]> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.jdbc.generatedclasses.tables.T_725LobTest.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<byte[]> field2() {
		return org.jooq.test.jdbc.generatedclasses.tables.T_725LobTest.LOB;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value2() {
		return getLob();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_725LobTestRecord
	 */
	public T_725LobTestRecord() {
		super(org.jooq.test.jdbc.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST);
	}
}