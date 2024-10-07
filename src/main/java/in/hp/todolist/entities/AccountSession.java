package in.hp.todolist.entities;

import java.sql.Timestamp;

public class AccountSession {

	private Integer sessionId;
	private Integer accountId;
	private Timestamp sessionCreated;
	private Timestamp lastAccessed;
	private Timestamp sessionEnd;
	public AccountSession() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccountSession(Integer sessionId, Integer accountId, Timestamp sessionCreated, Timestamp lastAccessed,
			Timestamp sessionEnd) {
		super();
		this.sessionId = sessionId;
		this.accountId = accountId;
		this.sessionCreated = sessionCreated;
		this.lastAccessed = lastAccessed;
		this.sessionEnd = sessionEnd;
	}
	public Integer getSessionId() {
		return sessionId;
	}
	public void setSessionId(Integer sessionId) {
		this.sessionId = sessionId;
	}
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public Timestamp getSessionCreated() {
		return sessionCreated;
	}
	public void setSessionCreated(Timestamp sessionCreated) {
		this.sessionCreated = sessionCreated;
	}
	public Timestamp getLastAccessed() {
		return lastAccessed;
	}
	public void setLastAccessed(Timestamp lastAccessed) {
		this.lastAccessed = lastAccessed;
	}
	public Timestamp getSessionEnd() {
		return sessionEnd;
	}
	public void setSessionEnd(Timestamp sessionEnd) {
		this.sessionEnd = sessionEnd;
	}
	
	
}
