package ru.javabegin.tasklist.backendspringboot.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.javabegin.tasklist.backendspringboot.entity.Stat;

@Repository
public interface StatRepository extends CrudRepository<Stat, Long> {
}
