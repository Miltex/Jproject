/**
 * 
 */
package br.miltex.main;

import java.util.Arrays;
import java.util.List;

import br.miltex.dominio.Aluno;
import br.miltex.generic.classe.EmptyPilhaException;
import br.miltex.generic.classe.Pilha;

/**
 * @author Milton
 *
 */
public class TestePilhaGenerico {

	/*
	 * Este recurso � conhecido como listas de argumentos de comprimento vari�vel (varargs). 
	 * Um tipo de par�metro seguido por retic�ncias(...) na lista de par�metros indica que o m�todo 
	 * recebe um n�mero vari�vel de argumentos desse tipo particular. No corpo do m�todo, a lista de par�metros 
	 * de tamanho vari�vel � vista como um array (disponibilizando para cada argumento uma posi��o de 
	 * armazenamento).
	 */
	public static void main(String ... args){
		
		Double[] doubleElementos = {1.1,2.2,3.3,4.4,5.5};
		
		Aluno[] alunoElementos = {new Aluno(1, "Roberto", 12),new Aluno(2, "Jos�", 15)};
		
		Pilha<Double> doublePilha = new Pilha<Double>(5);
		Pilha<Aluno> alunosPilha = new Pilha<Aluno>();
		
		System.out.println(soma(Arrays.asList(doubleElementos)));
		
		testaPush(doubleElementos, doublePilha);
		testaPush(alunoElementos, alunosPilha);
		
		testaPop(doublePilha);
		testaPop(alunosPilha);
		
	}
	/**
	 * Metodo generico para testar as opera��es no tipo generico pilha.
	 * Com esse metodo uma pilha de qualquer objeto pode ser passado para os m�todos.
	 * @param pilha
	 */
	public static <T> void testaPop(Pilha<T> pilha){
		
		try {
			T elemento;
			
			while(true){
				elemento = pilha.retiraDaPilha();
				System.out.println(elemento);
			}
		} catch (EmptyPilhaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static <T> void testaPush(T[] elem, Pilha<T> pilha){
		
		for(T e : elem){
			pilha.insereNaPilha(e);
		}
		System.out.println(pilha.toString());
	}
	
	/**
	 * Os curingas permitem especificar par�metros de m�todo, valores de retorno, vari�veis ou campos 
	 * e assim por diante, que atuam como supertipos ou subtipos de tipos parametrizados.
	 * O ponto de '?' representa um tipo desconhecido.
	 * Nesse caso,o curinga estende a classe Number, que significa que o curinga tem um limete superior de Number.
	 * Portanto, o argumento de tipo desconhecido deve ser Number ou uma subclasse de Number.
	 * @param lista
	 * @return
	 */
	public static double soma(List<? extends Number> lista){
		double total = 0;
		for(Number n: lista){
			total += n.doubleValue();
		}
		return total;
	}
}
