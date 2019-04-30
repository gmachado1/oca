import java.util.Arrays;
public class Wte {
	
	int x = y;
	static int y=10;
	public static void main(String[] args) throws Exception{
		System.out.println(y);
		System.out.println(new Wte().x);
		
		int[][] ints = new int[2][4];
		
		Arrays.sort(ints[1]);
		System.out.println(Arrays.toString(ints[1]));
		int x=5,y=10;
	
		for (int i = 0; i < 3; System.out.println(i=4)) {
			System.out.println(i+"<");
		}
		
		try {
			y/=x;
			throw new Exception();
		}catch (Exception e) {
			System.out.println("erro");
			throw e;
		}finally {
			System.out.println("fim");
		}
		
	
	}

	static {
		y=15;
	}
}
