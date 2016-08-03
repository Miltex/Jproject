/**
 * 
 */
package br.miltex.main;

import br.miltex.dominio.Aluno;
import br.miltex.generic.classe.EmptyPilhaException;
import br.miltex.generic.classe.Pilha;

/**
 * @author Milton
 *
 */
public class TestaPilha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double[] doubleElementos = {1.1,2.2,3.3,4.4,5.5};
		
		Aluno[] alunoElementos = {new Aluno(1, "Roberto", 12),new Aluno(2, "José", 15)};
		
		Pilha<Double> doublePilha = new Pilha<Double>(5);
		Pilha<Aluno> alunosPilha = new Pilha<Aluno>();
		
		testPushDouble(doublePilha,doubleElementos);
		testPopDouble(doublePilha);
		
		testPushAlunos(alunosPilha,alunoElementos);
		testPopAlunos(alunosPilha);

	}
	
	private static void testPopAlunos(Pilha<Aluno> alunosPilha) {
		try {
			System.out.println("\n Retirando elementos da pilha");
			Aluno popValue;
			
			while(true){
				popValue = alunosPilha.retiraDaPilha();
				System.out.printf(popValue.toString());
			}
		} catch (EmptyPilhaException e) {
			System.out.println();
			e.printStackTrace();
		}
		
	}

	private static void testPushAlunos(Pilha<Aluno> alunosPilha, Aluno[] alunoElementos) {
		System.out.println("Colocando elementos na pilha");
		
		for(Aluno value: alunoElementos){
			System.out.printf( value.toString());
			alunosPilha.insereNaPilha(value);
		}
//		System.out.println(alunosPilha.toString());
		
	}

	public static void testPushDouble(Pilha<Double> stack, double [] values){
		System.out.println("Colocando elementos na pilha");
		
		for(double value: values){
			System.out.printf("%.1f ", value);
			stack.insereNaPilha(value);
		}
	//	System.out.println(stack.toString());
	}
	
	public static void testPopDouble(Pilha<Double> stack){
		
		try {
			System.out.println("\n Retirando elementos da pilha");
			double popValue;
			
			while(true){
				popValue = stack.retiraDaPilha();
				System.out.printf("%.1f ", popValue);
			}
		} catch (EmptyPilhaException e) {
			System.out.println();
			e.printStackTrace();
		}
	}
}
