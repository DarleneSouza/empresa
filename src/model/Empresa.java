package model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private String nome;
	private String cnpj;
	private List<Funcionario> funcionarios;
	
	public Empresa(String nome, String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.funcionarios = new ArrayList<Funcionario>();
	}
	public String getNome() {
		return nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public List<Funcionario> getFuncionarios(){
		return funcionarios;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpnj(String cnpj) {
		this.cnpj = cnpj;
	}
	public void adicionaFuncionario(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}
	

}
