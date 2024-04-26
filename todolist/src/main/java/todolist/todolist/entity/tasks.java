package todolist.todolist.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "task")
public class tasks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "task_name")
    private String taskName;

    @Column(name="description")
    private String description;

    public tasks(){

    }

    public tasks(int id,String taskName,String description){
        this.id=id;
        this.taskName=taskName;
        this.description=description;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getTaskName(){
        return taskName;
    }

    public void setTaskName(String taskName){
        this.taskName=taskName;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description=description;
    }

    @Override
    public String toString(){
        return "tasks{"+
                "id="+id+
                ",taskName="+taskName+'\''+",description"+description+'\''+'}';

    }
}
