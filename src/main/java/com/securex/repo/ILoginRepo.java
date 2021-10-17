package com.securex.repo;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.securex.model.Usuario;

public interface ILoginRepo extends IGenericRepo<Usuario, Integer>{

	@Query("FROM Usuario us where us.username =:usuario")
	Usuario verificarNombreUsuario(@Param("usuario")String usuario);
	
	
}
