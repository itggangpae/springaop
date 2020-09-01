package kr.co.pk;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.pk.domain.SpringUser;
import kr.co.pk.service.SpringUserService;

@Controller
public class SpringUserController {
	@Autowired
	private SpringUserService springUserService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public void login(SpringUser SpringUser, Model model) {
		SpringUser vo = springUserService.login(SpringUser);
		model.addAttribute("vo", vo);
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) throws Exception {
		session.invalidate();
		return "redirect:/";
	}
}
