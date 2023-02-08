package com.code.worldcupms.interfaces.http.controller;

import com.code.worldcupms.application.service.PlayerService;
import com.code.worldcupms.application.service.TeamService;
import com.code.worldcupms.domain.entity.Player;
import com.code.worldcupms.domain.entity.Team;
import com.code.worldcupms.infrastructure.dto.PlayerDTO;
import com.code.worldcupms.infrastructure.dto.TeamDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/worldcup")
@RequiredArgsConstructor
public class WorldCupController {
    private final TeamService teamService;
    private final PlayerService playerService;

    //Team controller
    @GetMapping("/all")
    public ResponseEntity<List<Team>> list() {
        return ResponseEntity.ok(teamService.listAll());
    }

    @GetMapping("/{id}")
    private ResponseEntity<Team> getById(@PathVariable Long id) {
        return ResponseEntity.ok(teamService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody TeamDTO teamDTO) {
        Long savedId = teamService.create(teamDTO);
        //retorna o endpoint do dado salvo
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedId)
                .toUri();

        return ResponseEntity.created(location).build();
    }

    //player controller
    @GetMapping("/all")
    public ResponseEntity<List<Player>> listAllPlayers() {
        return ResponseEntity.ok(playerService.listAll());
    }

    @GetMapping("/{id}")
    private ResponseEntity<Player> getPlayerById(@PathVariable Long id) {
        return ResponseEntity.ok(playerService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Void> savePlayer(@RequestBody PlayerDTO playerDTO) {
        Long savedId = playerService.create(playerDTO);
        //retorna o endpoint do dado salvo
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedId)
                .toUri();

        return ResponseEntity.created(location).build();
    }
}
