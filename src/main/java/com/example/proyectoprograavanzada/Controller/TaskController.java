package com.example.proyectoprograavanzada.Controller;

import com.example.proyectoprograavanzada.model.Task;
import com.example.proyectoprograavanzada.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("tasks", taskService.findAll());
        return "index";
    }

    @PostMapping("/task")
    public String addTask(@RequestParam String description) {
        taskService.save(new Task(description));
        return "redirect:/";
    }

    @GetMapping("/task/delete")
    public String deleteTask(@RequestParam Long id) {
        taskService.delete(id);
        return "redirect:/";
    }
}
