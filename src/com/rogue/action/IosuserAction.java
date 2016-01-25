package com.rogue.action;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.json.simple.JSONObject;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.rogue.entity.Iosuser;
import com.rogue.entity.IosuserExample;
import com.rogue.entity.IosuserExample.Criteria;
import com.rogue.service.*;

@Scope("prototype")
@Controller("iosuserAction")
public class IosuserAction extends ActionSupport {

	public static final long serialVersionUID = 1L;

	@Resource
	private IosuserService iosuserService;
	
	private String usersex;
	private String userage;
	private String interest;
	private String userid;
	private String username;
	private String password;
	
	public void getConnectTest() throws IOException {
		
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("application/json;charset=utf8");
		Writer write = null;
		
		try {
			
			write = response.getWriter();
			write.write("哈哈哈哈");
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} finally {
			
			write.flush();
			write.close();
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public void userLoginAction() throws IOException {
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("application/json;charset=utf8");
		Writer write = null;

		try {
			write = response.getWriter();
			JSONObject js = new JSONObject();
			
			if(username == null || username.replace(" ", "").length() < 4) {
				js.put("status", "fail");
				js.put("obj", "");
				js.put("message", "账号不满足格式");
			} else {
				
				IosuserExample example = new IosuserExample();
				Criteria criteria = example.createCriteria();
				criteria.andUsernameEqualTo(username);
				example.or(criteria);
				List<Iosuser> list = iosuserService.selectByExample(example);
				if(list != null) {
					Iosuser user = list.get(0);
					if(user.getPassword().equals(password)) {
						String dataString = "{\"username\":"+user.getUsername()+",\"intester\":" + user.getInterest() + ",\"userage\":" + user.getUserage() + ",\"usersex\":" + user.getUsersex() + ",\"userid\":" + user.getUserid() + ",\"interest\":" + user.getInterest() + "}";
						js.put("status", "success");
						js.put("obj", dataString);
						js.put("message", "登陆成功");
					} else {
						
						js.put("status", "fail");
						js.put("obj", "");
						js.put("message", "密码错误");
						
					}
				} else {
					
					js.put("status", "fail");
					js.put("obj", "");
					js.put("message", "该账号不存在");
					
				}	
				
			}

			write.write(js.toString());
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} finally {
			
			write.flush();
			write.close();
			
		} 
	}
	
	@SuppressWarnings("unchecked")
	public void getUserWithUserId() throws IOException {
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("application/json;charset=utf8");
		Writer write = null;
		
		Iosuser user = iosuserService.getIosuserByID(userid);
		
		try {
			
			write = response.getWriter();
			JSONObject js = new JSONObject();
			if(user != null) {
				
				String dataString = "{\"username\":"+user.getUsername()+",\"intester\":" + user.getInterest() + ",\"userage\":" + user.getUserage() + ",\"usersex\":" + user.getUsersex() + "}";
				js.put("status", "success");
				js.put("obj", dataString);
				js.put("message", "查询成功");
				
			} else {
				
				js.put("status", "fail");
				js.put("obj", "");
				js.put("message", "没有查找到该数据");
				
			}
			
			write.write(js.toString());
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} finally {
			
			write.flush();
			write.close();
			
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public void deleteUserWithUserId() throws IOException {
		
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("application/json;charset=utf8");
		Writer write = null;
		
		int bool = iosuserService.deleteIosuserByID(userid);
		
		try {
			
			JSONObject js = new JSONObject();
			write = response.getWriter();

			if(bool > 0) {
				
				js.put("obj", "");
				js.put("status", "succes");
				js.put("message", "删除成功");
				
			} else {
				
				js.put("message", "删除数据失败");
				js.put("obj", "");
				js.put("status", "fail");
				
			}
			
			js.put("obj", "");
			write.write(js.toString());
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} finally {
			
			write.flush();
			write.close();
		}
		
	} 
	
	@SuppressWarnings("unchecked")
	public void registerIosuserWithUserInfor() throws IOException {
		
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("application/json;charset=utf8");
		Writer write = null;
		
		Iosuser user = new Iosuser();
		String newUserid = String.valueOf(System.currentTimeMillis());
		user.setUserid(newUserid);
		user.setInterest(interest);
		user.setUserage(userage);
		user.setUsername(username);
		user.setPassword(password);
		user.setUsersex(1);
		
		int bool = iosuserService.insertIosuser(user);
		
		try {
			
			write = response.getWriter();
			JSONObject js = new JSONObject();
			if(bool > 0) {
				
				js.put("status", "success");
				js.put("message", "注册用户成功");
				js.put("obj", "");
				
			} else {
				
				js.put("status", "fail");
				js.put("message", "注册用户失败");
				js.put("obj", "");
				
			}
			
			write.write(js.toString());
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} finally {
			
			write.flush();
			write.close();
		}
		
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsersex() {
		return usersex;
	}

	public void setUsersex(String usersex) {
		this.usersex = usersex;
	}

	public String getUserage() {
		return userage;
	}

	public void setUserage(String userage) {
		this.userage = userage;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
}
