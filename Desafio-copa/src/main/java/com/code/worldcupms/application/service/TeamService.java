package com.code.worldcupms.application.service;

import com.code.worldcupms.domain.entity.Team;
import com.code.worldcupms.exception.BadRequestException;
import com.code.worldcupms.infrastructure.dto.TeamDTO;
import com.code.worldcupms.infrastructure.mapper.TeamMapper;
import com.code.worldcupms.infrastructure.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamService {
    private final TeamRepository repository;
    private final TeamMapper mapper;

    public List<Team> listAll() {
        return repository.findAll();
    }

    public Long create(TeamDTO teamDTO) {

        Team savedTeam = repository.save(mapper.toTeam(teamDTO));
        return savedTeam.getId();
    }

    public Team findById(Long id) {
        return repository.findById(id)
                .orElseThrow( () -> new BadRequestException("Team not found"));
    }

}
