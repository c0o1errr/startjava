public class Wolf {

	private String nameWolf = "Бублик";
	private String sex = "male";
	private String color = "grey";
	private float weight = 12.5f;
	private int age = 5;

	public String getNameWolf() {
		return nameWolf;
	}

	void setNameWolf(String nameWolf) {
		if (nameWolf == "котенок") {
			System.out.println ( " Волк не котенок");
		} else {
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

	void setColor (String color){
		this.color = color;
	}

	public getWeight() {
		return weight;

	}

	void setWeight(float weight){
		this.weight = weight;
	}

	public int getAge(){
		return age;
	}

	void setAge( int age) {
		if (age > 8) {
			System.out.println("Некорретный возраст");
		} else {
		this.age = age;
	}




	
	public void move () {
		System.out.println("Иду на 8 шагов");
	}

	public boolean sit () {
		System.out.println("Сижу");
		return true;
	}

	public void run () {
		System.out.println("Бегу кусать!");
	}

	public String useHawl() {
		return ("уууу");
	}

}