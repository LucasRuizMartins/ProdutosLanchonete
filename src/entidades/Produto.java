package entidades;

public class Produto {

	String nome;
	int quantidade;
	double preco;

	public Produto() {

	}

	public Produto(int quantidade, double preco) {

		this.quantidade = quantidade;
		this.preco = preco;
	}

	public Produto(String nome, int quantidade, double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco + "]";
	}

	
	public void menu() {
		System.out.println(" 1- Lanche Carne R$ 20.00" );
		System.out.println(" 2- Lanche Frango R$16.00" );
		System.out.println(" 3- batata frita R$	6.00" );
		System.out.println(" 4- refrigerante R$ 4.00" );
		System.out.println(" 5- sair");
		

		
	}
}
