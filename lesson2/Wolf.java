public class Wolf {

	private String nameWolf = "Собака";
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