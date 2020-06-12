/**
 * @#DashboardController.java October 24, 2018
 */
package com.techky.school.dashboard.html.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Class used for dashboard operation.
 *
 * @author Bhushan Patil
 */
@Controller
public class DashboardController {

	/**
	 * Method used to show dashobard page.
	 *
	 * @param model Map instance.
	 * @return String instance.
	 */
	@GetMapping(path = { "/", "/home" })
	public String showDashboard(final Map<String, Object> model) {
		return "dashboard/dashboard";
	}

}