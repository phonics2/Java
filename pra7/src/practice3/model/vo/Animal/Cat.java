package practice3.model.vo.Animal;

public class Cat extends Animal{
	private String location;
	private String color;
	
	
	public Cat() {
		// TODO Auto-generated constructor stub
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public Cat(String name, String kinds, String location, String color) {
		super(name, kinds);
		this.location = location;
		this.color = color;
	}
	
	@Override
	public void speak() {
		System.out.println(super.toString()+"사는 지역은 "+location+" 이고, 색은" +color+"입니다.");
	}

	
}
