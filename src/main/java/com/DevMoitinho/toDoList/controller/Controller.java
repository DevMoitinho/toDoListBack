package com.DevMoitinho.toDoList.controller;
import com.DevMoitinho.toDoList.model.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/tasks")
public class Controller{
    private List<Task> tasks = new ArrayList<Task>();
    private Long nextId = 1L;
       
    @PostMapping
    public Task addTask(@RequestBody Task task){
        task.setId(nextId++);
        for(Task t: tasks){
            if(task.equals(t)){
                return null;
            }
        }
        tasks.add(task);
        return task;
    }
    @GetMapping
    public List<Task> getAllTasks(){
        return tasks;
    }
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id){
        tasks.removeIf(task -> task.getId().equals(id));
    }
}
