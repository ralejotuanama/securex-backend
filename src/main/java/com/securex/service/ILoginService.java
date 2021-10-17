package com.securex.service;

import com.securex.model.Usuario;

public interface ILoginService {

	Usuario verificarNombreUsuario(String usuario);
	
}
