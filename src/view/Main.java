package view;

import model.Empresa;
import model.Funcionario;

public class Main {

	public static void main(String[] args) {
		Empresa youx = new Empresa("Youx","45.107.330/0002-40");
		Funcionario ivam = new Funcionario("Ivam","109.630.250-11",3500,youx);
		Funcionario darlene = new Funcionario("Darlene","103.520.300-15", 2000, youx);
		youx.adicionaFuncionario(ivam);
		youx.adicionaFuncionario(darlene);  
		for(Funcionario funcionario : youx.getFuncionarios() ) {
			System.out.println(
			"\nnome: " +funcionario.getNome()+ 
			"\ncpf: " +funcionario.getCpf()+
			"\nsalario: " +funcionario.getSalario()+
			"\nempresa: " +funcionario.getEmpresa().getNome()+
			"\ncnpj: " +funcionario.getEmpresa().getCnpj());
		}

	}
}
