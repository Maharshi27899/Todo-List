package in.hp.todolist.dao;

import java.util.ArrayList;

import in.hp.todolist.entities.AccountSession;

public interface IAccountSessionDAO {

	public Boolean insertAccountSession(AccountSession accountSession);

	public Boolean updateAccountSession(AccountSession accountSession);
	
	public AccountSession getAccountSession(Integer sessionId);

	public AccountSession findLastAccountSession(Integer accountId);
	
	public ArrayList<AccountSession> getAllAccountSessions();
	
	
}
