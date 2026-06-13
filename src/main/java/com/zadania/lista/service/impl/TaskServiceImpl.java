package com.zadania.lista.service.impl;

import java.time.Instant;

import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import com.zadania.lista.domain.CreateTaskRequest;
import com.zadania.lista.domain.UpdateTaskRequest;
import com.zadania.lista.domain.entity.TaskStatus;
import com.zadania.lista.repository.TaskRepository;
import com.zadania.lista.service.TaskService;
import com.zadania.lista.domain.entity.Task;
import com.zadania.lista.exception.TaskNotFoundException;
import java.util.List;
import java.util.UUID;

@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;

  public TaskServiceImpl(TaskRepository taskRepository){
    this.taskRepository = taskRepository;
  }

  @Override
  public Task createTask(CreateTaskRequest request) {
    Instant now = Instant.now();

    Task task = new Task(
      null,
      request.title(),
      request.description(),
      request.dueDate(),
      TaskStatus.OPEN,
      request.priority(),
      now,
      now
    );

    return taskRepository.save(task);
  }

  @Override
  public List<Task> listTasks() {
    return taskRepository.findAll(Sort.by(Direction.ASC, "created"));
  }

  @Override
  public Task updateTask(UUID taskId, UpdateTaskRequest request) {
    Task task = taskRepository.findById(taskId)
      .orElseThrow(() -> new TaskNotFoundException(taskId));

    task.setTitle(request.title());
    task.setDescription(request.description());
    task.setDueDate(request.dueDate());
    task.setStatus(request.status());
    task.setPriority(request.priority());
    task.setUpdated(Instant.now());

    return taskRepository.save(task);
  }

  @Override
  public void deleteTask(UUID taskId) {
    taskRepository.deleteById(taskId);
  }
}
