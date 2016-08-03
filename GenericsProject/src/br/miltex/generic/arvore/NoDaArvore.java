/**
 * 
 */
package br.miltex.generic.arvore;

/**
 * @author Milton
 *
 */
public class NoDaArvore <T extends Comparable<T>> {
	
	NoDaArvore<T> noEsquerdo;
	NoDaArvore<T> noDireito;
	T dado;
	
	public NoDaArvore(T nodeData){
		dado= nodeData;
		noEsquerdo = noDireito = null;
	}
	//Localiza ponto de inserção e insere novo nó; ignora os valores duplicados
	public void insereNovoNo(T dadoNovoNo){
		//Entra se o primeiro objeto é menorque que o data
		if(dadoNovoNo.compareTo(dado)<0){
			if(noEsquerdo == null){
				noEsquerdo = new NoDaArvore<T>(dadoNovoNo);
			}else{
				noEsquerdo.insereNovoNo(dadoNovoNo);
			}
			//Entra se data é maior que valor a ser inserido
		}else if(dadoNovoNo.compareTo(dado)>0){
			if(noDireito == null){
				noDireito = new NoDaArvore<T>(dadoNovoNo);
			}else{
				noDireito.insereNovoNo(dadoNovoNo);
			}
		}
	}
}
