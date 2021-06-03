package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewResolverController {
	
	//InternalResourceViewResolver
	@RequestMapping("main.do")
	public String main() {
		System.out.println("main() Call");
		return "main";
	}
	
	
	//beanNameViewResolver
	@RequestMapping("findboard.do")
	public String findBoard() {
		System.out.println("findBoard() Call");
		return "board_result";
	}
	
	
	@RequestMapping("findproduct.do")
	public String findProduct() {
		System.out.println("findProduct() Call");
		return "product_result";
	}
	
	
	@RequestMapping("findregister.do")
	public String findRegister() {
		System.out.println("findRegister() Call");
		return "register_result";
	}
	
	
	//TilesviewResolver
	@RequestMapping("tiles.do")
	public String tiles() {
		System.out.println("tiles() Call");
		return "home"; //<definition name="home" extends="base"> 
	}
	@RequestMapping("login.do")
	public String login() {
		System.out.println("login() Call");
		return "login"; //<definition name="login" extends="base"> 
	}
	@RequestMapping("board.do")
	public String board() {
		System.out.println("board() Call");
		return "board"; //<definition name="board" extends="base"> 
	}
	@RequestMapping("register.do")
	public String register() {
		System.out.println("register() Call");
		return "register"; //<definition name="register" extends="base"> 
	}
}
