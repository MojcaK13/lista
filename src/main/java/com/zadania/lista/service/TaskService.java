package com.zadania.lista.service;

import com.zadania.lista.domain.CreateTaskRequest;
import com.zadania.lista.domain.UpdateTaskRequest;
import com.zadania.lista.domain.entity.Task;
import java.util.List;
import java.util.UUID;

public interface TaskService {
  Task createTask(CreateTaskRequest request);

  List<Task> listTasks();

  Task updateTask(UUID taskId, UpdateTaskRequest request);

  void deleteTask(UUID taskId);
}
