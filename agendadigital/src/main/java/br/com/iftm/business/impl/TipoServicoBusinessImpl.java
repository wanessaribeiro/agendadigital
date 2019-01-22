package br.com.iftm.business.impl;

import java.util.List;

import org.springframework.util.StringUtils;

import br.com.iftm.business.BusinessException;
import br.com.iftm.business.TipoServicoBusiness;
import br.com.iftm.dao.TipoServicoDAO;
import br.com.iftm.entity.TipoServico;

public class TipoServicoBusinessImpl implements TipoServicoBusiness {

	private TipoServicoDAO dao;

	@Override
	public TipoServico create(TipoServico tipoServico) throws BusinessException {

		if (StringUtils.isEmpty(tipoServico.getNome())) {

			throw new BusinessException("Nome Requerido");
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

			throw new BusinessException("Nome Requerido");
		}

		return dao.readByName(nome);
	}

	@Override
	public TipoServico update(TipoServico tipoServico) throws BusinessException {

		if (StringUtils.isEmpty(tipoServico.getNome())) {

			throw new BusinessException("Nome Requerido");
		}

		if (tipoServico.getCodigo() == null) {

			throw new BusinessException("Codigo Requerido!");
		}

		return dao.update(tipoServico);
	}

	@Override
	public void delete(Integer n) throws BusinessException {

		if (n == null) {

			throw new BusinessException("Codigo Requerido!");
		}

		dao.delete(n);

	}

}
