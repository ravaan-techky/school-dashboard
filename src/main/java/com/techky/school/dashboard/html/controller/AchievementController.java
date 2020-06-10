/**
 * @#AchievementController.java October 24, 2018
 */
package com.techky.school.dashboard.html.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Class used for achievement page operation.
 *
 * @author Bhushan Patil
 */
@Controller
public class AchievementController {

	/**
	 * Method used to show achievements page.
	 *
	 * @param model Map instance.
	 * @return String instance.
	 */
	@RequestMapping(path = "/achievements", method = RequestMethod.GET)
	public String showGallery(final Map<String, Object> model) {
		return "achievement/showAchievements";
	}
}
