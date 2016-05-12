package model;

public class Funcionario extends Pessoa{
	
	protected double salarioBase;
	protected String matricula;
	protected int tempoDeServico;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getTempoDeServico() {
		return tempoDeServico;
	}
	public void setTempoDeServico(int tempoDeServico) {
		this.tempoDeServico = tempoDeServico;
	}
	
	public double computaSalario(){
		return salarioBase;
	}
	
	public Funcionario(String nome, String cpf, double salarioBase, String matricula, int tempoDeServico) {
		super(nome, cpf);
		this.salarioBase = salarioBase;
		this.matricula = matricula;
		this.tempoDeServico = tempoDeServico;
	}
	
	public String toString(){
		return super.toString() + ", Salário Base: "+ ", Matricula: "+ ", Tempo de Serviço: ";
	}
	
}
