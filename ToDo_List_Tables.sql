create database todo;


use todo;



create table task_priorities(priority_id int primary key, 
								priority varchar(255));

create table task_statuses(status_id int primary key, 
								status varchar(255));

create table account_status(account_status_id int primary key, 
								account_status varchar(255));
                                
create table user_account(account_id int primary key, 
						user_name varchar(255), 
                        first_name varchar(255),
                        last_name varchar(255),
                        password varchar(255),
                        created_at datetime,
                        account_status_id int,
                        foreign key(account_status_id) references account_status(account_status_id));
                        
                        
create table task(task_id int primary key,
					account_id int,
					foreign key(account_id) references user_account(account_id), 
                    details varchar(255),
					created_at datetime,
                    deadline datetime,
                    last_updated datetime,
                    status_id int,
                    priority_id int,
                    foreign key(status_id) references task_statuses(status_id),
                    foreign key(priority_id) references task_priorities(priority_id));


create table account_session(session_id int primary key,
								account_id int,
								foreign key(account_id) references user_account(account_status_id));