package model;

import java.util.List;

public class Coodenador extends Funcionario {
	
	private List<String> projetosQueGerencia;

	public List<String> getProjetos() {
		return projetosQueGerencia;
	}

	public void setProjetos(List<String> projetosQueGerencia) {
		this.projetosQueGerencia = projetosQueGerencia;
	}

	public Coodenador(String nome, String cpf, double salarioBase, String matricula, int tempoDeServico,
			List<String> projetosQueGerencia) {
		super(nome, cpf, salarioBase, matricula, tempoDeServico);
		this.projetosQueGerencia = projetosQueGerencia;
	}
	
	
	
}
