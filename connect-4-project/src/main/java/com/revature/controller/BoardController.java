package com.revature.controller;

import com.revature.entity.Board;
import com.revature.service.BoardService;
import com.revature.entity.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class BoardController {

    @Autowired
    private BoardService service;

    @PostMapping("/board")
    public Board saveBoard(@RequestBody Board board) {
        return service.saveBoard(board);
    }

    @GetMapping("/board/{id}")
    public Board getBoardById(@PathVariable("id") long id) {
        return service.getBoardById(id);
    }

    @GetMapping("/board")
    public Board getNewBoard(@RequestBody Team team) { return service.getNewBoard(team); }

    @GetMapping("/board/{player1}")
    public List<Board> getBoardsByColor(@PathVariable("player1") long player1) { return service.getBoardsByColor(player1);}

    @PutMapping("/board/{id}/{slot}")
    public Board updateBoard(@PathVariable("id") long id, @PathVariable int slot) {
        return service.updateBoard(id, slot);
    }
}
