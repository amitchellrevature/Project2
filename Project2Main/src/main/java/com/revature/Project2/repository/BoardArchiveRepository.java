package com.revature.Project2.repository;


import com.revature.Project2.entity.BoardArchive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardArchiveRepository extends JpaRepository <BoardArchive,Long> {
}
