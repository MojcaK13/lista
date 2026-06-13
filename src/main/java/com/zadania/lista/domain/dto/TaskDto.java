package com.zadania.lista.domain.dto;

import java.time.LocalDate;
import java.util.UUID;

import com.zadania.lista.domain.entity.TaskPriority;
import com.zadania.lista.domain.entity.TaskStatus;

public record TaskDto(
    UUID id,
  String title,
  String description,
  LocalDate dueDate,
  TaskPriority priority,
  TaskStatus status
) {

}
