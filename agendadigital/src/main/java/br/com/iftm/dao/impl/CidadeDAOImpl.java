package br.com.iftm.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.iftm.dao.CidadeDAO;
import br.com.iftm.entity.Cidade;
import br.com.iftm.enums.Estado;

@Repository
public class CidadeDAOImpl implements CidadeDAO{

	private Integer indice = 0;
	private List<Cidade> lista = new ArrayList<Cidade>();
	
	@Override
	public Cidade create(Cidade cidade) {
		
		cidade.setCodigo(indice++);
		lista.add(cidade);
		
		return cidade;
	}

	@Override
	public List<Cidade> read() {
		
		return lista;
	}

	@Override
	public List<Cidade> readByEstado(Estado nome) {
		
		List<Cidade> temp = new ArrayList<>();
		
		for (Cidade cidade : lista) {
			
			if(cidade.getEstado().equals(nome)) {
				
				temp.add(cidade);
			}
		}
		return temp;
	}

	@Override
	public Cidade update(Cidade cidade) {
		
		for(Cidade cidade2 : lista) {
			
			if(cidade2.getCodigo().equals(cidade)) {
				
				cidade2.setNome(cidade.getNome());
			}
		}
		
		return cidade;
	}

	@Override
	public void delete(Integer id) {
		
		for (int i = 0; i < lista.size(); i++) {
			
			if(lista.get(i).getCodigo().equals(id)) {
				
				lista.remove(i);
				break;
			}
		}
		
	}

}
