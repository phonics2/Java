package practice3.model.vo;

// Animal
public class Rabbit extends Animal {
//필드
	//토끼의 무게  , 색상
	private int weight;
	private String color;

//메서드
	//Setter
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//Getter
	public int getWeight() {
		return weight;
	}
	public String getColor() {
		return color;
	}
	

	//생성자 : 기본
	public Rabbit() {
		
	}
	//생성자 : 필수 alt shift + s + o 선택후 부모클래스에있는 필드 추가
	public Rabbit(String name, String kinds,int weight, String color) {
		super(name, kinds);
		this.weight = weight;
		this.color = color;
	}
	
	//@Override speak() 가지고와서 출력하기
	@Override
	public void speak() {
		System.out.println(super.toString()+" 몸무게는 "+weight+ "kg 이며, 색상은 " + color + " 입니다.");
	}
}
