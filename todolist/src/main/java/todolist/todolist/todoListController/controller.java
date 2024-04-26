package todolist.todolist.todoListController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import todolist.todolist.dao.task;
import todolist.todolist.entity.tasks;
import todolist.todolist.service.TaskService;

import java.util.List;

@Controller
public class controller {

    @Autowired
    private task repo;
    private TaskService taskService;
    public controller(TaskService theTaskService){
        taskService=theTaskService;
    }
    @GetMapping("/")
    public String first(Model theModel){
        tasks theTask=new tasks();
        List<tasks> taskses = taskService.findAll();
        theModel.addAttribute("task",theTask);
        theModel.addAttribute("tasks",taskses);
        return "index";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute("task") tasks theTasks){
        taskService.save(theTasks);
        return "redirect:/";
    }

    @GetMapping("/complete")
    public String complete(@RequestParam int id){
        tasks Task=repo.findById(id).get();
        repo.delete(Task);
        return "redirect:/";
    }
    @GetMapping("/edit")
    public String edit(@RequestParam int id, Model theModel , @ModelAttribute("task") tasks theTasks){
        tasks Task= repo.findById(id).get();
        theModel.addAttribute("taskse",Task);
        return "taskeditor";
    }

    @PostMapping("/update")
    public String update(@RequestParam int id , Model theModel, @ModelAttribute("task") tasks theTask){
        tasks Task=repo.findById(id).get();
        theModel.addAttribute("taskse",Task);
        repo.save(theTask);
        return "redirect:/";
    }


}
