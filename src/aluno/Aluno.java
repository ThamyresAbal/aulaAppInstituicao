package aluno;


public abstract class Aluno {
	private String nome;
	private float idade;
	private float mensalidade;
	
	protected void showHeader() {
		System.out.println("Aluno Infnet");
		System.out.printf("O aluno %s tem %d anos e para R$%f",
				nome,
				idade,
				mensalidade
				);
	}
	
	public abstract void exibir();
	
//	public void exibir() {
//		System.out.printf("O aluno %s tem %d anos e para R$%f",
//				nome,
//				idade,
//				mensalidade);
		
//}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getIdade() {
		return idade;
	}
	public void setIdade(float idade) {
		this.idade = idade;
	}
	public float getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}



	
	
	
}
