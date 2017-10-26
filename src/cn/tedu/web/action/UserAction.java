package cn.tedu.web.action;

import cn.tedu.entity.User;
import cn.tedu.service.UserService;
import cn.tedu.service.impl.UserServiceImpl;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{	
	private String name;
	private String password;
	private String telephone;
	private String username;
	private String errorMsg;

	public String register() {
		//1、接受参数
		//2、简单校验(三种方式)
		if (name == null || name.trim().equals("")) {
			errorMsg = "用户名不能为空";
			return "failure";
		}
		if (password == null || password.trim().equals("")) {
			errorMsg = "密码不能为空";
			return "failure";
		}
		//3、调用业务层
		
		UserService userService = new UserServiceImpl();
		User user = new User(name,password,telephone,username);
		userService.register(user);
		//4、返回结果
		return "success";
	}
	public String login() {
		//1、接受参数
		//2、简单校验(三种方式)
		if (name == null || name.trim().equals("")) {
			errorMsg = "用户名不能为空";
			return "failure";
		}
		if (password == null || password.trim().equals("")) {
			errorMsg = "密码不能为空";
			return "failure";
		}
		//3、调用业务层		
		UserService userService = new UserServiceImpl();
		userService.login(name, password);
		//4、返回结果
		return "success";
	}
	public String logout() {
		return null;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}
