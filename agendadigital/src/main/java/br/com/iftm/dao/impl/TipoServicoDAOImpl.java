package br.com.iftm.dao.impl;

import java.util.ArrayList;
import java.util.List;

import br.com.iftm.dao.TipoServicoDAO;
import br.com.iftm.entity.TipoServico;

public class TipoServicoDAOImpl implements TipoServicoDAO {

	private List<TipoServico> lista = new ArrayList<TipoServico>();
	int indice = 0;

	@Override
	public TipoServico create(TipoServico tipoServico) {

		tipoServico.setCodigo(indice++);

		lista.add(tipoServico);

		return tipoServico;
	}

	@Override
	public List<TipoServico> read() {

		return lista;
	}

	@Override
	public List<TipoServico> readByName(String nome) {

		List<TipoServico> temp = new ArrayList<>();

		for (int i = 0; i < lista.size(); i++) {

			if (lista.get(i).getNome().toLowerCase().contains(nome.toLowerCase())) {

				temp.add(lista.get(i));
			}
		}

		return temp;
	}

	@Override
	public TipoServico update(TipoServico tipoServico) {

		for (TipoServico tipoServico2 : lista) {

			if (tipoServico2.getCodigo().equals(tipoServico.getCodigo())) {

				tipoServico2.setNome(tipoServico.getNome());
			}
		}

		return tipoServico;
	}

	@Override
	public void delete(Integer id) {

		for (int i = 0; i <= lista.size(); i++) {

			if (id.equals(lista.get(i).getCodigo())) {

				lista.remove(i);
				break;

			}
		}

	}

}
