/**
 * @#NoticeRestControllerTest.java June 11, 2020
 */
package com.techky.school.dashboard.rest.controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import com.techky.school.dashboard.DashboardApplication;

/**
 * The Class NoticeRestControllerTest.
 */
@SpringBootTest(classes = DashboardApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class NoticeRestControllerTest {

	/** The port. */
	@LocalServerPort
	private int port;

	/** The rest template. */
	@Autowired
	private TestRestTemplate restTemplate;

	/**
	 * Test get notice list.
	 */
	@DisplayName("Test case to validate get all notice list from rest call.")
	@Disabled("Disabled because of CircleCI")
	@Test
	public void testGetNoticeList() {
		final Map<?, ?> result = this.restTemplate
				.getForObject("http://localhost:" + port + "/school-dashboard/getNoticeList", Map.class);
		assertNotNull(result);
		assertTrue(result.get("data") instanceof List<?>);
		assertTrue(((List<?>) result.get("data")).size() > 0);
	}

	/**
	 * Test get notice.
	 */
	@DisplayName("Test case to validate get notice detail from rest call.")
	@Disabled("Disabled because of CircleCI")
	@Test
	public void testGetNotice() {
		final Map<?, ?> result = this.restTemplate
				.getForObject("http://localhost:" + port + "/school-dashboard/getNoticeList", Map.class);
		assertNotNull(result);
		assertTrue(result.get("data") instanceof List<?>);
		assertTrue(((List<?>) result.get("data")).size() > 0);
	}

}
