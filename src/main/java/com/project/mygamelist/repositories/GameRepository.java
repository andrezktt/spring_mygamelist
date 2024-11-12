package com.project.mygamelist.repositories;

import com.project.mygamelist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
