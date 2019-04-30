package br.com.chap06;

public class Zoo {
	
	static String var;
	
	public static void main(String[] args) {
		try {
			metodoEngana(args);
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.getMessage();
			System.out.println("dd");
			e.printStackTrace();
		}catch (Exception e) {
			
		}
		System.out.println("teste");
	}

	private static void metodoEngana(String[] args) throws RuntimeException{
		try {
			var.length();
		} catch (NullPointerException e) {
			System.out.println(args[0]);
			System.out.println(args[1]);
			e.printStackTrace();
			return;
		} catch (ArrayIndexOutOfBoundsException e) {
			e.getMessage();
			System.out.println("dd");
			e.printStackTrace();
			return;
		}finally {
			System.out.println("teste 1");
			return;
		}
	}
}
