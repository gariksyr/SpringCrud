package its.fuckin.CRUD.dao;

import its.fuckin.CRUD.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;
    {
        people = new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT, "Igor"));
        people.add(new Person(++PEOPLE_COUNT, "Zuko"));
        people.add(new Person(++PEOPLE_COUNT, "Elliot"));
        people.add(new Person(++PEOPLE_COUNT, "Alderson"));
    }
    public List<Person> index(){
        return people;
    }
    public Person show(int id){
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
    public void save(Person person){
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }
    public void update(int id, Person person){
        Person personToBeUpdated = show(id);
        personToBeUpdated.setName(person.getName());
    }
    public void delete(int id){
        people.removeIf(p -> p.getId() == id);
    }
}
