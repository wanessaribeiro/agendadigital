package br.com.iftm.dao;

import java.util.List;

import br.com.iftm.entity.Cidade;
import br.com.iftm.enums.Estado;

public interface CidadeDAO {

	/**
	 * Método responsável por persistir o objeto {@link Cidade} na base de dados.
	 * 
	 * @param tipoServico Objeto a ser persistido.
	 * @return Objeto persistido.
	 */
	Cidade create(Cidade cidade);

	/**
	 * Método responsável por recuperar da base de dados todos os objetos
	 * {@link Cidade}
	 * 
	 * @return Lista de {@link Cidade}
	 */
	List<Cidade> read();

	/**
	 * Método responsável por recuperar da base de dados todos os objetos
	 * {@link Cidade}, cujo nome seja igual ao parametro Estado.
	 * 
	 * @param nome Nome a ser buscado
	 * @return Lista de {@link Cidade}
	 */
	List<Cidade> readByEstado(Estado nome);

	/**
	 * Mtodo responsavel por persistir (atualizar) na base de dados o objeto
	 * {@link Cidade}.
	 * 
	 * @param cidade Objeto a ser persistido.
	 * @return Objeto persistido
	 */
	Cidade update(Cidade cidade);

	/**
	 * Metodo responsavel por excluir da base de dados o objeto {@link Cidade}
	 * referente ao id informado.
	 * 
	 * @param id Identificador do objeto {@link Cidade} a ser excluido.
	 */
	void delete(Integer id);

}
