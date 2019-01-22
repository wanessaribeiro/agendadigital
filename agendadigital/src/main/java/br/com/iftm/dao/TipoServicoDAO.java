package br.com.iftm.dao;

import java.util.List;

import br.com.iftm.entity.TipoServico;

public interface TipoServicoDAO {

	/**
	 * Metodo responsavel por persistir o objeto {@link TipoServico} na base de dados.
	 * 
	 * @param tipoServico Objeto a ser persistido.
	 * @return Objeto persistido.
	 */
	TipoServico create(TipoServico tipoServico);
	
	/**
	 * Metodo responsavel por recuperar da base de dados todos os objetos 
	 * {@link TipoServico} 
	 * 
	 * @parammnomw Parte do nome a ser buscado.
	 * @return
	 */
	
	List<TipoServico> read();
	
	/**
	  * Metodo responsavel por recuperar da base de dados todos os objetos 
	 * {@link TipoServico}, cujo nome possua parte do parametro Nome.
	 * @param nome parte do nome a ser buscado
	 * @return Lista de {@link TipoServico}
	 */
	
	List<TipoServico> readByName(String nome);
	
	/**
	 * Método responsavel por persitir (atualizar) na base de dados o objeto 
	 * @param tipoServico Objeto a ser persistido
	 * @return Objeto persistido
	 */
	
	TipoServico update(TipoServico tipoServico);
	
	/**
	 * Método responsavel por excluir da base de dados o objeto {@link TipoServico}
	 * referente ao id informado
	 * @param id que identifica o objeto que será excluido
	 */
	void delete(Integer id);
}
