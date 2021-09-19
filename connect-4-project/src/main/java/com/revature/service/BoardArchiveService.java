package com.revature.service;

import com.revature.entity.BoardArchive;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BoardArchiveService {
    BoardArchive saveArchive(BoardArchive boardArchive);
    List<BoardArchive> getAllArchive();
}
