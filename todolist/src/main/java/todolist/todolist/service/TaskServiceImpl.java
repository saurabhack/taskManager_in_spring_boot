package todolist.todolist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import todolist.todolist.dao.task;
import todolist.todolist.entity.tasks;

import java.util.List;
@Service
public class TaskServiceImpl implements TaskService {
    private task taskRepository;
    @Autowired
    public TaskServiceImpl(task theTaskRepository){
        taskRepository=theTaskRepository;
    }

    @Override
    public List<tasks> findAll(){
        return taskRepository.findAll();
    }
    @Override
    public tasks save(tasks theTasks ){
        return  taskRepository.save(theTasks);
    }
}
