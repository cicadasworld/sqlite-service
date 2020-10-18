INSERT INTO task (task_id,task_name)
VALUES ('297e656474b7286f0174bc0cd53f2ab4','测试入库任务');
INSERT INTO task (task_id,task_name)
VALUES ('297e656474c1933d0174c22b55c9052d','测试用数据');

INSERT INTO sub_task (sub_task_id,sub_task_name,sub_task_step, task_id)
VALUES ('0201','测试用数据1入库',1,'297e656474b7286f0174bc0cd53f2ab4');
INSERT INTO sub_task (sub_task_id,sub_task_name,sub_task_step, task_id)
VALUES ('0205','测试用数据2入库',1,'297e656474c1933d0174c22b55c9052d');