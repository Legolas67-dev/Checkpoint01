package br.com.fiap.jpa;

import java.time.LocalDate;


import br.com.fiap.jpa.entity.Livro;

import br.com.fiap.jpa.service.impl.LivroServiceImpl;

public class App {

	public static void main(String[] args) {
		
		
		LivroServiceImpl livroService = LivroServiceImpl.getInstance();
		
		Livro livro1 = new Livro("Livro 1", "Nicolas", "1111", "edicao 3", LocalDate.of(1980, 1, 1));
		Livro livro2 = new Livro("Livro 2", "Secilio", "222", "edicao 3", LocalDate.of(1990, 1, 1));
		Livro livro3 = new Livro("Livro 3", "Douglas Adams", "2222", "edicao 3", LocalDate.of(2000, 1, 1));
		
		
		livroService.cadastrar(livro1);
		livroService.cadastrar(livro2);
		livroService.cadastrar(livro3);
		
		livroService.listar();
		
		livroService.remover(3L);
		
		livroService.atualizar((new Livro("Livro 2", "Secilio", "333", "edicao 3", LocalDate.of(1990, 1, 1))));
	
		
		
	}
}	
		
