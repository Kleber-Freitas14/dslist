package com.mpv.dslist.repositories;

import com.mpv.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository <Game, Long>{
}
