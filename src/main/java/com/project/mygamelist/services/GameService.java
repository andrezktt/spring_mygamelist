package com.project.mygamelist.services;

import com.project.mygamelist.dto.GameMinDTO;
import com.project.mygamelist.entities.Game;
import com.project.mygamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(e -> new GameMinDTO(e)).toList();
    }
}
