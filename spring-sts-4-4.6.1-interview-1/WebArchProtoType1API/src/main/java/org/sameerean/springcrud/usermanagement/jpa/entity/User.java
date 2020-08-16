package org.sameerean.springcrud.usermanagement.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String pid;

	private String userName;
	private String firstName;
	private String lastName;
	private String profileURL;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String pid, String userName, String firstName, String lastName,
			String profileURL) {
		super();
		this.pid = pid;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.profileURL = profileURL;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getProfileURL() {
		return profileURL;
	}

	public void setProfileURL(String profileURL) {
		this.profileURL = profileURL;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", pid=" + pid + ", userName=" + userName
				+ ", firstName=" + firstName + ", lastName=" + lastName
				+ ", profileURL=" + profileURL + "]";
	}

}
