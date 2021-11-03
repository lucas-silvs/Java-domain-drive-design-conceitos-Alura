package br.com.alura.escola.dominio.aluno;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CpfTest {

     @Test

    void NaoPodeCriarCpfInvalido(){
         assertThrows(IllegalArgumentException.class, () -> new CPF(null));
         assertThrows(IllegalArgumentException.class, () -> new CPF("CPF invalido"));
         assertThrows(IllegalArgumentException.class, () -> new CPF("1234"));
         assertThrows(IllegalArgumentException.class, () -> new CPF("1234567890912"));
         CPF cpfteste = new CPF("123.456.789-89");
     }
}
