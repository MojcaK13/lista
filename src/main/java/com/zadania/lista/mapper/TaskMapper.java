package com.zadania.lista.mapper;

import com.zadania.lista.domain.CreateTaskRequest;
import com.zadania.lista.domain.UpdateTaskRequest;
import com.zadania.lista.domain.entity.Task;
import com.zadania.lista.domain.dto.CreateTaskRequestDto;
import com.zadania.lista.domain.dto.UpdateTaskRequestDto;
import com.zadania.lista.domain.dto.TaskDto;

public interface TaskMapper {
    CreateTaskRequest fromDto(CreateTaskRequestDto dto);

  UpdateTaskRequest fromDto(UpdateTaskRequestDto dto);

  TaskDto toDto(Task task);
}
