package br.com.chap05;

public interface SharkFamily extends HasFins {

	String teste="d";

	public static int getNumberOfFinsdd() {
		return 2;
	}
	public default int getNumberOfFins() {
		return 8;
	}

	public double getLongestFinLength();

//	public boolean doFinsHaveScales() {  // DOES NOT COMPILE default
//	    return false;
//	  }
}
