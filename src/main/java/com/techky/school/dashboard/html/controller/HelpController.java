/**
 * @#HelpController.java October 24, 2018
 */
package com.techky.school.dashboard.html.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Class used for help controller page.
 *
 * @author Bhushan Patil
 */
@Controller
public class HelpController {

	/**
	 * Method used to show about page.
	 *
	 * @param model Map instance.
	 * @return String instance.
	 */
	@RequestMapping("/about")
	public String showNoticeBoard(final Map<String, Object> model) {
		return "about/about";
	}
}
