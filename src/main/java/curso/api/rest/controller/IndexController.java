package curso.api.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuario")
public class IndexController {

	@GetMapping(value = "/", produces = "application/json" )
	public ResponseEntity init(@RequestParam(value = "nome", required = true) String nome) {
		System.out.println("Parametro sendo recebido " + nome);
		return new ResponseEntity("Olá Usuario Rest Spring boot seu nome é " + nome, HttpStatus.OK);
	}
}
