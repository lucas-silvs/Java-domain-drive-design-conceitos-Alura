package br.com.alura.escola.dominio.aluno;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

 class TelefoneTest {

    @Test
     void NaoPodeCriarTelefoneInvalido(){
        assertThrows(IllegalArgumentException.class,() -> new Telefone(null,"123456789") );
        assertThrows(IllegalArgumentException.class,() -> new Telefone("11",null) );
        assertThrows(IllegalArgumentException.class,() -> new Telefone(null,null) );
        assertThrows(IllegalArgumentException.class,() -> new Telefone("11","numero invalido") );
        assertThrows(IllegalArgumentException.class,() -> new Telefone("dddivalido","123456789") );

    Telefone teste = new Telefone("11","123456789");
    }
}
