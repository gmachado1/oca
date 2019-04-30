package br.com.chap04;

public class MouseHouse {
	private final int volume;
	private final String name = "The Mouse House";
	private static final int teste;
	
	public MouseHouse(int length, int width, int height) {
		volume = length * width * height;
	}
	static{
		teste = 0;
	}
	
	public static void main(String args[]) {
		MouseHouse m = new MouseHouse(0,0, 2);
		System.out.println(m.toString());
	}

	@Override
	public String toString() {
		return "MouseHouse [volume=" + volume + ", name=" + name + "]";
	}
	
}
