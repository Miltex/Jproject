/**
 * 
 */
package br.miltex.dominio;

/**
 * @author Milton
 *
 */
public class Aluno {

	private int matricula;
	private String nome;
	private Integer idade;
	
	public Aluno() {
		super();
	}
	
	public Aluno(int mat,String n, Integer anos){
		this.matricula = mat;
		this.nome = n;
		this.idade = anos;
	}

	/**
	 * @return the matricula
	 */
	public int getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the idade
	 */
	public Integer getIdade() {
		return idade;
	}

	/**
	 * @param idade the idade to set
	 */
	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Matricula:"+this.matricula +" Nome:"+this.nome + " Idade:" +this.idade+"]";
	}
}
