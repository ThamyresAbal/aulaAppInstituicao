package teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import aluno.Aluno;
import aluno.Especializacao;
import aluno.Graduacao;
import aluno.Instituicao;

public class TestaInstituicao {
	public static void main(String[] args) {
		
		Calendar dtNascimento;
		
		Graduacao g1 = new Graduacao();
		g1.setNome("Joao"); 
		g1.setIdade(20);
		g1.setMensalidade(1500);
		g1.setEmail("joao@joao.com");
		g1.setDataNascimento(dtNascimento);
		
		
		//24/08/1978 às 09:35.

		Graduacao g2 = new Graduacao();
		g2.setNome("Maria");
		g2.setIdade(30);
		g2.setMensalidade(1200);
		g2.setEmail("maria@maria.com");
		g2.setDataNascimento(null);
		
		
		// 01/11/1984 às 12:01.

		Especializacao esp = new Especializacao();
		esp.setNome("José");
		esp.setIdade(40);
		esp.setMensalidade(1000);
		esp.setDataTerminoGraduacao(null);
		//José, 40 anos, 1000 de mensalidade, jose@jose.com e nasceu em 12/12/2012 às 12:12.
		
		List<Aluno> lista = new ArrayList<Aluno>();
		lista.add(g1);// jogando os objetos dentro da lista
		lista.add(g2);
		lista.add(esp);
		
		
		Instituicao instituicao = new Instituicao();
		instituicao.setNome("Infnet");
		instituicao.setEndereco("rua são jose 90 centro");
		// jogar a lista dentro da instituicao
		instituicao.setAlunos(lista);
		//Infnet, rua são jose 90 centro.

	}

}
