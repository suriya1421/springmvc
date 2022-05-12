package com.chainsys.introduction;

public class Fifth {

	public static void main(String[] args) {
		//printNumbersOneToTen();
		//printNumbersTenToOne();
		// printMatrix();
		 //printTriangle();
		 printTriangleB();
		
		
	}
		public static void printNumbersOneToTen() {
			int count=0;
        for(count=0;count<=10;count++) {
        System.out.println(count);}
 }
		public static void printNumbersTenToOne() {
			int count=0;
        for(count=10;count<=1;count++) {
        System.out.println(count);
        }
        }
		//NESTED FOR LOOP
        public static void printMatrix() {
			int countA=0;
        for(countA=1;countA<=10;countA++) {
        	for(int countB=1;countB<=10;countB++) {
        		System.out.println(countB+" ");
        	}
        
        System.out.println();
        }
        }
        public static void printTriangle() {
     			int countA=0;
             for(countA=1;countA<=10;countA++) {
             	for(int countB=1;countB<=countA;countB++) {
             		System.out.print(countB+" ");
             	}
             
             System.out.println();
             }
             }

				public static void printTriangleB() {
					int countA = 0;
					for (countA = 1; countA <=9; countA++) {
						if (countA < 6) {

							for (int countB = 5; countB >= countA; countB--) {
								System.out.print(" ");
							}

							for (int countC = countA; countC >= 1; countC--) {
								System.out.print(countC);
							}
							for (int countC = 2; countC <= countA; countC++) {
								System.out.print(countC);

							}
						} 
						else {
							for (int count = 0; count <= countA - 5; count++) {
								System.out.print(" ");
							}
							for (int i = 10 - countA; i >= 1; i--) {
								System.out.print(i);
							}
							for (int j = 2; j <= 10 - countA; j++) {
								System.out.print(j);
							}

            	  }
            	  System.out.println("");
              }
              }
              
}
