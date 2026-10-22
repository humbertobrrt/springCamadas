package com.humberto.dev.apiestruturadateste.service;

import com.humberto.dev.apiestruturadateste.entity.Aluno;
import com.humberto.dev.apiestruturadateste.repository.RepositoryAluno;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    public final RepositoryAluno repositorio;


    public AlunoService(RepositoryAluno repositorio) {
        this.repositorio = repositorio;
    }

    public Aluno salvarAluno(Aluno aluno){
        return repositorio.save(aluno);
    }

    public List<Aluno> listarTodos(){
        return  repositorio.findAll();
    }
}

