package day6_practice;

import java.util.Scanner;

public class Day6_Practice {

	public static void main(String[] args) {
		
		// for문 연습
	    for(int i=1; i<=10; i++) {
	    	System.out.println(i);
	    }
		
	    
	    // 1-10 중에서 2,4,6,8,10만 출력
	    for (int i=2; i<=10; i+=2) {
	    	System.out.println(i);
	    }
	    
	    
	    // 1-10 중에서 1,3,5,7,9만 출력
	    for (int i=1; i<=10; i+=2) {
	    	System.out.println(i);
	    }
	    
	    
	    // for문을 활용한 sum
	    // sum 변수 활용
	    // 1+2+3+4+5+6+7+8+9+10 = 55
	    int sum = 0;
	    for (int i=1; i<=10; i++) {
	        sum += i;
	    }
		System.out.println(sum);
		
		
		// 1+2+3+4+5+6+7+8+9+10=55 출력하는 for문
		int sum1 = 0;
		for (int i=1; i<=10; i++) {
			System.out.print(i); {
				if(i<10) {
					System.out.print("+");
				} else {
					System.out.print("=");
				}
			} sum1 += i;
		}
		System.out.println(sum1);
		
		
		// scanner 활용하여 for문 작성
	    Scanner scan = new Scanner(System.in);
	    int start = 0, end = 0, sum2 = 0;
	    System.out.print("시작값 : ");
	    start = scan.nextInt();
	    System.out.print("끝값 : ");
	    end = scan.nextInt();
	    
	    for (int i=start; i<=end; i++) {
	    	System.out.print(i); {
	    		if(i<end) {
	    			System.out.print("+");
	    		} else {
	    			System.out.print("=");
	    		}
	    	} sum2 += i;
	    }
	    System.out.println(sum2);
	    System.out.println(start+"부터 "+end+"까지의 합은 "+sum2+"입니다.");
	    
	    
	    // 1-100 중에서 3의 배수만 출력
	    for (int i=1; i<=100; i++) {
	    	if(i%3==0) {
	    		System.out.println(i);
	    	} 
	    }
	    
	    scan.close();
	    
	    System.out.println("Hello Git!!");
		
		
		
	}

}
