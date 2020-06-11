/**
 * @#NoticeService.java June 10, 2020
 */
package com.techky.school.dashboard.service;

import java.util.List;

import com.techky.school.dashboard.database.dao.Notice;
import com.techky.school.dashboard.database.dao.NoticeDetail;

/**
 * The Interface NoticeService.
 */
public interface NoticeService {

	/**
	 * Method to get all notice details from database.
	 *
	 * @return List instance
	 */
	List<Notice> getAllNotice();

	/**
	 * Gets the notice detail.
	 *
	 * @param noticeId the notice id
	 * @return the notice detail
	 */
	NoticeDetail getNoticeDetail(final String noticeId);
}
