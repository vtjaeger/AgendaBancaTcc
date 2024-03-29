package com.tcc.dtos.response.apresentacao;

import com.tcc.models.Professor;

import java.time.LocalDateTime;
import java.util.List;

public record ApresentacaoBanca(Long bancaId, String titulo, String integrante1, String integrante2, String integrante3,
                                String orientador, List<String> nomesProfessores, LocalDateTime dataHora) {
}
