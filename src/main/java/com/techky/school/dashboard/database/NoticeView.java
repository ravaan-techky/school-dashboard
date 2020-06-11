/**
 * @#NoticeView.java October 24, 2018
 */
package com.techky.school.dashboard.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.techky.school.dashboard.database.dao.Notice;
import com.techky.school.dashboard.database.dao.NoticeDetail;

/**
 * Class used to fetch notice details from database.
 *
 * @author Bhushan Patil
 */
@Repository
public class NoticeView {

	/** jdbcTemplate JdbcTemplate instance. */
	@Autowired
	private JdbcTemplate jdbcTemplate;

	/**
	 * Method to get all notice details from database.
	 *
	 * @return List instance
	 */
	public List<Notice> getAllNotice() {
		final String sqlQuery = "select uid, subject, date(meeting_date), contact_person, attendance_count, meeting_accepted_count, meeting_audience "
				+ "from school_updates " + "order by meeting_date desc";
		return jdbcTemplate.query(sqlQuery, new NoticeListRowMapper());
	}

	/**
	 * Method to get notice details of given notice id.
	 *
	 * @param noticeId Integer instance
	 * @return List instance.
	 */
	public NoticeDetail getNoticeDetail(final String noticeId) {
		final String sqlQuery = "select * from school_notice_detail where noticeId = ? order by uid asc";
		final Object[] args = { noticeId };
		return jdbcTemplate.query(sqlQuery, args, new NoticeDetailResultSetExtractor());
	}

	/**
	 * NoticeListRowMapper class to mapped database row into object list.
	 */
	private class NoticeListRowMapper implements RowMapper<Notice> {

		/**
		 * Map row.
		 *
		 * @param resultSet the result set
		 * @param rowNumber the row number
		 * @return the notice
		 * @throws SQLException the SQL exception
		 */
		@Override
		public Notice mapRow(final ResultSet resultSet, final int rowNumber) throws SQLException {
			final Notice notice = new Notice();
			notice.setUid(resultSet.getInt(1));
			notice.setSubject(resultSet.getString(2));
			notice.setMeetingDate(resultSet.getString(3));
			notice.setContactPerson(resultSet.getString(4));
			notice.setAttendanceCount(resultSet.getInt(5));
			notice.setMeetingAcceptedCount(resultSet.getInt(6));
			notice.setMeetingAudience(resultSet.getString(7));
			return notice;
		}

	}

	/**
	 * NoticeDetailRowMapper class to mapped database row into object list.
	 */
	private class NoticeDetailResultSetExtractor implements ResultSetExtractor<NoticeDetail> {

		/**
		 * Extract data.
		 *
		 * @param resultSet the result set
		 * @return the notice detail
		 * @throws SQLException        the SQL exception
		 * @throws DataAccessException the data access exception
		 */
		@Override
		public NoticeDetail extractData(final ResultSet resultSet) throws SQLException, DataAccessException {
			NoticeDetail noticeDetail = null;
			if (resultSet.next()) {
				noticeDetail = new NoticeDetail();
			}
			return noticeDetail;
		}
	}
}
