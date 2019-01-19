public class Wolf {
	private String name;
	private String sex;
	private String color;
	private float weight;
	private int age; 	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 8) {
			System.out.println("Incorrect age");
		}else{
			this.age = age;
		}
	}

	public void move() {
		System.out.println("I go on 8 steps");
	}

	public boolean sit() {
		System.out.println("I'm sitting");
		return true;
	}

	public void run() {
		System.out.println("I'm running");
	}

	public String useHawl() {
		return ("yyyyy");
	}
}