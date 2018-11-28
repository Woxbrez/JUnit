package main;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorProduto {

	private List<Produto> produtos = new ArrayList<Produto>();

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public void adiciona(Produto p) {
		produtos.add(p);
	}
	
	public void limpaLista() {
		produtos.clear();
	}
	
	public void removeProduto(Produto p) {
		produtos.remove(p);
	}
	
	public Produto buscar(int cod) {
		Produto p;
		for(int i = 0; i < produtos.size(); i++) {
			p = produtos.get(i);
			if(p.getCodigo() == cod) {
				return p;
			}
		}
		return null;	
	}
	
	
	
}
