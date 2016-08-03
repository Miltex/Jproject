/**
 * 
 */
package br.miltex.generic.classe;

/**
 * @author Milton
 *
 */
public class EmptyPilhaException extends RuntimeException {

	public EmptyPilhaException(){
		this("A pilha está vazia");
	}
	
	public EmptyPilhaException(String msg){
		super(msg);
	}
}
