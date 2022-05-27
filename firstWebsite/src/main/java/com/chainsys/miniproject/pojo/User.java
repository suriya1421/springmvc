package com.chainsys.miniproject.pojo;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
public class User implements HttpSessionBindingListener {
	private String userId;
	private String password;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	@Override
	public void valueBound(HttpSessionBindingEvent arg0) {
       System.out.println("value bound"+arg0.getName());
       System.out.println("value value"+arg0.getValue().getClass().getName());
	}
	@Override
	public void valueUnbound(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		 System.out.println("value unbound"+arg0.getName());
		
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
