package com.zadania.lista.mapper.impl;

import org.springframework.stereotype.Component;

import com.zadania.lista.domain.CreateTaskRequest;
import com.zadania.lista.domain.UpdateTaskRequest;
import com.zadania.lista.domain.dto.CreateTaskRequestDto;
import com.zadania.lista.domain.dto.TaskDto;
import com.zadania.lista.domain.dto.UpdateTaskRequestDto;
import com.zadania.lista.mapper.TaskMapper;
import com.zadania.lista.domain.entity.Task;

@Component
public class TaskMapperImpl implements TaskMapper {
     @Override
  public CreateTaskRequest fromDto(CreateTaskRequestDto dto) {
    return new CreateTaskRequest(
      dto.title(),
      dto.description(),
      dto.dueDate(),
      dto.priority()
    );
  }

  @Override
  public UpdateTaskRequest fromDto(UpdateTaskRequestDto dto) {
    return new UpdateTaskRequest(
      dto.title(),
      dto.description(),
      dto.dueDate(),
      dto.status(),
      dto.priority()
    );
  }

  @Override
  public TaskDto toDto(Task task) {
    return new TaskDto(
      task.getId(),
      task.getTitle(),
      task.getDescription(),
      task.getDueDate(),
      task.getPriority(),
      task.getStatus()
    );
  }
}
