package br.com.alura.escola.dominio.aluno;

public class CPF {
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public CPF(String cpf) throws IllegalArgumentException {
        if(cpf == null || !cpf.matches("[0-9]{3}+\\.[0-9]{3}+\\.[0-9]{3}+-[0-9]{2}")){
            throw new IllegalArgumentException("CPF invalido");
        }
        this.cpf = cpf;
    }
}
