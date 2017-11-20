package com.gwedoh.repository;

import com.gwedoh.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {
}
