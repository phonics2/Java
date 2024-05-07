package pre5;

import java.util.*;

public class Pre5 {
	
	public void a1() {
		int[] nums = new int[10];
		for(int i = 0; i <nums.length; i++) {
			nums[i] = i+1;
			System.out.print(nums[i]+" ");
		}
	}
	
	public void a2() {
		int[] nums = new int[10];
		for(int i = 0; i<nums.length; i++) {
			//1을 빼는것이 아닌 최대길이에서 증감연산자인 i 를 빼준다.
			nums[i] = nums.length-i;
			System.out.print(nums[i]+" ");
		}
	}
	
	public void a3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		int[] nums = new int[num];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = i+1;
			System.out.print(nums[i]+" ");
		}
	}
	
	public void a4() {
		String[] 과일 = {"사과","귤","포도","복숭아","참외"};
		System.out.println(과일[1]);
	}
	
	public void a5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String 문자열 = sc.next();
		System.out.print("문자 : ");
		char 문자 = sc.next().charAt(0);
		char[] 쪼갬 = 문자열.toCharArray();
		char search = 문자;
		for(char a : 쪼갬) {
			
		}
		System.out.println(문자열+"에 "+문자+" 가 존재하는 위치(인덱스) : ");
		System.out.println(문자 + " 개수 : ");

		
		
	}
	
	public void a6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("0~6 숫자 : ");
		int num = sc.nextInt();
		String[] 요일 = {"월","화","수","목","금","토","일"};
		switch(num) {
		case 0:
			System.out.println(요일[num]+"요일");
			break;
		case 1:
			System.out.println(요일[num]+"요일");
			break;
		case 2:
			System.out.println(요일[num]+"요일");
			break;
		case 3:
			System.out.println(요일[num]+"요일");
			break;
		case 4:
			System.out.println(요일[num]+"요일");
			break;
		case 5:
			System.out.println(요일[num]+"요일");
			break;
		case 6:
			System.out.println(요일[num]+"요일");
			break;
		default :
			System.out.println("잘못입력.");
			return;
		}
	}
	
	public void a7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int num = sc.nextInt();
		int[] nums = new int[num];
		
		for(int i = 0; i< num; i++) {
			System.out.print("배열" +i+"번째 인덱스 : ");
			nums[i] = sc.nextInt();
		}
		int result = 0;
		for(int a : nums) {
			result += a;
		}
		System.out.println(result);
		
	}
	
	public void a9() {
		int[] nums = new int[6];
		for(int i = 0; i <nums.length; i++) {
			nums[i] = (int)(Math.random()*45+1);
			System.out.print(nums[i]+" ");
		}
	}
	
	public void a10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 -포함 : ");
		String jumin = sc.next();
		char[] 복사본 = jumin.toCharArray();
		//뒷자리 1부터 다 *로 처리 하기 위해 인데스 값을 8로 설정.
		for(int i = 8; i < 복사본.length; i++) {
			//*로 설정하기 위해 '*'; 을 변수선언 해줌
			char a = '*';
			//복사본[8] 인덱스부터 쭉 *로 변경해서 저장함.
			복사본[i] = a;
			
		}
		//for문 밖에 최종 주민번호 출력.
		System.out.println(복사본);
	}
	
	public void a11() {
		int[] nums = new int[10];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random()*10+1);
			System.out.print(nums[i]+" ");
		}
	}
	
	
	public void a13() {
		HashSet<Integer> set = new HashSet<>();
		Random rd = new Random();
		
		while(set.size()<10) {
			set.add(rd.nextInt(10)+1);

		}

		
	}
	
	public void a15() {
		Scanner sc = new Scanner(System.in);
		HashSet<Character> set = new HashSet<>();
		System.out.print("문자열 : ");
		String 문자열 = sc.nextLine();
		char[] a = 문자열.toCharArray();
		
		for(char b : a) {
			set.add(b);
		}
		System.out.println("문자열에 있는 문자 : " +set);
		System.out.println("문자개수 : " + set.size());
	}
	
	public void a16() {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> 어레이 = new ArrayList<>();
		System.out.print("배열 크기 : ");
		int num = sc.nextInt();
		sc.nextLine();// 버퍼 없애 줘야함

		for(int i = 0; i < num; i++) {
			System.out.print((i+1)+"번째 문자열 : ");
			String 문자열 = sc.nextLine();
			어레이.add(문자열);
		}	
		String choice;
		do {
			System.out.print("더입력? : ");
			choice = sc.nextLine();
			if(choice.equalsIgnoreCase("y")) {
				System.out.print("더 입력개수 : ");
				int num2 = sc.nextInt();
				sc.nextLine();
				for(int i = 0; i< num2; i++) {
					System.out.print((num+i+1)+"번째 문자열 : ");
					String 문자열 = sc.nextLine();
					어레이.add(문자열);
				}
			}
		} while(choice.equalsIgnoreCase("y")); {
			sc.close();
			System.out.println(어레이);
		}
			
		
		}
	
		
	
	
	public static void main(String[] args) {
		Pre5 a = new Pre5();
		//a.a1();
		//a.a2();
		//a.a3();
		//a.a4();
		//a.a5();
		//a.a6();
		//a.a7();
		//a.a9();
		//a.a10();
		//a.a11();
		//a.a13();
		//a.a15();
		a.a16();
		
		
		
	}
}
