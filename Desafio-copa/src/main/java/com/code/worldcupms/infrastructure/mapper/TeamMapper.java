package com.code.worldcupms.infrastructure.mapper;

import com.code.worldcupms.domain.entity.Team;
import com.code.worldcupms.infrastructure.dto.TeamDTO;
import org.springframework.stereotype.Component;

@Component
public class TeamMapper {

    public Team toTeam(TeamDTO teamDTO) {
        Team team = new Team();
        team.setName(teamDTO.getName());

        return team;
    }

    public TeamDTO toTeamDTO(Team team) {
        TeamDTO teamDTO = new TeamDTO();
        teamDTO.setName(team.getName());

        return teamDTO;
    }
}
