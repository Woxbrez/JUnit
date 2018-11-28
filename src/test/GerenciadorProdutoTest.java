package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import main.GerenciadorProduto;
import main.Produto;

public class GerenciadorProdutoTest {

	@Test
	public void adicionaTest() {
		GerenciadorProduto g = new GerenciadorProduto();
		Produto p = new Produto(01, "Caneta");

		List<Produto> valorEsperado = new ArrayList<Produto>();
		valorEsperado.add(p);

		g.adiciona(p);
		List<Produto> valorRetornado = g.getProdutos();

		Assert.assertEquals(valorEsperado, valorRetornado);
	}

	@Test
	public void limpaListaTest() {
		GerenciadorProduto g = new GerenciadorProduto();
		Produto p = new Produto(02, "Cadeira");
		g.adiciona(p);

		List<Produto> valorEsperado = new ArrayList<Produto>();

		g.limpaLista();
		List<Produto> valorRetornado = g.getProdutos();

		Assert.assertEquals(valorEsperado, valorRetornado);
	}

	@Test
	public void removeProdutoTest() {
		GerenciadorProduto g = new GerenciadorProduto();
		Produto p = new Produto(03, "Mesa");
		g.adiciona(p);

		List<Produto> valorEsperado = new ArrayList<Produto>();

		g.removeProduto(p);
		List<Produto> valorRetornado = g.getProdutos();

		Assert.assertEquals(valorEsperado, valorRetornado);
	}

	@Test
	public void buscarTest() {
		GerenciadorProduto g = new GerenciadorProduto();
		Produto p = new Produto(04, "Mochila");
		g.adiciona(p);
		p = new Produto(03, "Mesa");
		g.adiciona(p);
		p = new Produto(02, "Cadeira");
		g.adiciona(p);
		p = new Produto(01, "Caneta");
		g.adiciona(p);

		Produto valorEsperado = p;

		Produto valorRetornado = g.buscar(01);

		assertEquals(valorEsperado, valorRetornado);
	}
}
