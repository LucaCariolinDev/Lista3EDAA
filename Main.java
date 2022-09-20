public class Main {
	public static void main(String args[]) {
		
		Carrinho carrinho = new Carrinho(10);
		
		Produto p1 = new Produto("Alface", "Alface Lisa", 2, 5);
		Produto p2 = new Produto("Carne moida", "Carne Moida de patinho", 1, 30);
		Produto p3 = new Produto("Leite", "Leite Desnatado", 3, 24);
		Produto p4 = new Produto("Cafe", "Café Premium", 2, 30);
		Produto p5 = new Produto("Pasta de Dente", "Sabor morango", 1, 3);
		Produto p6 = new Produto("Queijo", "Queijo mussarela", 1, 25);
		Produto p7 = new Produto("Sabonete", "Sabonete líquido", 3, 16);
		Produto p8 = new Produto("Shampoo", "Shampoo AntiCaspa", 2, 90);
		Produto p9 = new Produto("Condicionador", "Condicionador Oleoso", 2, 30);
		Produto p10 = new Produto("Escova de Dente", "Escova de dente elétrica", 1, 100);
		
		carrinho.Inserir(p1);
		carrinho.Inserir(p2);
		carrinho.Inserir(p3);
		carrinho.Inserir(p4);
		carrinho.Inserir(p5);
		carrinho.Inserir(p6);
		carrinho.Inserir(p7);
		carrinho.Inserir(p8);
		carrinho.Inserir(p9);
		carrinho.Inserir(p10);
		
		carrinho.Imprimir();
		
		System.out.println("##### Removendo Item 7 da lista #####");
		
		carrinho.Retirar(7);
		
		carrinho.Imprimir();
		
		System.out.println("##### Limpando Lista #####");
		
		carrinho.LimparLista();;
		
		carrinho.Imprimir();
	}
}