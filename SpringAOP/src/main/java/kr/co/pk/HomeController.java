package kr.co.pk;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.pk.service.Algorithm;

@Controller
public class HomeController {
	@Autowired
	private Algorithm algorithm;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		return "home";
	}

	@RequestMapping("boardlist")
	public void boardlist() {
	}

	@RequestMapping(value = "/arinsert", method = RequestMethod.GET)
	public String arinsert(Model model) {
		algorithm.arrayListInsert();
		return "home";
	}

	@RequestMapping(value = "/liinsert", method = RequestMethod.GET)
	public String liinsert(Locale locale, Model model) {
		algorithm.linkedListInsert();
		return "home";
	}

	@RequestMapping(value = "/arread", method = RequestMethod.GET)
	public String arread(Locale locale, Model model) {
		algorithm.arrayListRead();
		return "home";
	}

	@RequestMapping(value = "/liread", method = RequestMethod.GET)
	public String liread(Locale locale, Model model) {
		algorithm.linkedListRead();
		return "home";
	}

}
