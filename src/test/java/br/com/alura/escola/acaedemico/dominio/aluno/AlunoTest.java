package br.com.alura.escola.acaedemico.dominio.aluno;

import br.com.alura.escola.shared.dominio.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {


    @Test
    void deveraLançarUmaExceptionDeTotalDeNumeroDeTelefonesAlcançadoPorTentarAddNumeroDeTelefone() {
        String ddd = "11";
        String numero = "123456789";
        Telefone telefone = new Telefone(ddd, numero);
        Telefone telefone1 = new Telefone("11", "987654321");
        Telefone telefone2 = new Telefone("11", "123455678");
        CPF cpf = new CPF("123.345.678-98");
        Email email = new Email("teste@email.com");
        Aluno aluno = new Aluno(cpf, "teste", email);
        aluno.adicionarTelefone("11", "123456789");
        aluno.adicionarTelefone("11", "987654321");
        assertThrows(NumerodeTelefonesExcedido.class, () -> aluno.adicionarTelefone("11", "987654321"));


    }

}