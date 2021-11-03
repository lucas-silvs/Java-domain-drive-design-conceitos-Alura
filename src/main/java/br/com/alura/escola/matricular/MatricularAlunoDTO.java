package br.com.alura.escola.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.Email;

public class MatricularAlunoDTO {
    private String nomeAluno;
    private String emailAluno;
    private String cpfAluno;

    public MatricularAlunoDTO(String nomeAluno, String emailAluno, String cpfAluno) {
        this.nomeAluno = nomeAluno;
        this.emailAluno = emailAluno;
        this.cpfAluno = cpfAluno;
    }

    public Aluno criarAluno() {
        CPF cpf = new CPF(this.cpfAluno);
        Email email = new Email(this.emailAluno);
        Aluno objAluno = new Aluno(cpf,this.nomeAluno,email);
        return  objAluno;


    }
}
