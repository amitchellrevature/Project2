package com.revature.controller;

import com.revature.entity.BoardArchive;
import com.revature.service.BoardArchiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class BoardArchiveController {

    @Autowired
    private BoardArchiveService service;

    @PostMapping("/board_archive")
    public BoardArchive saveArchive(@RequestBody BoardArchive boardArchive) { return service.saveArchive(boardArchive); }

    @GetMapping("/board_archive")
    public List<BoardArchive> getAllArchive() {
        return service.getAllArchive();
    }
}
