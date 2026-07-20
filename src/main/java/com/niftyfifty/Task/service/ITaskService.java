package com.niftyfifty.Task.service;

import com.niftyfifty.Task.model.Task;

import java.util.List;

public interface ITaskService {
    public List<Task> listTasks();

    public Task searchById(Integer idTask);

    public void saveTask(Task task);

    public void deleteTask(Task task);
}
