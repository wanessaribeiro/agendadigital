package br.com.iftm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.iftm.business.BusinessException;
import br.com.iftm.business.TipoServicoBusiness;
import br.com.iftm.entity.TipoServico;

@RestController // Habilita Classe como um servico rest
@RequestMapping(value = "/tiposervico") // nome do servico
public class TipoServicoRest {

	private List<TipoServico> lista = new ArrayList<>();
	private TipoServicoBusiness tipoServicoB;
	private int indice = 0;

	// create
	@PostMapping()
	public ResponseEntity<?> create(@RequestBody TipoServico tipoServico) {

		try {

			tipoServico = tipoServicoB.create(tipoServico);
			return ResponseEntity.ok(tipoServico);
		} catch (BusinessException e) {

			e.printStackTrace();
			return ResponseEntity.badRequest().body(e);
		}

	}

	// read
	@GetMapping
	public ResponseEntity<?> read() throws BusinessException {

		return ResponseEntity.ok(tipoServicoB.read());
	}

	// get it by the name
	@GetMapping("/filtro/nome") // não é possivel ter dois metodos iguais, então usamos um path diferente para
								// esse metodo
	public ResponseEntity<?> readByName(@PathParam("nome") String nome) {

		try {

			List<TipoServico> temp = tipoServicoB.readByName(nome);
			return ResponseEntity.ok(temp);
		} catch (BusinessException e) {

			e.printStackTrace();
			return ResponseEntity.badRequest().body(e);
		}

	}

	// update
	@PutMapping
	public ResponseEntity<?> update(@RequestBody TipoServico tipoServico) {

		try {

			tipoServico = tipoServicoB.update(tipoServico);
			return ResponseEntity.ok(tipoServico);
		} catch (BusinessException e) {

			e.printStackTrace();
			return ResponseEntity.badRequest().body(e);
		}
	}

	// delete
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Integer id) {

		try {
			tipoServicoB.delete(id);
			return ResponseEntity.ok().build();
		} catch (BusinessException e) {

			e.printStackTrace();
			return ResponseEntity.badRequest().body(e);
		}

	}

}
