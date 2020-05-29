package ru.javabegin.tasklist.backendspringboot.service;

import org.springframework.stereotype.Service;
import ru.javabegin.tasklist.backendspringboot.entity.Priority;
import ru.javabegin.tasklist.backendspringboot.repo.PriorityRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PriorityService {

    private final PriorityRepository repository;
    public PriorityService(PriorityRepository repository) {
        this.repository = repository;
    }

    public List<Priority> findAll() {
        return repository.findAllByOrderByIdAsc();
    }

    public Priority add(Priority priority) {
        return repository.save(priority);
    }

    public Priority update(Priority priority){
        return repository.save(priority);
    }

    public void deleteById(Long id){
        repository.deleteById(id);
    }

    public Priority findById(Long id){
        return repository.findById(id).get(); // т.к. возвращается Optional - нужно получить объект методом get()
    }

    public List<Priority> findByTitle(String text){
        return repository.findByTitle(text);
    }

}
