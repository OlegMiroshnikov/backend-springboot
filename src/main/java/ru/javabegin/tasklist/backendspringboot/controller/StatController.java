package ru.javabegin.tasklist.backendspringboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.javabegin.tasklist.backendspringboot.entity.Stat;
import ru.javabegin.tasklist.backendspringboot.service.StatService;
import ru.javabegin.tasklist.backendspringboot.util.MyLogger;

@RestController
public class StatController {

    private final StatService statService;
    public StatController(StatService statService) {
        this.statService = statService;
    }

    private final Long defaultId = 1l;

    @GetMapping("/stat")
    public ResponseEntity<Stat> findById() {
        MyLogger.showMethodName("StatController: findById() ---------------------------------------------------------- ");
        return  ResponseEntity.ok(statService.findById(defaultId));
    }

}
