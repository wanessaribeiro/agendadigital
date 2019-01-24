package br.com.iftm.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.iftm.dao.PrestadorServicoDAO;
import br.com.iftm.entity.PrestadorServico;

@Repository
public class PrestadorServicoDAOImpl implements PrestadorServicoDAO {

	private int indice = 0;
	private List<PrestadorServico> lista = new ArrayList<PrestadorServico>();

	@Override
	public PrestadorServico create(PrestadorServico prestador) {

		prestador.setCodigo(indice++);
		lista.add(prestador);

		return prestador;
	}

	@Override
	public List<PrestadorServico> read() {

		return lista;
	}

	@Override
	public PrestadorServico update(PrestadorServico prestador) {

		for (PrestadorServico prestador2 : lista) {
			if (prestador2.getCodigo().equals(prestador.getCodigo())) {
				prestador2.setNome(prestador.getNome());
				prestador2.setCidade(prestador.getCidade());
				prestador2.setBairro(prestador.getBairro());
				prestador2.setCep(prestador.getCep());
				prestador2.setTipoLogradouro(prestador.getTipoLogradouro());
				prestador2.setLogradouro(prestador.getLogradouro());
				prestador2.setComplemento(prestador.getComplemento());
				prestador2.setNumero(prestador.getNumero());
				prestador2.setEmail(prestador.getEmail());
				prestador2.setTipoServico(prestador.getTipoServico());
				prestador2.setTelefone(prestador.getTelefone());
			}
		}

		return prestador;
	}

	@Override
	public void delete(Integer id) {

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getCodigo().equals(id)) {
				lista.remove(i);
				break;
			}
		}
	}

}
