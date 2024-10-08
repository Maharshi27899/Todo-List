package in.hp.todolist.entities;

import java.sql.Timestamp;

public class Task {

	private Integer taskId;
	private Integer accountId;
	private String details;
	private Integer statusId;
	private Integer priorityId;
	private Timestamp createAt;
	private Timestamp deadline;
	private Timestamp lastUpdate;
	
//	Empty Constructor
	public Task() {
		super();
	}
	
//	Parameterized Constructor
	public Task(Integer taskId, Integer accountId, String details, Integer statusId, Integer priorityId,
			Timestamp createAt, Timestamp deadline, Timestamp lastUpdate) {
		super();
		this.taskId = taskId;
		this.accountId = accountId;
		this.details = details;
		this.statusId = statusId;
		this.priorityId = priorityId;
		this.createAt = createAt;
		this.deadline = deadline;
		this.lastUpdate = lastUpdate;
	}
	
//	Getters & Setters 
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Integer getStatusId() {
		return statusId;
	}
	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}
	public Integer getPriorityId() {
		return priorityId;
	}
	public void setPriorityId(Integer priorityId) {
		this.priorityId = priorityId;
	}
	public Timestamp getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Timestamp createAt) {
		this.createAt = createAt;
	}
	public Timestamp getDeadline() {
		return deadline;
	}
	public void setDeadline(Timestamp deadline) {
		this.deadline = deadline;
	}
	public Timestamp getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	
//	ToString
	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", accountId=" + accountId + ", details=" + details + ", statusId=" + statusId
				+ ", priorityId=" + priorityId + ", createAt=" + createAt + ", deadline=" + deadline + ", lastUpdate="
				+ lastUpdate + "]";
	}
	
	
}
