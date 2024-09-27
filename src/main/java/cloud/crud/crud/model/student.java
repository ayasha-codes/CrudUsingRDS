package cloud.crud.crud.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private int id;  
    private String name;
    private int age;

}
