package cloud.crud.crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cloud.crud.crud.model.student;

public interface studentRepo extends JpaRepository<student,Integer>   {
    
}
