package in.hp.todolist.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import in.hp.todolist.dao.ITaskDAO;
import in.hp.todolist.db.utils.DBConnections;

import in.hp.todolist.entities.Account;
import in.hp.todolist.entities.Task;

public class TaskDAOImpl implements ITaskDAO {

//	Connection Variables
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private String sql = null;
	private ResultSet rs = null;
	
	/*
	 * This Constructor will instantiate the connection to the Database
	 * */
	public TaskDAOImpl() {
		conn = DBConnections.getConnection();
	}

	@Override
	public Task findTask(Integer taskId) {
		sql = "SELECT * from TASK where userName = ?";
		Task task = null ;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "userName");
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				task =  new Task();
				task.setTaskId(rs.getInt("task_id"));
				task.setAccountId(rs.getInt("account_id"));;
				task.setDetails(rs.getString("details"));
				task.setStatusId(rs.getInt("status_id"));
				task.setPriorityId(rs.getInt("priority_id"));
				task.setCreateAt(rs.getTimestamp("created_at"));
				task.setDeadline(rs.getTimestamp("deadline"));
				task.setLastUpdate(rs.getTimestamp("last_updated"));
			
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return task;
	}

	@Override
	public Boolean insertTask(Task task) {
		sql = "insert into accounts (task_id, account_id, details , created_at, deadline, last_updated, status_id, priority_id)VALUES(?,?,?,?,?,?,?,?)";
		int rowsAffected = 0;
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Boolean updateTask(Task task) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Task> getAllTasks(Account account) {
		// TODO Auto-generated method stub
		return null;
	}

}
