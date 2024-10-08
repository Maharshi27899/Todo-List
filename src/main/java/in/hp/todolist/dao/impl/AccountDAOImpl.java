package in.hp.todolist.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.hp.todolist.dao.IAccountDAO;
import in.hp.todolist.db.utils.DBConnections;
import in.hp.todolist.entities.Account;

public class AccountDAOImpl implements IAccountDAO {

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private String sql = null;
	private ResultSet rs = null;
	
	
	public AccountDAOImpl() {
		conn = DBConnections.getConnection();
	}

	@Override
	public Account findAccount(String userName) {
		sql = "select * from Accounts where userName = ?";
		Account account = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "userName");
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				account = new Account();
				account.setAccountId(rs.getInt("account_id"));
				account.setUserName(rs.getString("username"));
				account.setFirstName(rs.getString("first_name"));
				account.setLastName(rs.getString("last_name"));
				account.setPassword(rs.getString("password"));
				account.setCreatedAt(rs.getTimestamp("created_at"));
				account.setStatusId(rs.getInt("status_id"));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return account;
	}

	@Override
	public Account findAccount(Integer userId) {
		sql = "select * from Accounts where account_id = ?";
		Account account = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "userName");
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				account = new Account();
				account.setAccountId(rs.getInt("account_id"));
				account.setUserName(rs.getString("username"));
				account.setFirstName(rs.getString("first_name"));
				account.setLastName(rs.getString("last_name"));
				account.setPassword(rs.getString("password"));
				account.setCreatedAt(rs.getTimestamp("created_at"));
				account.setStatusId(rs.getInt("status_id"));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return account;
	}

	@Override
	public Boolean insertAccount(Account account) {
		sql = "insert into accounts (username, first_name,last_name, password)VALUES(?,?,?,?)";
		int affectedRows = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, account.getUserName());
			pstmt.setString(2, account.getFirstName());
			pstmt.setString(3, account.getLastName());
			pstmt.setString(4, account.getPassword());
			
			affectedRows = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return affectedRows > 0;
	}

	@Override
	public Boolean updateAccount(Account account) {
		sql = "UPDATE ACCOUNTS SET first_name = ?, last_name = ?, status_id = ?, WHERE account_id = ?";
		int rowsAffected = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, account.getFirstName());
			pstmt.setString(2, account.getLastName());
			pstmt.setInt(3, account.getStatusId());
			pstmt.setInt(4, account.getAccountId());
			
			rowsAffected = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rowsAffected > 0;
	}

	@Override
	public Boolean changePassword(Account account) {
		sql = "UPDATE ACCOUNTS SET password = ? WHERE account_id = ?";
		int rowsAffected = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, account.getPassword());
			pstmt.setInt(2, account.getAccountId());
			
			rowsAffected = pstmt.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return rowsAffected > 0;
	}

	@Override
	public ArrayList<Account> getAllAccounts() {
		sql = "select * from Accounts where userName = ?";
		List<Account> accounts = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "userName");
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				Account account = new Account();
				account.setAccountId(rs.getInt("account_id"));
				account.setUserName(rs.getString("username"));
				account.setFirstName(rs.getString("first_name"));
				account.setLastName(rs.getString("last_name"));
				account.setPassword(rs.getString("password"));
				account.setCreatedAt(rs.getTimestamp("created_at"));
				account.setStatusId(rs.getInt("status_id"));
				
				accounts.add(account);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return (ArrayList<Account>) accounts;
	}

}
