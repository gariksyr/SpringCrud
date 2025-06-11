package its.fuckin.CRUD.models;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

public class Person {
    private int id;
    @NotEmpty(message = "Name cannot be empty")
    @Size(min = 2, max = 30, message = "Name should contain more than 1 character and less than 30")
    private String name;
    @Min(value = 0, message = "Age cannot be negative")
    @Max(value = 150, message = "You can`t be so old")
    private int age;
    @NotEmpty(message = "Email cannot be empty")
    @Email(message = "Invalid email")
    private String email;

    public Person(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person(){}

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
