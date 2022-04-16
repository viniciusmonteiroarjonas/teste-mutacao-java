package br.com.locadora.entidades;

import org.junit.Assert;
import org.junit.Test;

public class UsuarioTest {

    @Test
    public void testEntidadeUsuario() {

        Usuario usuario = new Usuario();
        usuario.setNome("Vinicius Monteiro Arjonas");

        Assert.assertEquals("Vinicius Monteiro Arjonas", usuario.getNome());
    }
}
