package com.zadania.lista.domain;

import com.zadania.lista.domain.entity.TaskPriority;
import java.time.LocalDate;

public record CreateTaskRequest(
    String title,
  String description,
  LocalDate dueDate,
  TaskPriority priority
) {

}
