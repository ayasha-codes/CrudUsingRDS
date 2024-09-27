package cloud.crud.crud.service;
import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cloud.crud.crud.model.student;
import cloud.crud.crud.repo.studentRepo;

@Service
public class studentService {

    @Autowired
    private studentRepo studentRepo;

    public List<student> getAll()
    {
        return studentRepo.findAll();
    }

    public void saveData(student student)
    {
        studentRepo.save(student);
    }

    public void deleteData(int id)
    {
        studentRepo.deleteById(id);
    }

    public Optional<student> getById(int id)
    {
        return studentRepo.findById(id);
    }

    public student updatedStudent(int id, student studentDetails)
    {
        student student = studentRepo.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));
        student.setName(studentDetails.getName());
        student.setAge(studentDetails.getAge());
        return studentRepo.save(student);
    }
}
