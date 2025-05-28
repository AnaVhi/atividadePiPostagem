package controllers;

import java.util.Date;
import java.util.List;

import models.Postagem;
import play.mvc.Controller;

public class Postagens extends Controller{
	
	public static void listar() {
		List<Postagem> lista = Postagem.findAll();
		render(lista);
	}
	public static void form() {
		render();
	}
	
		public static void salvar(Postagem a) {
			if (a.titulo != null) {
				a.titulo = a.titulo;
		    }
			
			if (a.conteudo != null) {
				a.conteudo = a.conteudo;
		    }
			
			if (a.autor != null) {
			a.autor = a.autor;
		    }
			if(a.data!=null) {
			a.data = a.data;
			}
		a.save();
		listar();
	}
	public static void remover(long id) {
		Postagem postagem = Postagem.findById(id);
		postagem.delete();
		listar();
		}
	

}
