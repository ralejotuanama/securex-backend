package com.securex.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.securex.model.Persona;
import com.securex.repo.IGenericRepo;
import com.securex.repo.IPersonaRepo;
import com.securex.service.IPersonaService;

@Service
public class PersonaServiceImpl extends CRUDImpl<Persona, Integer> implements IPersonaService{

	@Autowired
	private IPersonaRepo repo;
	
	@Override
	protected IGenericRepo<Persona, Integer> getRepo(){
		return repo;
	}

	@Override
	public Page<Persona> listarPageable(Pageable pageable) {
		return repo.findAll(pageable);
	}
	
	/*@Override
	public Persona registrar(Persona obj) {
		return repo.save(obj);
	}

	@Override
	public Persona modificar(Persona obj) {
		return repo.save(obj);
	}	

	@Override
	public List<Persona> listar() {
		return repo.findAll();
	}

	@Override
	public Persona listarPorId(Integer id) {
		Optional<Persona> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Persona();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
		
	}*/

}
