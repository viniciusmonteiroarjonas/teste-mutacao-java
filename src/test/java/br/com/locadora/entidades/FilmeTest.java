package br.com.locadora.entidades;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class FilmeTest {

    @Test
    public void testEntidadeFilme() {

        Filme filme1 = new Filme();
        filme1.setNome("Titanic");
        filme1.setEstoque(100);
        filme1.setPrecoLocacao(5.00);

        Assert.assertEquals("Titanic", filme1.getNome());
        Assert.assertEquals(100, filme1.getEstoque().intValue());
        Assert.assertEquals(5.00, filme1.getPrecoLocacao(), 0.0);
    }
}
