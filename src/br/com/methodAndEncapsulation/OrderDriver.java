package br.com.methodAndEncapsulation;

class Order {
	static String result = "";
	{
		result += "c";
	}
	static {
		result += "u";
	}
	{
		result += "r";
	}
}

public class OrderDriver {
	public static void main(String[] args) {
		System.out.print(Order.result + " 1");
		System.out.print(Order.result + " 2");
		new Order();
		new Order();
		System.out.print(Order.result + " 3");
	}
}
