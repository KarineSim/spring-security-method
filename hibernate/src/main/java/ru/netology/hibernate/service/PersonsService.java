package ru.netology.hibernate.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netology.hibernate.entity.Persons;
import ru.netology.hibernate.repository.PersonsRepository;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class PersonsService {

    private final PersonsRepository personsRepository;

    public List<Persons> findByCityOfLiving(String city) {
        return personsRepository.findByCityOfLiving(city);
    }

    public List<Persons> findByPersonsPrimaryKeyAgeLessThanOrderByPersonsPrimaryKeyAge(int age) {
        return personsRepository.findByPersonsPrimaryKeyAgeLessThanOrderByPersonsPrimaryKeyAge(age);
    }

    public Optional<List<Persons>> findByPersonsPrimaryKeyNameAndPersonsPrimaryKeySurname(String name, String surname) {
        return personsRepository.findByPersonsPrimaryKeyNameAndPersonsPrimaryKeySurname(name, surname);
    }
}
