package todolist.todolist.service;

import todolist.todolist.entity.tasks;

import java.util.List;

public interface TaskService {
    List<tasks> findAll();
    tasks save(tasks theTasks);


}
