package model;

public class Programador extends Funcionario {
	
	private String linguagemQuePrograma;
	private String linguagemDePreferencia;
	private String projetoAtual;
	
	public String getLinguagemDePrograma() {
		return linguagemQuePrograma;
	}
	public void setLinguagemDePrograma(String linguagemQuePrograma) {
		this.linguagemQuePrograma = linguagemQuePrograma;
	}
	public String getLinguagemDePreferencia() {
		return linguagemDePreferencia;
	}
	public void setLinguagemDePreferencia(String linguagemDePreferencia) {
		this.linguagemDePreferencia = linguagemDePreferencia;
	}
	public String getProjetoAtual() {
		return projetoAtual;
	}
	public void setProjetoAtual(String projetoAtual) {
		this.projetoAtual = projetoAtual;
	}
	
	public Programador(String nome, String cpf, double salarioBase, String matricula, int tempoDeServico,
			String linguagemQuePrograma, String linguagemDePreferencia, String projetoAtual) {
		super(nome, cpf, salarioBase, matricula, tempoDeServico);
		this.linguagemQuePrograma = linguagemQuePrograma;
		this.linguagemDePreferencia = linguagemDePreferencia;
		this.projetoAtual = projetoAtual;
	}
	
}
