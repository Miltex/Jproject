/**
 * 
 */
package br.miltex.generic.classe;

import java.util.ArrayList;

/**
 * @author Milton
 * Implementando uma classe generica representando uma estrutura de pilha
 * implementada com um ArrayList.
 */
public class Pilha < T > {

	private ArrayList<T> elementos;
	
	public Pilha(){
		this(10);
	}
	
	public Pilha(int tamanhoPilha){
		int tamPilha = tamanhoPilha > 0 ? tamanhoPilha : 10;
		elementos = new ArrayList<T>(tamPilha);
	}
	
	public void insereNaPilha (T insertPilha){
		elementos.add(insertPilha);
	}
	
	public T retiraDaPilha(){
		if(elementos.isEmpty()){
			throw new EmptyPilhaException("Pilha vazia, não pode retirar");
		}
		return elementos.remove(elementos.size()-1);
	}
	
	@Override
	public String toString() {
		return elementos.toString();
	}
}
