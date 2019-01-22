package br.com.iftm.business;

import java.util.List;

import br.com.iftm.entity.TipoServico;

public interface TipoServicoBusiness {

	/**
	 * Método responsavel por garantir os parametros obrigatorios, bem como
	 * solicitar a camada de acesso a dados que persistam o Objeto.
	 * 
	 * @param tipoServico Objeto a ser persistido
	 * @return Objeto persistido
	 * @throws BusinessException
	 */
	TipoServico create(TipoServico tipoServico) throws BusinessException;

	/**
	 * Metodo responsavel por recuperar da base de dados todos os objetos
	 * {@link TipoServico}
	 * 
	 * @parammnomw Parte do nome a ser buscado.
	 * @return
	 * @throws BusinessException
	 */

	List<TipoServico> read() throws BusinessException;

	/**
	 * Metodo responsavel por recuperar da base de dados todos os objetos
	 * {@link TipoServico}, cujo nome possua parte do parametro Nome.
	 * 
	 * @param nome parte do nome a ser buscado
	 * @return Lista de {@link TipoServico}
	 * @throws BusinessException
	 */

	List<TipoServico> readByName(String nome) throws BusinessException;

	/**
	 * Método responsavel por persitir (atualizar) na base de dados o objeto
	 * 
	 * @param tipoServico Objeto a ser persistido
	 * @return Objeto persistido
	 * @throws BusinessException
	 */

	TipoServico update(TipoServico tipoServico) throws BusinessException;

	/**
	 * Método responsavel por excluir da base de dados o objeto {@link TipoServico}
	 * referente ao id informado
	 * 
	 * @param id que identifica o objeto que será excluido
	 * @throws BusinessException
	 */

	void delete(Integer n) throws BusinessException;
}
