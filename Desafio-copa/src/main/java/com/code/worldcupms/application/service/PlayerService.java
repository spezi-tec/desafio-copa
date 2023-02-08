package com.code.worldcupms.application.service;

import com.code.worldcupms.domain.entity.Player;
import com.code.worldcupms.domain.entity.Team;
import com.code.worldcupms.exception.BadRequestException;
import com.code.worldcupms.infrastructure.dto.PlayerDTO;
import com.code.worldcupms.infrastructure.dto.TeamDTO;
import com.code.worldcupms.infrastructure.mapper.PlayerMapper;
import com.code.worldcupms.infrastructure.mapper.TeamMapper;
import com.code.worldcupms.infrastructure.repository.PlayerRepository;
import com.code.worldcupms.infrastructure.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerService {
    private final PlayerRepository repository;
    private final PlayerMapper mapper;

    public List<Player> listAll() {
        return repository.findAll();
    }

    public Long create(PlayerDTO playerDTO) {

        Player savedPlayer = repository.save(mapper.toPlayer(playerDTO));
        return savedPlayer.getId();
    }

    public Player findById(Long id) {
        return repository.findById(id)
                .orElseThrow( () -> new BadRequestException("Player not found"));
    }

}
