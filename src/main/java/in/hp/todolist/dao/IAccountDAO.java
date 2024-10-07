package in.hp.todolist.dao;

import java.util.ArrayList;

import in.hp.todolist.entities.Account;

public interface IAccountDAO {

	public Account findAccount(String userName);
	
	public Account findAccount(Integer userId);
	
	public Boolean insertAccount(Account account);
	
	public Boolean updateAccount(Account account);
	
	public Boolean changePassword(Account account);
	
	public ArrayList<Account> getAllAccounts();
	
	
	
}
