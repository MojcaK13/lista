package com.zadania.lista.domain;

import java.time.LocalDate;

import com.zadania.lista.domain.entity.TaskPriority;
import com.zadania.lista.domain.entity.TaskStatus;

public record UpdateTaskRequest(
    String title,
  String description,
  LocalDate dueDate,
  TaskStatus status,
  TaskPriority priority
) {

}
