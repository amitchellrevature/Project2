package com.revature.repository;

import com.revature.entity.BoardArchive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardArchiveRepository extends JpaRepository<BoardArchive, Long> {
}
