/**
 * This class is generated by jOOQ
 */
package org.jooq.test.generatedclasses.tables;

import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.test.generatedclasses.Test;


/**
 * This class is generated by jOOQ.
 *
 * An unused table in the same schema.
 */
public class XUnused extends TableImpl {

	private static final long serialVersionUID = 3834358223034983297L;

	/**
	 * The singleton instance of x_unused
	 */
	public static final XUnused X_UNUSED = new XUnused();

	/**
	 * An uncommented item
	 */
	public static final TableField<Integer> ID = new TableFieldImpl<Integer>("ID", Integer.class, X_UNUSED);

	/**
	 * No further instances allowed
	 */
	private XUnused() {
		super("x_unused", Test.TEST);
	}
}
