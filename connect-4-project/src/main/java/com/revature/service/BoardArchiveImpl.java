package com.revature.service;

import com.revature.entity.BoardArchive;
import com.revature.repository.BoardArchiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardArchiveImpl implements BoardArchiveService {

    @Autowired
    private BoardArchiveRepository repository;

    @Override
    public BoardArchive saveArchive(BoardArchive boardArchive) {
        return repository.save(boardArchive);
    }

    @Override
    public List<BoardArchive> getAllArchive() {
        return repository.findAll();
    }
}
