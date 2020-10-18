--
-- Table structure for table `task`
--
DROP TABLE IF EXISTS `task`;
CREATE TABLE IF NOT EXISTS "task" (
	"task_id"	        varchar,
	"task_name"	        varchar,
	"task_create_date"	varchar,
	"task_type"	        varchar,
	"task_state"	        varchar,
	"result_data_source"	varchar,
	"remark"	        varchar,
	"task_result_descr"	varchar,
	"task_start_time"	    varchar,
	"task_end_time"	    varchar,
	PRIMARY KEY("task_id")
);

--
-- Table structure for table `subtask`
--
DROP TABLE IF EXISTS `sub_task`;
CREATE TABLE IF NOT EXISTS "sub_task" (
	"sub_task_id"	        varchar,
	"sub_task_name"	    varchar,
	"sub_task_step"	    integer,
	"task_state"	        varchar,
	"task_state_code"	    varchar,
	"current_user"	    varchar,
	"state_date"	        varchar,
	"task_state_english"	varchar,
	"task_id"	        varchar,
	PRIMARY KEY("sub_task_id")
);