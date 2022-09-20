
public class Carrinho {
	int primeiro = 0;

	int ultimo = 0;

	int matricula;

	private Produto[] Lista_Carrinho;


	public Carrinho(int max) {
		Lista_Carrinho = new Produto[max];
	}


	public boolean vazio() {
		return (this.primeiro == this.ultimo);
	}


	public void Inserir(Produto p) {
		if (!vazio() && this.ultimo == this.Lista_Carrinho.length) {
			System.out.println("Lista Cheia....Nao e permitido adicionar outro produto”");
		} 
		else {
			this.Lista_Carrinho[this.ultimo] = p;
			this.ultimo = this.ultimo + 1;
			System.out.println("Produto inserido com sucesso");
		}
	}
	
	public void Retirar(int posicao) {
		if (posicao >= this.Lista_Carrinho.length) {
			System.out.println("Item não encontrado na lista");
		} 
		else {
			System.out.println("Removendo ITEM: " +  this.Lista_Carrinho[posicao]);
			this.Lista_Carrinho[posicao] = null;
			for(int i = posicao; i < Lista_Carrinho.length; i++) {
				if(i < (Lista_Carrinho.length - 1)) {
					this.Lista_Carrinho[i] = this.Lista_Carrinho[i+1];
					this.Lista_Carrinho[i+1] = null;
				}
			}
		}
	}
	
	public void Imprimir() {
		System.out.println("##### IMPRIMINDO LISTA #####");
		for(Produto item : Lista_Carrinho) {
			System.out.println(item);
		}
	}
	
	public void LimparLista() {
		this.Lista_Carrinho = new Produto[this.Lista_Carrinho.length];
	}
}
