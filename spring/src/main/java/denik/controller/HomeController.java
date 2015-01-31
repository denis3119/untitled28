package denik.controller;

import Entity.Comment;
import Entity.Publication;
import Entity.User;
import EntityServices.CommentService;
import EntityServices.PublicationService;
import EntityServices.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		//TestTestTEst.main();
		UserService userService= new UserService();
		User user= new User();
//		user.setName("name"+ new Random().nextInt());
//		user.setPassword("password");
//		user.setBlocked(false);
//		user.setRole("ROLE_USER");
//		userService.add(user);
		Publication publication= new Publication();
		publication.setCode("Code");
		publication.setText("text");
		publication.setTitle("title");
		Comment comment = new Comment();
		comment.setText("hello");
//		userService.addPublication(3,publication);
//		userService.deleteById(3);
		List<User> list = userService.toList();
		user= userService.getById(1);
		PublicationService publicationService = new PublicationService();
		CommentService commentService = new CommentService();
		commentService.add(1,1,"hello");
		List<Comment> commentList=	commentService.toList();
		Comment comments= userService.toList().get(0).getComments().get(0);
		String d;
		return new ModelAndView("home");
	}
}
