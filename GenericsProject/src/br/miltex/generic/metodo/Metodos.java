/**
 * 
 */
package br.miltex.generic.metodo;

/**
 * @author Milton
 *
 */
public class Metodos {

	/*
	 * Método para imprimir um array generico
	 */
	public static <T> void imprimeArray(T[] array){
		
		for(T elemento:array){
			System.out.printf("%s ",elemento);
		}
	}
	
	/**
	 * Método genérico com limite superior em Comparable, quando um limite não é
	 * especificado o limite e Object.
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	public static <T extends Comparable<T>> T maximo(T x, T y, T z){
	
		T maior = x;
		
		if(y.compareTo(maior)>0 ){
			maior= y;
		}
		if(z.compareTo(maior)>0){
			maior = z;
		}
		
		return maior;
	}
}
