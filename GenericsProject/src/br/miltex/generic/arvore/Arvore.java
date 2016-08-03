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
	//Insere um novo n� na arvore de pesquisa bin�ria
	public void insereNoNaArvore(T insertValue){
		if(raiz == null){
			raiz = new NoDaArvore<T>(insertValue);
		}else{
			raiz.insereNovoNo(insertValue);
		}
	}
	//Inicia percurso na pr�-ordem
	public void preorderTraversal(){
		preorderHelper(raiz);
	}
	//M�todo recursivo para realizar percurso na pr�-ordem
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
	//M�todo recursivopara realizar percurso na ordem
	private void inorderHelper(NoDaArvore<T> node){
		if(node == null){
			return;
		}
		inorderHelper(node.noEsquerdo);
		System.out.printf("%s ", node.dado);
		inorderHelper(node.noDireito);
	}
	//Inicia percursona p�s-ordem
	public void postorderTraversal(){
		postorderHelper(raiz);
	}
	//M�todo recursivo para realizar percurso na p�s-ordem
	private void postorderHelper(NoDaArvore<T> node){
		if(node == null){
			return;
		}
		postorderHelper(node.noEsquerdo);
		postorderHelper(node.noDireito);
		System.out.printf("%s ", node.dado);
	}
}
