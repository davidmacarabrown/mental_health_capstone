package com.codeclan.example.capstoneapi.controllers;

import com.codeclan.example.capstoneapi.models.character.Task;
import com.codeclan.example.capstoneapi.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;

@RestController
public class TaskController {

    @Autowired
    TaskRepository taskRepository;

    @GetMapping(value = "/characters/{id}/tasks")
    public ResponseEntity<List<Task>> getTasks(@PathVariable Long id){
        return new ResponseEntity<>(taskRepository.findByCharacterId(id), HttpStatus.OK);
    }

    @PostMapping(value = "/characters/{id}/tasks")
    public ResponseEntity<Task> saveTask(@RequestBody Task task){
        taskRepository.save(task);
        return new ResponseEntity<>(task, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "characters/{id}/tasks")
    public ResponseEntity deleteTaskByName(@PathVariable String name) {
        taskRepository.deleteByName(name);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PatchMapping(value = "/characters/{id}/tasks/{id}")
    public ResponseEntity<Task> updateTask(@RequestBody Task updatedTask){
        taskRepository.save(updatedTask);
        return new ResponseEntity<>(updatedTask, HttpStatus.OK;
    }
}