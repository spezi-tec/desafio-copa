package com.code.worldcupms.infrastructure.repository;

import com.code.worldcupms.domain.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
