package denik.controller;

import Entity.Publication;
import Entity.User;
import EntityServices.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		//TestTestTEst.main();
		UserService userService= new UserService();
		User user= new User();
		user.setName("name"+ new Random().nextInt());
		user.setPassword("password");
		user.setBlocked(false);
		user.setRole("ROLE_USER");
		userService.add(user);
		Publication publication= new Publication();
		publication.setCode("Code");
		publication.setText("text");
		publication.setTitle("title");
		userService.addPublication(3,publication);
		return new ModelAndView("home");
	}
}
