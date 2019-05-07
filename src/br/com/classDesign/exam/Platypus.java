package br.com.classDesign.exam;

public class Platypus extends Mammals{
	public Platypus(){
		super(3);
		/* se tirar a chamada super deverá 
		 * deverá acrescentar um construtor
		 * sem argumentos na classe Mammals 				
		 */
	
	}
	
	public static void main(String args[]) {
		new Mammals(9);
		
	}
}
