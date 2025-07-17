package com.mpv.dslist.repositories;

import com.mpv.dslist.entities.Game;
import com.mpv.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository <GameList, Long>{
}
