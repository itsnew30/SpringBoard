package com.ezen.spring.vo;

/*
 UserVO-> UserService (getUser, join) -> UserServiceImpl 
 -> UserDAO -> UserServiceTest(join, getUser 기능테스트) 아이디를 계속 변경해가면서 해야함
 */
public class UserVO {
	private String id;
	private String pwd;
	private String name;
	private String role;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "UserVO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", role=" + role + "]";
	}
	
	
	
	
	
}
