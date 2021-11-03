package br.com.alura.escola.matricular;


import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {
    private final RepositorioDeAlunos repositorio;

    public MatricularAluno(RepositorioDeAlunos repositorio) {
        this.repositorio = repositorio;
    }

    public void realizaMAtricula(MatricularAlunoDTO alunoDTO){
        Aluno novo = alunoDTO.criarAluno();
        repositorio.matricular(novo);


    }
}
