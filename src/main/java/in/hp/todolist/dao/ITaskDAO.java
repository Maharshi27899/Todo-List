package in.hp.todolist.dao;

import java.util.ArrayList;

import in.hp.todolist.entities.Account;
import in.hp.todolist.entities.Task;

public interface ITaskDAO {

	public Task findTask(Integer taskId);
	
	public Boolean insertTask(Task task);

	public Boolean 	updateTask(Task task);
	
	public ArrayList<Task> getAllTasks(Account account);

}
