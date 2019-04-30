package br.com.chap04;

public class TestingModifiers {

	public static void walk(int start, int... nums) {
		  System.out.println(nums.length);
	}
	
	public static void main(String[] args) {
		System.out.println("i´m in!");
		walk(1); // 0
		walk(1, 2); // 1
		walk(1, 2, 3); // 2
		walk(1, new int[] { 4, 5 }); // 2
	}
}
