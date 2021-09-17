package com.revature.Project2.repository;


import com.revature.Project2.entity.Boards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardsRepository extends JpaRepository<Boards,Long> {
}
