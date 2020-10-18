package com.jin.tasks.controller;

import com.jin.tasks.result.ResponseResultBody;
import com.jin.tasks.result.ResultException;
import com.jin.tasks.result.ResultStatus;
import com.jin.tasks.service.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.jin.tasks.domain.Task;

@RestController
@RequestMapping("rest/api/v1")
@ResponseResultBody
public class TaskController {

    @Autowired
    private TaskService service;

    @GetMapping("/tasks")
    public List<Task> getAllTask() {
        return service.getAllTask();
    }

    @GetMapping("/tasks/{id}")
    public Task getTaskById(@PathVariable String id) {
        return service.getTaskById(id);
    }

    @DeleteMapping("/tasks/{id}")
    public void removeTaskById(@PathVariable String id) {
        service.removeTaskById(id);
    }

    @DeleteMapping("/tasks")
    public void removeAllTask() {
        service.removeAllTask();
    }

    @PostMapping("/tasks")
    public Task saveTask(@RequestBody Task task) {
        return service.saveTask(task);
    }

    @GetMapping("custom-error")
    public void customError() throws Exception {
        throw new ResultException(ResultStatus.BAD_REQUEST);
    }
}
