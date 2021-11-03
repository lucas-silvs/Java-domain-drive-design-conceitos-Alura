package br.com.alura.escola.dominio.aluno;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

     @Test
    void naoDeveriaCriarEmailComEnderecosInvalidos(){

         assertThrows(IllegalArgumentException.class, () -> new Email(null));
         assertThrows(IllegalArgumentException.class, () -> new Email(""));
         assertThrows(IllegalArgumentException.class, () -> new Email("EmailInvalido"));
     }
}
