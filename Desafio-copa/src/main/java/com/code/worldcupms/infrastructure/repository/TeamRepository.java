package com.code.worldcupms.infrastructure.repository;

import com.code.worldcupms.domain.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
