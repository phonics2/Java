package practice3.model.vo;

public class Horse extends Animal{
//필드
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
	public Horse() {
		
	}
	
	//생성자 : 필수
	public Horse(String name, String kinds,int weight, String color) {
		super(name, kinds);
		this.weight = weight;
		this.color = color;
	}
	
	//@Override 사용해서 부모클래스 toString speak() 불러오기
	@Override
	public void speak() {
		System.out.println(super.toString() + " 몸무게는 " + weight + " kg이며, 색상은 " + color+ " 입니다.");
	}
}
