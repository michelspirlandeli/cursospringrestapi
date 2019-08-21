package curso.api.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import curso.api.rest.model.Usuario;

@RestController
@RequestMapping(value = "/usuario")
public class IndexController {

//	@GetMapping(value = "/", produces = "application/json" )
//	public ResponseEntity init(@RequestParam(value = "nome", required = true, defaultValue= "Nome não informado") String nome) {
//		System.out.println("Parametro sendo recebido " + nome);
//		return new ResponseEntity("Olá Usuario Rest Spring boot seu nome é " + nome, HttpStatus.OK);
//	}
	
	@GetMapping(value = "/", produces = "application/json" )
	public ResponseEntity<Usuario> start() {
		Usuario usuario = new Usuario();
		usuario.setId(50L);
		usuario.setNome("michel");
		usuario.setLogin("admin");
		usuario.setSenha("458574");
		
		Usuario usuario2 = new Usuario();
		usuario2.setId(50L);
		usuario2.setNome("michel");
		usuario2.setLogin("admin");
		usuario2.setSenha("458574");
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(usuario);
		usuarios.add(usuario2);
		
		return new  ResponseEntity(usuarios, HttpStatus.OK);
	}
	
	
}
