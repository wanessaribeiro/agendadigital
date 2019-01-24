package br.com.iftm.dao;

import java.util.List;

import br.com.iftm.entity.PrestadorServico;

public interface PrestadorServicoDAO {

	/**
	 * Método responsável por persistir o objeto {@link PrestadorServico} na base de
	 * dados.
	 * 
	 * @param tipoServico Objeto a ser persistido.
	 * @return Objeto persistido.
	 */
	PrestadorServico create(PrestadorServico prestador);

	/**
	 * Método responsável por recuperar da base de dados todos os objetos
	 * {@link prestadorServico}
	 * 
	 * @return Lista de {@link PrestadorServico}
	 */
	List<PrestadorServico> read();

	/**
	 * Metodo responsavel por persistir (atualizar) na base de dados o objeto
	 * {@link PrestadorServico}.
	 * 
	 * @param prestador Objeto a ser persistido.
	 * @return Objeto persistido
	 */
	PrestadorServico update(PrestadorServico prestador);

	/**
	 * Metodo responsavel por excluir da base de dados o objeto
	 * {@link PrestadorServico} referente ao id informado.
	 * 
	 * @param id Identificador do objeto {@link PrestadorServicos} a ser excluido.
	 */
	void delete(Integer id);
}
