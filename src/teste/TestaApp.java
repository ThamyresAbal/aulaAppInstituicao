package teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import aluno.Aluno;

public class TestaApp {

		public static void main(String[] args) {
			System.out.println("AppLast");
			
			int qtde = Integer.valueOf(args[0]);
			
			Scanner ler = new Scanner(System.in);
			
			List<Aluno> alunos = new ArrayList<Aluno>();
//			
//			String[] nomes = new String[qtde];
//			List<String> listaNomes = new ArrayList <String>();
			
			
			
//			int[] idades = new int[qtde];
//			List<Integer> listaIdades = new ArrayList <Integer>();
//			
//			float[] mensalidades = new float[qtde];
//			List<Float> listaMensalidade = new ArrayList <Float>();
//			
			for (int i = 0; i < qtde; i++) {
				Aluno a = new Aluno();
				
				System.out.println("Informe o nome do aluno:");
//				nomes[i] = ler.next();
//				listaNomes.add(ler.next());
				alunos.add(a);
				a.setNome(ler.next());
				
				System.out.println("Informe a idade do aluno:");
//				idades[i] = ler.nextInt();
//				listaIdades.add(ler.nextInt());
				a.setIdade(ler.nextInt());
				
				System.out.println("Informe a mensalidade do aluno:");
//				mensalidades[i] = ler.nextFloat();
//				listaMensalidade.add(ler.nextFloat());
				a.setMensalidade(ler.nextFloat());
				
			}
			for(Aluno aluno : alunos) {
				
				aluno.exibir();
//				System.out.printf("O aluno %s tem %d anos e paga R$%.2f\n",
//						aluno.getNome(),
//						aluno.getIdade(),
//						aluno.getMensalidade()
//					);
				
			}
			
//			for (int i = 0; i < qtde; i++) {
//				System.out.printf("O aluno %s tem %d anos e paga R$%.2f\n",
//						nomes[i],
//						idades[i],
//						mensalidades[i]
//					);
//				System.out.printf("O aluno %s tem %d anos e paga R$%.2f\n",
//						listaNomes.get(i),
//						listaIdades.get(i),
//						listaMensalidade.get(i)
//					);
//			}
		}
	}

