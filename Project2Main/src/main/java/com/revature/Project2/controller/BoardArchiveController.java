package com.revature.Project2.controller;

import com.revature.Project2.entity.BoardArchive;
import com.revature.Project2.entity.Boards;
import com.revature.Project2.repository.BoardArchiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/")
public class BoardArchiveController {

    @Autowired
    private BoardArchiveRepository boardArchiveRepository;

    @GetMapping("archive")
    public List<BoardArchive> getArchive() {
        return this.boardArchiveRepository.findAll();
    }

}


