package br.com.alura.escola.dominio.aluno;

public class Email {
    //Value Object
    private String email;

    public String getEmail() {
        return email;
    }

    public Email(String email) throws IllegalArgumentException {

        if (email == null || !email.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("E-mail invalido");
        }
        this.email = email;
    }

}


