package service;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Human {
    private String name;
    private Integer salary;
    private String id;
    private Integer age;
}
