package com.tutorialspoint;

import java.io.Serializable;
import java.util.Collections;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "user")

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String profession;
	private String user_status;
	
	public User(){
		Collections.emptyList();
	}
	
	public User(String name, String profession, String user_status) {
		this.name = name;
		this.profession = profession;
		this.user_status = user_status;
	}
	public int getId() {
		return id;
	}
	@XmlElement
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	public String getProfession() {
		return profession;
	}
	@XmlElement
	public void setProfession(String profession) {
		this.profession = profession;
	}
	@XmlElement
	public void setUserStatus(String user_status) {
		this.user_status = user_status;
	}
	public String getUserStatus() {
		return user_status;
	}
	@Override 
   public boolean equals(Object object){ 
      if(object == null){ 
         return false; 
      }else if(!(object instanceof User)){ 
         return false; 
      }else { 
         User user = (User)object; 
         if(id == user.getId()
            && name.equals(user.getName())
            && profession.equals(user.getProfession())
            && user_status.equals(user.getUserStatus())){ 
               return true; 
         }
      }
      return false; 
   }  
}
