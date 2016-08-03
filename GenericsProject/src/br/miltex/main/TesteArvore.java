/**
 * 
 */
package br.miltex.main;

import java.util.Random;

import br.miltex.generic.arvore.Arvore;

/**
 * @author Milton
 *
 */
public class TesteArvore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Arvore<Integer> arvore = new Arvore<Integer>();
		int valorInserido;
		Random numeroAleatorio = new Random();
		System.out.println("Inserir os seguintes valores");
		
		for(int i =1; i <= 10; i++){
			valorInserido = numeroAleatorio.nextInt(100);
			System.out.printf("%d ", valorInserido);
			arvore.insereNoNaArvore(valorInserido);
		}
		
		System.out.println("\n\nPreorder Traversal");
		arvore.preorderTraversal();
		
		System.out.println("\n\nInorder Traversal");
		arvore.inorderTraversal();
		
		System.out.println("\n\nPostorder traversal");
		arvore.postorderTraversal();
		
		System.out.println();
		
	}

}
