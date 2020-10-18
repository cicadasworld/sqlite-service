package com.jin.tasks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.jin.tasks.domain.Task;
import com.jin.tasks.repository.TaskRepository;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    public List<Task> getAllTask() {
        return repository.findAllTask();
    }

    public Task getTaskById(String id) {
        return repository.findTaskById(id);
    }

    public void removeAllTask() {
        repository.deleteAll();
    }

    public void removeTaskById(String id) {
        repository.deleteById(id);
    }

    public Task saveTask(Task task) {
        return repository.save(task);
    }
}
