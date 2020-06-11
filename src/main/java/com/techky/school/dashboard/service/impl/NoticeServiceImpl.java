/**
 * @#NoticeServiceImpl.java June 10, 2020
 */
package com.techky.school.dashboard.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techky.school.dashboard.database.NoticeView;
import com.techky.school.dashboard.database.dao.Notice;
import com.techky.school.dashboard.database.dao.NoticeDetail;
import com.techky.school.dashboard.service.NoticeService;

/**
 * The Class NoticeServiceImpl.
 */
@Service
public class NoticeServiceImpl implements NoticeService {

	/** The notice view. */
	@Autowired
	private NoticeView noticeView;

	/**
	 * Gets the all notice.
	 *
	 * @return the all notice
	 */
	@Override
	public List<Notice> getAllNotice() {
		return noticeView.getAllNotice();
	}

	/**
	 * Gets the notice detail.
	 *
	 * @param noticeId the notice id
	 * @return the notice detail
	 */
	@Override
	public NoticeDetail getNoticeDetail(final String noticeId) {
		return noticeView.getNoticeDetail(noticeId);
	}
}
