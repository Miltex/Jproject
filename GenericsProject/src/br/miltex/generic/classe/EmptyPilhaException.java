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
		this("A pilha est� vazia");
	}
	
	public EmptyPilhaException(String msg){
		super(msg);
	}
}
