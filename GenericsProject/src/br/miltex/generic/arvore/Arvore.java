/**
 * 
 */
package br.miltex.generic.arvore;

/**
 * @author Milton
 *
 */
public class Arvore <T extends Comparable<T>> {

	private NoDaArvore<T> raiz;
	
	public Arvore(){
		this.raiz = null;
	}
	//Insere um novo nó na arvore de pesquisa binária
	public void insereNoNaArvore(T insertValue){
		if(raiz == null){
			raiz = new NoDaArvore<T>(insertValue);
		}else{
			raiz.insereNovoNo(insertValue);
		}
	}
	//Inicia percurso na pré-ordem
	public void preorderTraversal(){
		preorderHelper(raiz);
	}
	//Método recursivo para realizar percurso na pré-ordem
	private void preorderHelper(NoDaArvore<T> node){
		if(node == null){
			return;
		}
		System.out.printf("%s ", node.dado);
		preorderHelper(node.noEsquerdo);
		preorderHelper(node.noDireito);
	}
	//Inicia percurso na ordem
	public void inorderTraversal(){
		inorderHelper(raiz);
	}
	//Método recursivopara realizar percurso na ordem
	private void inorderHelper(NoDaArvore<T> node){
		if(node == null){
			return;
		}
		inorderHelper(node.noEsquerdo);
		System.out.printf("%s ", node.dado);
		inorderHelper(node.noDireito);
	}
	//Inicia percursona pós-ordem
	public void postorderTraversal(){
		postorderHelper(raiz);
	}
	//Método recursivo para realizar percurso na pós-ordem
	private void postorderHelper(NoDaArvore<T> node){
		if(node == null){
			return;
		}
		postorderHelper(node.noEsquerdo);
		postorderHelper(node.noDireito);
		System.out.printf("%s ", node.dado);
	}
}
