/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables.records;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.jooq.FieldProvider;
import org.jooq.SimpleSelectQuery;
import org.jooq.impl.Create;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.mysql.generatedclasses.tables.TAuthor;
import org.jooq.test.mysql.generatedclasses.tables.TBook;


/**
 * This class is generated by jOOQ.
 *
 * An entity holding books
 */
public class TBookRecord extends UpdatableRecordImpl<TBookRecord> {

	private static final long serialVersionUID = 1L;

	/**
	 * The book ID
	 * 
	 * PRIMARY KEY
	 */
	public void setId(Integer value) {
		setValue(TBook.ID, value);
	}

	/**
	 * The book ID
	 * 
	 * PRIMARY KEY
	 */
	public Integer getId() {
		return getValue(TBook.ID);
	}

	/**
	 * The author ID in entity 'author'
	 * 
	 * FOREIGN KEY [AUTHOR_ID] REFERENCES t_author [ID]
	 */
	public void setAuthorId(Integer value) {
		setValue(TBook.AUTHOR_ID, value);
	}

	/**
	 * The author ID in entity 'author'
	 * 
	 * FOREIGN KEY [AUTHOR_ID] REFERENCES t_author [ID]
	 */
	public Integer getAuthorId() {
		return getValue(TBook.AUTHOR_ID);
	}

	/**
	 * The author ID in entity 'author'
	 * 
	 * FOREIGN KEY [AUTHOR_ID] REFERENCES t_author [ID]
	 */
	public TAuthorRecord getTAuthor(Connection connection) throws SQLException {
		SimpleSelectQuery<TAuthorRecord> q = Create.selectQuery(TAuthor.T_AUTHOR);
		q.addCompareCondition(TAuthor.ID, getValue(TBook.AUTHOR_ID));
		q.execute(connection);

		List<TAuthorRecord> result = q.getResult().getRecords();
		return result.size() == 1 ? result.get(0) : null;
	}

	/**
	 * The book's title
	 */
	public void setTitle(String value) {
		setValue(TBook.TITLE, value);
	}

	/**
	 * The book's title
	 */
	public String getTitle() {
		return getValue(TBook.TITLE);
	}

	/**
	 * The year the book was published in
	 */
	public void setPublishedIn(Integer value) {
		setValue(TBook.PUBLISHED_IN, value);
	}

	/**
	 * The year the book was published in
	 */
	public Integer getPublishedIn() {
		return getValue(TBook.PUBLISHED_IN);
	}

	/**
	 * This constructor has no effect, as a {@link TableFieldImpl} will always
	 * use its underlying table as a FieldProvider descriptor
	 */
	public TBookRecord(FieldProvider fields) {
		this();
	}

	public TBookRecord() {
		super(TBook.T_BOOK);
	}
}
