package com.chainsys.introduction;

public class Fifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printTriangleB();
	}

	public static void hy() {
		int count = 0;
		for (count = 0; count <= 100; count++) {
			System.out.println(count + "");
		}
	}

	public static void printNumbersTentoOne() {
		int count = 0;
		for (count = 10; count >= 1; count--) {
			System.out.println(count + "");
		}
	}

	public static void printMatrix() {
		int countA = 0;
		for (countA = 1; countA <= 2; countA++) {
			for (int countB = 1; countB <= 10; countB++) {
				System.out.print(countB + "\n");
			}
			System.out.println();
		}
	}

	public static void printTriangle() {
		int countA = 0;
		for (countA = 1; countA <= 10; countA++) {
			for (int countB = 1; countB <= countA; countB++) {
				System.out.println(countB + "");
			}
			System.out.println();
		}
	}

	public static void printTriangleB() {
//		int countA = 0;
		for (int countA = 1; countA <= 9; countA++) {
			for (int countB = 9; countB >= countA; countB--) {
				System.out.print(".");
			}
			for (int countC = countA; countC >= 1; countC--)

			{
				System.out.print(countC);
			}
			for (int countD = 2; countD <= countA; countD++) {
				System.out.print(countD);
			}

			System.out.println();
		}
		

     }
}
