package br.com.locadora.servicos;

import static br.com.locadora.utils.DataUtils.adicionarDias;

import java.util.Date;

import br.com.locadora.entidades.Filme;
import br.com.locadora.entidades.Locacao;
import br.com.locadora.entidades.Usuario;

public class LocacaoService {
	
	public Locacao alugarFilme(Usuario usuario, Filme filme) {
		Locacao locacao = new Locacao();
		locacao.setFilme(filme);
		locacao.setUsuario(usuario);
		locacao.setDataLocacao(new Date());
		locacao.setValor(filme.getPrecoLocacao());

		//Entrega no dia seguinte
		Date dataEntrega = new Date();
		dataEntrega = adicionarDias(dataEntrega, 1);
		locacao.setDataRetorno(dataEntrega);
		
		return locacao;
	}

}