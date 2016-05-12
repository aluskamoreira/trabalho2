package model;

public class FuncionarioAdministrativo extends Funcionario {
	
	private int funcao;

	public int getFuncao() {
		return funcao;
	}

	public void setFuncao(int funcao) {
		this.funcao = funcao;
	}

	public FuncionarioAdministrativo(String nome, String cpf, double salarioBase, String matricula, int tempoDeServico,
			int funcao) {
		super(nome, cpf, salarioBase, matricula, tempoDeServico);
		this.funcao = funcao;
	}
	
	
	
}
