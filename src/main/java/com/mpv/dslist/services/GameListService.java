package com.mpv.dslist.services;


import com.mpv.dslist.dto.GameDTO;
import com.mpv.dslist.dto.GameListDTO;
import com.mpv.dslist.dto.GameMinDTO;
import com.mpv.dslist.entities.Game;
import com.mpv.dslist.entities.GameList;
import com.mpv.dslist.repositories.GameListRepository;
import com.mpv.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;


    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();

    }
}


