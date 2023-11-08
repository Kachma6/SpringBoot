package org.proy.service.implement;

import org.proy.domain.Person;
import org.proy.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PersonServiceImplement implements PersonService {
    @Override
    public List<Person> listPeople() {
        List<Person> people = new ArrayList<>();
        people.add(new Person(1,"Karen", "Mancilla"));
        people.add(new Person(2,"Roberto", "Gimenez"));
        return people;
    }
}
