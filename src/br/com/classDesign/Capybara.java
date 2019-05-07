package br.com.classDesign;
//pg283

public class Capybara extends Rodent {
	private String cap="capybara";
	
	private void teste() {
		System.out.println("teste");
	}
	
	public void teste1() {
		System.out.println("teste1");
	}
	
	public static void main(String[] args) {
		try {
			System.out.println("deu certo 1?");
			Rodent rodent = new Rodent();
			Capybara capybara = (Capybara) rodent; // Throws ClassCastException at runtime
			System.out.println("sim");
			System.out.println("att"+capybara.cap);
			capybara.teste();
			System.out.println();
		} catch (ClassCastException e) {
			System.out.println("Erro 1");
		}
		
		try {
			System.out.println("deu certo 2?");
			Rodent rodent = new Capybara();
			Capybara capybara = (Capybara) rodent; 
			System.out.println("sim");
			System.out.println("att - "+capybara.cap);
			capybara.teste();
			System.out.println();
		} catch (ClassCastException e) {
			System.out.println("Erro 2");
		} 
		
		try {
			System.out.println("deu certo 3?");
			Capybara capybara = new Capybara();
			Rodent  rodent= (Rodent) capybara; 
			System.out.println("sim");
			System.out.println("att - "+capybara.cap);
			capybara.teste();
			System.out.println();
		} catch (ClassCastException e) {
			
			System.out.println("Erro 3");
		} 
		
		try {
			System.out.println("deu certo 4?");
			//Capybara capybara = new Rodent(); erro compilador
			Capybara capybara = (Capybara) new Rodent();
			Rodent  rodent= (Rodent) capybara; // Throws ClassCastException at runtime
			System.out.println("sim");
			System.out.println("att"+capybara.cap);
			capybara.teste();
			System.out.println();
		} catch (ClassCastException e) {
			System.out.println("Erro 4");
		} 
		
		try {
			System.out.println("deu certo 5?");
			//Capybara capybara = new Rodent(); erro compilador
			Capybara capybara = (Capybara) new Rodent();
			Rodent  rodent= (Capybara) capybara; // Throws ClassCastException at runtime
			System.out.println("sim");
			System.out.println("att"+capybara.cap);
			capybara.teste();
			System.out.println();
		} catch (ClassCastException e) {
			System.out.println("Erro 5");
		} 
		
	}
}
