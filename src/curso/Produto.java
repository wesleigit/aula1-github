package curso;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;
	
	public double totalEmEstoque() {
		return preco * quantidade;
	}
	
	public void adicionarProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void remorverProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome
				+ ", R$ "
				+ String.format("%.2f", preco)
				+ ", teste "
				+ quantidade 
				+ " unidades, Total: R$ "
				+ String.format("%.2f", totalEmEstoque());
	}

}
