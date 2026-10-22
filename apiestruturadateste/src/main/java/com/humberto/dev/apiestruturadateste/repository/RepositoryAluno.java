package com.humberto.dev.apiestruturadateste.repository;

import com.humberto.dev.apiestruturadateste.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryAluno extends JpaRepository<Aluno, Integer> {
}
