package br.com.iftm.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import br.com.iftm.business.BusinessException;
import br.com.iftm.business.PrestadorServicoBusiness;
import br.com.iftm.dao.PrestadorServicoDAO;
import br.com.iftm.entity.PrestadorServico;
import br.com.iftm.entity.Telefone;
import br.com.iftm.entity.TipoServico;

@Service
public class PrestadorServicoBusinessImpl implements PrestadorServicoBusiness {

	@Autowired
	private PrestadorServicoDAO dao;

	@Override
	public PrestadorServico create(PrestadorServico prestador) throws BusinessException {

		if (StringUtils.isEmpty(prestador.getNome())) {
			throw new BusinessException("Nome requerido.");
		}

		if (StringUtils.isEmpty(prestador.getCep())) {
			throw new BusinessException("CEP requerido.");
		}

		if (StringUtils.isEmpty(prestador.getLogradouro())) {
			throw new BusinessException("Logradouro requerido.");
		}

		if (prestador.getTipoLogradouro() == null) {
			throw new BusinessException("Tipo do logradouro requerido.");
		}

		if (prestador.getCidade() == null || prestador.getCidade().getCodigo() == null) {
			throw new BusinessException("Cidade requerida.");
		}

		if (prestador.getTelefone() == null) {
			throw new BusinessException("Telefone requerido.");
		}

		if (prestador.getTelefone().isEmpty()) {
			throw new BusinessException("Telefone requerido.");
		}

		for (Telefone telefone : prestador.getTelefone()) {

			if (telefone.getDdd() == null) {

				throw new BusinessException("DDD requerido!");
			}

			if (telefone.getNumero() == null) {

				throw new BusinessException("Pelo menos um numero de telefone requerido!");
			}
		}

		if (prestador.getTipoServico() == null) {
			throw new BusinessException("Tipo de serviço requerido.");
		}

		if (StringUtils.isEmpty(prestador.getTipoServico())) {
			throw new BusinessException("Pelo menos um serviço requerido.");
		}

		for (TipoServico tipoServico : prestador.getTipoServico()) {

			if (tipoServico.getNome() == null) {

				throw new BusinessException("Nome do serviço requerido!");
			}
		}

		return dao.create(prestador);
	}

	@Override
	public List<PrestadorServico> read() throws BusinessException {

		return dao.read();
	}

	@Override
	public PrestadorServico update(PrestadorServico prestador) throws BusinessException {

		if (prestador.getCodigo() == null) {
			throw new BusinessException("Codigo requerido.");
		}

		if (StringUtils.isEmpty(prestador.getNome())) {
			throw new BusinessException("Nome requerido.");
		}

		if (StringUtils.isEmpty(prestador.getCep())) {
			throw new BusinessException("CEP requerido.");
		}

		if (StringUtils.isEmpty(prestador.getLogradouro())) {
			throw new BusinessException("Logradouro requerido.");
		}

		if (prestador.getTipoLogradouro() == null) {
			throw new BusinessException("Tipo do logradouro requerido.");
		}

		if (prestador.getCidade() == null) {
			throw new BusinessException("Cidade requerida.");
		}

		if (StringUtils.isEmpty(prestador.getNome())) {
			throw new BusinessException("Nome requerido.");
		}

		return dao.update(prestador);
	}

	@Override
	public void delete(Integer id) throws BusinessException {

		if (id == null) {
			throw new BusinessException("Codigo requerido.");
		}

		dao.delete(id);

	}

}
