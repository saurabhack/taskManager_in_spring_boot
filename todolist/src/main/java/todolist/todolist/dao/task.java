package todolist.todolist.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import todolist.todolist.entity.tasks;

public interface task extends JpaRepository<tasks,Integer> {

}
