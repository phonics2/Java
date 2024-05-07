import java.util.Scanner;

public class VariableScan {

	public static void main(String[] args) {
		
		// 사용자에게 입력받을 공간을 생성
		// Scanner를 이용해서 입력받은 내용을 컴퓨터에 표시해줌
		// System.in 사용해서 키보드 입력을 읽어올 때 사용
		// Scanner 자료형 자리에 int나 String이나 실수 boolean값을
		// 확정지어서 나타낼 수 없기 때문에 초기에는 Scanner라고 사용함.
		// nextLine() : 문자 또는 엔터를 치기 전까지는 문장 전체를 입력 받는다.
		// 입력된 문자를 모두 다 가져온다.(ex 띄어쓰기, 특수문자 등 모두 가져옴)
		Scanner sc = new Scanner(System.in);
		System.out.println("사용자의 이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println(name);
		
		System.out.println("사용자의 사는 곳을 입력하세요");
		String live = sc.nextLine();
		System.out.println(live);
		
		System.out.println("사용자의 핸드폰번호 를 입력하세요");
		String phonenumber = sc.nextLine();
		System.out.println(phonenumber);
		
		//Scanner String 을 사용해서
		// 사용자의 키, 사용자의 나이, 사용자의 닉네임을 입력받기
		
		//사용자의 키 String height
		System.out.print("사용자의 키를 입력하세요 : ");
		String height = sc.nextLine();
		System.out.println(height);
		//사용자의 나의 String age
		System.out.print("사용자의 나이를 입력하세요 : ");
		String age = sc.nextLine();
		System.out.print(age);
		//사용자의 닉네임 String nickname
		System.out.print("사용자의 닉네임을 입력하세요 : ");
		String nickname = sc.nextLine();
		System.out.println(nickname);
		
		/*System.out.println("사용자의 키를 입력하세요");
		String height = sc.nextLine();
		System.out.println(height);
		
		System.out.println("사용자의 나이를 입력하세요.");
		String age = sc.nextLine();
		System.out.println(age);
		
		System.out.println("사용자의 닉네임을 입력하세요.");
		String nickname = sc.nextLine();
		System.out.println(nickname);
 		*/
		
		
		
	
	
	
	
	
	}

}
