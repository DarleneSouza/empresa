package model;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	private Empresa empresa;
	
	public Funcionario(String nome, String cpf, double salario, Empresa empresa) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.empresa = empresa;
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public double getSalario() {
		return salario;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

}
