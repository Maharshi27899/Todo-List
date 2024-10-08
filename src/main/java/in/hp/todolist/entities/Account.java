package in.hp.todolist.entities;

import java.sql.Timestamp;

public class Account {

	private Integer accountId;
	private String userName;
	private String firstName;
	private String lastName;
	private String password;
	private Timestamp createdAt;
	private Integer statusId;
	
//	Empty Constructor
	public Account() {
		super();		
	}
	
//	Parameterized Constructor
	public Account(Integer accountId, String userName, String firstName, String lastName, String password,
			Timestamp createdAt, Integer statusId) {
		super();
		this.accountId = accountId;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.createdAt = createdAt;
		this.statusId = statusId;
	}
	
//	Getters & Setters 
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Integer getStatusId() {
		return statusId;
	}
	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}
	
//	ToString
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", userName=" + userName + ", firstName=" + firstName + ", lastName="
				+ lastName + ", password=" + password + ", createdAt=" + createdAt + ", statusId=" + statusId + "]";
	}
	
	
	
}
