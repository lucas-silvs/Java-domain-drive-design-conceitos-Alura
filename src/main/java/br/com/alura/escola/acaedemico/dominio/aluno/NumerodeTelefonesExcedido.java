package br.com.alura.escola.acaedemico.dominio.aluno;

public class NumerodeTelefonesExcedido extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public NumerodeTelefonesExcedido() {
        super("quantidade total de telefones já alcançada");
    }
}
