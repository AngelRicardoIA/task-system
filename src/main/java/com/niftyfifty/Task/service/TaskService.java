package com.niftyfifty.Task.service;

import com.niftyfifty.Task.model.Task;
import com.niftyfifty.Task.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService implements ITaskService{

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> listTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task searchById(Integer idTask) {
        Task task = taskRepository.findById(idTask).orElse(null);
        return task;
    }

    @Override
    public void saveTask(Task task) {
        taskRepository.save(task);
    }

    @Override
    public void deleteTask(Task task) {
        taskRepository.delete(task);
    }
}
