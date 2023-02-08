package com.code.worldcupms.infrastructure.mapper;

import com.code.worldcupms.domain.entity.Player;
import com.code.worldcupms.domain.entity.Team;
import com.code.worldcupms.infrastructure.dto.PlayerDTO;
import com.code.worldcupms.infrastructure.dto.TeamDTO;
import org.springframework.stereotype.Component;

@Component
public class PlayerMapper {

    public Player toPlayer(PlayerDTO playerDTO) {
        Player player = new Player();
        player.setName(playerDTO.getName());

        return player;
    }

    public PlayerDTO toPlayerDTO(Player player) {
        PlayerDTO playerDTO = new PlayerDTO();
        playerDTO.setName(player.getName());

        return playerDTO;
    }
}
