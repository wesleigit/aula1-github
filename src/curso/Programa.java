package curso;

import java.util.Locale;
import java.util.Scanner;

import notas.Media;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Media media =new Media();
		
		System.out.println("Nome do Aluno: ");
		media.nome = sc.nextLine();
		
		System.out.println();
		System.out.println("Primeira Nota:");
		media.primeiraNota = sc.nextDouble();
		
		System.out.println();
		System.out.println("Segunda Nota:");
		media.segundaNota = sc.nextDouble();
		
		System.out.println();
		System.out.println("Terceira Nota:");
		media.terceiraNota = sc.nextDouble();
		
		System.out.println();
		System.out.println(media.situacaoDoAluno());
		
		
		
		
		/*
		Produto produto = new Produto();
		System.out.println("Entre com o produto");
		System.out.println("Nome: ");
		produto.nome = sc.nextLine();
		System.out.println("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.println("Quantidade: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println("Produto: " + produto);
		
		System.out.println();
		System.out.println("Entre com a quantidade de produto para adicionar:");
		int quantidade = sc.nextInt();
		produto.adicionarProduto(quantidade);
		
		System.out.println();
		System.out.println("Produto Atualizado: " + produto);
		
		System.out.println();
		System.out.println("Entre com a quantidade de produto para deduzir:");
		
		quantidade = sc.nextInt();
		produto.remorverProduto(quantidade);
		System.out.println();
		System.out.println("Produto Atualizado: " + produto);
		
		*/
		
		
		
		
		
		
		
		sc.close();
	}

}
