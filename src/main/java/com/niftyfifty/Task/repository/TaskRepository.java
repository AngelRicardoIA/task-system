package com.niftyfifty.Task.repository;

import com.niftyfifty.Task.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {

}
