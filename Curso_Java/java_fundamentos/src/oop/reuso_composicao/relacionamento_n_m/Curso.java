package oop.reuso_composicao.relacionamento_n_m;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    final String nome;
    final List<Aluno> alunos = new ArrayList<>();

    Curso(String nome){
        this.nome = nome;
    }


    // ! objeto curso adiciona no array alunos o aluno passado. Aluno recebe o curso em aluno.cursos.add(this)
    void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }
}
