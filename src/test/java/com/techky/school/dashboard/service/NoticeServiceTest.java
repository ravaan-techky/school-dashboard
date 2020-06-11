/**
 * @#NoticeViewTest.java June 10, 2020
 */
package com.techky.school.dashboard.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.techky.school.dashboard.database.NoticeView;
import com.techky.school.dashboard.database.dao.Notice;
import com.techky.school.dashboard.database.dao.NoticeDetail;
import com.techky.school.dashboard.database.dao.NoticeInfo;
import com.techky.school.dashboard.service.impl.NoticeServiceImpl;

/**
 * Test Class used to fetch notice details from database.
 *
 * @author Bhushan Patil
 */
@SpringBootTest
public class NoticeServiceTest {
	/** The notice view. */
	@Mock
	NoticeView noticeView;

	/** The notice service. */
	@InjectMocks
	NoticeServiceImpl noticeService;

	/**
	 * Gets the all notice test.
	 *
	 * @return the all notice test
	 */
	@DisplayName("Unit test case for All Notice Test.")
	@Test
	public void getAllNoticeTest() {
		final List<Notice> mockList = new ArrayList<>();
		final Notice notice = new Notice();
		notice.setAttendanceCount(5);
		notice.setContactPerson("XYZ PQR");
		notice.setMeetingAcceptedCount(3);
		notice.setSubject("Test Meeting");
		mockList.add(notice);

		when(noticeView.getAllNotice()).thenReturn(mockList);

		final List<Notice> newNoticeList = noticeService.getAllNotice();
		assertEquals(newNoticeList.get(0).getAttendanceCount(), notice.getAttendanceCount());
		assertEquals(newNoticeList.get(0).getSubject(), notice.getSubject());
		assertEquals(newNoticeList.get(0).getContactPerson(), notice.getContactPerson());
	}

	/**
	 * Gets the notice detail.
	 *
	 * @return the notice detail
	 */
	@DisplayName("Unit test case for get Notice Detail Test.")
	@Test
	public void getNoticeDetail() {
		final NoticeDetail noticeDetail = new NoticeDetail();
		final Notice notice = new Notice();
		notice.setAttendanceCount(5);
		notice.setContactPerson("XYZ PQR");
		notice.setMeetingAcceptedCount(3);
		notice.setSubject("Test Meeting");
		noticeDetail.setNotice(notice);

		final Map<Timestamp, NoticeInfo> infoDetails = new HashMap<>();
		final NoticeInfo noticeInfo = new NoticeInfo();
		noticeInfo.setMoreDetail("Test More Details");
		noticeInfo.setSubject("Info Subject");
		noticeInfo.setTimelineIcon("Info");
		final Long timeInMilliSeconds = 1591840097956L;
		final Timestamp timestamp = new Timestamp(timeInMilliSeconds);
		infoDetails.put(timestamp, noticeInfo);
		noticeDetail.setNoticeInfo(infoDetails);

		final String noticeId = "12345";

		when(noticeView.getNoticeDetail(noticeId)).thenReturn(noticeDetail);
		final NoticeDetail newNoticeDetail = noticeService.getNoticeDetail(noticeId);
		assertEquals(newNoticeDetail.getNotice().getAttendanceCount(), notice.getAttendanceCount());
		assertEquals(newNoticeDetail.getNotice().getSubject(), notice.getSubject());
		assertEquals(newNoticeDetail.getNotice().getContactPerson(), notice.getContactPerson());
		assertEquals(newNoticeDetail.getNoticeInfo().get(timestamp).getMoreDetail(), "Test More Details");
		assertEquals(newNoticeDetail.getNoticeInfo().get(timestamp).getSubject(), "Info Subject");
		assertEquals(newNoticeDetail.getNoticeInfo().get(timestamp).getTimelineIcon(), "Info");
	}

}
