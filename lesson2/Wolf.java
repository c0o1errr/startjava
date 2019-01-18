public class Wolf {
	private String nameWolf;
	private String sex;
	private String color;
	private float weight;
	private int age; 	

	public String getNameWolf() {
		return nameWolf;
	}

	void setNameWolf(String nameWolf) {
		this.nameWolf = nameWolf;
	}

	public String getSex() {
		return sex;
	}

	void setSex(String sex) {
		this.sex = sex;
	}

	public String getColor(){
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}

	public float getWeight(){
		return weight;
	}

	void setWeight(float weight){
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	void setAge(int age){
		if ( age > 8 ) {
			System.out.println("Incorrect age");
		} else {
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