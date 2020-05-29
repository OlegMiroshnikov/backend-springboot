package ru.javabegin.tasklist.backendspringboot.service;

import org.springframework.stereotype.Service;
import ru.javabegin.tasklist.backendspringboot.entity.Stat;
import ru.javabegin.tasklist.backendspringboot.repo.StatRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class StatService {

    private final StatRepository repository;
    public StatService(StatRepository repository) {
        this.repository = repository;
    }

    public Stat findById(Long id){
        return repository.findById(id).get();
    }


}

