package br.com.s2it.exercicio9;

import java.util.Objects;

public class CalculaArvoreBinaria {

	private BinaryTree binaryTree;

	public CalculaArvoreBinaria(BinaryTree binaryTree) {
		Objects.requireNonNull(binaryTree, "A árvore não pode ser nula");
		this.binaryTree = binaryTree;
	}

	private int soma(BinaryTree binaryTree) {

		if (binaryTree == null) {
			return 0;
		}

		return binaryTree.getValor() + soma(binaryTree.getLeft()) + soma(binaryTree.getRight());
	}
	
}
