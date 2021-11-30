package com.peterfreitas.pcontrol.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@Entity
public class TipoData {

    @Id
    private Long id;
    private String descricao;

}
