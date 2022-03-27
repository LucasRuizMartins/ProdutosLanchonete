package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import entidades.Produto;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Produto> list = new ArrayList<>();
		double conta = 0;
		int opcao = 0;

		/**
		 * Produto lancheCarne = new Produto("Lanche de Carne",0, 20.00); Produto
		 * lancheFrango = new Produto("Lanche de Frango",0, 16.00); Produto refrigerante
		 * = new Produto("Refrigerante",0, 4.00); Produto batata = new Produto("batata
		 * frita",0, 6.00);
		 **/

		System.out.println("faça sua escolha :");

		System.out.println(" 1- Lanche Carne R$ 20.00");
		System.out.println(" 2- Lanche Frango R$16.00");
		System.out.println(" 3- batata frita R$	6.00");
		System.out.println(" 4- refrigerante R$ 4.00");
		System.out.println(" 5- sair");

		opcao = sc.nextInt();

		while (opcao != 5) {
			if (opcao == 1) {
				System.out.println("acrescentar quantos lanches de carne ?");
				int qtd = sc.nextInt();
				list.add(new Produto("Lanche de Carne", qtd, 20.00));
				System.out.println("Acrescentar salada por R$ 2. 00 ? S/N");
				char ch = sc.next().charAt(0);
				if ( Character.toUpperCase(ch) == 'S') {
				list.add(new Produto("salada", 1, 2.00));
				}
				System.out.println("continuar comprando  ?");
				System.out.println(" 2- Lanche Frango R$16.00");
				System.out.println(" 3- batata frita R$	6.00");
				System.out.println(" 4- refrigerante R$ 4.00");
				System.out.println(" 5- sair");
				opcao = sc.nextInt();
			}
			if (opcao == 2) {
				System.out.println("acrescentar quantos lanches de frango ?");
				int qtd = sc.nextInt();
				list.add(new Produto("Lanche de Frango", qtd, 16.00));
				System.out.println("Acrescentar salada por R$ 2. 00 ? S/N");
				char ch = sc.next().charAt(0);
				if ( Character.toUpperCase(ch) == 'S') {
				list.add(new Produto("salada", 1, 2.00));
				}
				System.out.println("continuar comprando  ?");
				System.out.println(" 1- Lanche Carne R$ 20.00");
				System.out.println(" 3- batata frita R$	6.00");
				System.out.println(" 4- refrigerante R$ 4.00");
				System.out.println(" 5- sair");
				opcao = sc.nextInt();
			}
		
		if (opcao == 3) {

			System.out.println("acrescentar quantas porções de batata?");
			int qtd = sc.nextInt();
			list.add(new Produto("batata Frita", qtd, 6.00));
			System.out.println("Acrescentar maionese por R$ 1. 00 ? S/N");
			char ch = sc.next().charAt(0);
			if (ch == 1) {
				list.add(new Produto("maionese", 1, 1.00));
			}
			System.out.println(" 1- Lanche Carne R$ 20.00");
			System.out.println(" 2- Lanche Frango R$16.00");
			System.out.println(" 4- refrigerante R$ 4.00");
			System.out.println(" 5- sair");
			
			opcao = sc.nextInt();
		}

		if (opcao == 4) {
			System.out.println("acrescentar quantos refrigerantes ?");
			int qtd = sc.nextInt();
			list.add(new Produto("refrigerante", qtd, 4.00));
			System.out.println(" 1- Lanche Carne R$ 20.00");
			System.out.println(" 2- Lanche Frango R$16.00");
			System.out.println(" 4- refrigerante R$ 4.00");
			System.out.println(" 5- sair");
			opcao = sc.nextInt();
			
		}
		if (opcao == 5) {
		System.out.println("Certeza que não quer comer nada?");
		System.out.println(" digite 5- para confirmar");
		opcao = sc.nextInt();
		}
		}
		for (Produto p : list) {
			conta = conta + (p.getPreco() * p.getQuantidade());
			System.out.println(p.getNome() + " quantidade: " + p.getQuantidade() + " Preço unidade: " + p.getPreco()
					+ " preço total " + p.getPreco() * p.getQuantidade());
		}
		System.out.println("Total a pagar :" + conta);
		sc.close();
	}

}
