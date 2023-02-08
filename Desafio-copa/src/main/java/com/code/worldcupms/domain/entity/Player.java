package com.code.worldcupms.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Getter
@Setter
public class Player {
    @Id
    private Long id;

    @NotBlank(message = "The player name must not to be null.")
    private String name;
}
