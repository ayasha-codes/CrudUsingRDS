package cloud.crud.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import cloud.crud.crud.model.student;
import cloud.crud.crud.service.studentService;

import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/students")
public class studentController {

    @Autowired
    private studentService studentService;
    @GetMapping
    public ResponseEntity<List<student>> getAllData() {
        List<student> students = studentService.getAll();
        return ResponseEntity.ok(students);
    }

    @PostMapping
    public String saveData(@RequestBody student student) {
        studentService.saveData(student);
        return "Data saved successfully";
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<student>> getDataById(@PathVariable int id) {
        Optional<student> students = studentService.getById(id);
        return ResponseEntity.ok(students);
    }
    
    @DeleteMapping("/{id}")
    public String deleteData(@PathVariable int id)
    {
        studentService.deleteData(id);
        return "Data deleted successfully";
    }

    @PutMapping("/{id}")
    public ResponseEntity<student> updateData(@PathVariable int id, @RequestBody student student) {
        student student2 = studentService.updatedStudent(id, student);
        System.out.println("Data updated successfully");
        return ResponseEntity.ok(student2);
    }
}
