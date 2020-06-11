/**
 * @#NoticeRestController.java October 24, 2018
 */
package com.techky.school.dashboard.rest.controller;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techky.school.dashboard.database.dao.Notice;
import com.techky.school.dashboard.database.dao.NoticeDetail;
import com.techky.school.dashboard.service.NoticeService;

/**
 * Class used to fetch notice details.
 *
 * @author Bhushan Patil
 */
@RestController
public class NoticeRestController {

	/** noticeService NoticeService instance */
	@Autowired
	private NoticeService noticeService;

	/**
	 * Method to fetch Notice List.
	 *
	 * @return Map instance
	 */
	@GetMapping("/getNoticeList")
	public Map<String, List<Notice>> getNoticeList() {
		final Map<String, List<Notice>> dataResult = new ConcurrentHashMap<>();
		dataResult.put("data", noticeService.getAllNotice());
		return dataResult;
	}

	/**
	 * Method to fetch Notice details with the help of given notice id.
	 *
	 * @param noticeId String instance.
	 * @return List instance.
	 */
	@GetMapping("/getNotice")
	public NoticeDetail getNotice(@RequestParam(value = "noticeId", defaultValue = "-1") final String noticeId) {
		return noticeService.getNoticeDetail(noticeId);
	}

}
