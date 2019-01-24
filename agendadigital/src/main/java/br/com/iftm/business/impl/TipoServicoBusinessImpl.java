package br.com.iftm.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import br.com.iftm.business.BusinessException;
import br.com.iftm.business.TipoServicoBusiness;
import br.com.iftm.dao.TipoServicoDAO;
import br.com.iftm.entity.TipoServico;

@Service
public class TipoServicoBusinessImpl implements TipoServicoBusiness {

	@Autowired
	private TipoServicoDAO dao;

	@Override
	public TipoServico create(TipoServico tipoServico) throws BusinessException {
		if (StringUtils.isEmpty(tipoServico.getNome())) {
			throw new BusinessException("Nome requerido.");
		}

		return dao.create(tipoServico);
	}

	@Override
	public List<TipoServico> read() throws BusinessException {
		return dao.read();
	}

	@Override
	public List<TipoServico> readByName(String nome) throws BusinessException {
		if (StringUtils.isEmpty(nome)) {
			throw new BusinessException("Busca vazia.");
		}
		return dao.readByName(nome);
	}

	@Override
	public TipoServico update(TipoServico tipoServico) throws BusinessException {
		if (tipoServico.getCodigo() == null) {
			throw new BusinessException("Codigo requerido.");
		}

		if (StringUtils.isEmpty(tipoServico.getNome())) {
			throw new BusinessException("Nome requerido.");
		}

		return dao.update(tipoServico);
	}

	@Override
	public void delete(Integer id) throws BusinessException {
		
		if (id == null) {
			throw new BusinessException("Codigo requerido.");
		}

		dao.delete(id);
	}

}
