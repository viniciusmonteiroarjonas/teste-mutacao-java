package br.com.locadora.servicos;

import br.com.locadora.entidades.Filme;
import br.com.locadora.entidades.Locacao;
import br.com.locadora.entidades.Usuario;
import br.com.locadora.utils.DataUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class LocacaoServiceTest {

    @Test
    public void test() {

        // Cenário
        LocacaoService service = new LocacaoService();
        Usuario usuario = new Usuario("Vinicius Monteiro Arjonas");
        Filme filme = new Filme("Gladiador", 2,  5.0);

        // Ação alugar filme
        Locacao locacao = service.alugarFilme(usuario, filme);

        // Validação teste With Assert
        Assert.assertTrue(locacao.getValor() == 5.0);
        Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
        Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)));

    }
}
