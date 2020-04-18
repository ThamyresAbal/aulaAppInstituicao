package aluno;

import java.util.List;

import intefaces.IExibido;

public class Instituicao implements IExibido {
	private String nome;
	private String endereco;
	private List <Aluno> alunos;// criando coleções... sempre será como um atributo normal 
		
			
	public void exibir() {
		
	}
	
	public void relatorio() {
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	
	
	

}
