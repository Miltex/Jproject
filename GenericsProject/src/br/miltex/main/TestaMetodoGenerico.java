/**
 * 
 */
package br.miltex.main;

import br.miltex.generic.metodo.Metodos;

/**
 * @author Milton
 *
 */
public class TestaMetodoGenerico {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//testaImprimirGenerico();
		
		testaMaximoGenerico();
	}
	
	/*
	 * Invoca o m�todo generico maximo para diferentes tipos de objetos, os tipos brutos s�o empacotado pelo
	 * autoboxing
	 */
	private static void testaMaximoGenerico() {
		System.out.printf("O m�ximo de %d, %d e %d � %d \n\n",3,4,5, Metodos.maximo(3, 4, 5));
		
		System.out.printf("O m�ximo de %.1f, %.1f e %.1f � %.1f \n\n", 6.6,7.7,8.8, Metodos.maximo(6.6, 7.7, 8.8));
		
		System.out.printf("O m�ximo de %s, %s e %s � %s\n\n","ma�a","p�ra","laranja", Metodos.maximo("ma�a", "p�ra", "laranja"));
	}

	private static void testaImprimirGenerico() {
		Integer [] inteiros = {1,2,3,4,5,6};
		Double [] decimais = {1.1,2.2,3.3,4.4,5.5,6.6};
		Character [] caracter = {'H','E','L','L','O'};
		
		/*
		 * M�todo imprime array generico. O mesmo m�todo imprime arrays de qualquer
		 * tipo.
		 */
		Metodos.imprimeArray(inteiros);
		System.out.println();
		Metodos.imprimeArray(decimais);
		System.out.println();
		Metodos.imprimeArray(caracter);
	}

}
