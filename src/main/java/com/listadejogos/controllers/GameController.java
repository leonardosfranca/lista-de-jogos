package com.listadejogos.controllers;

import com.listadejogos.dto.GameMinDTO;
import com.listadejogos.entities.Game;
import com.listadejogos.service.GameService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    public List<GameMinDTO> listar(Game game) {
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}
