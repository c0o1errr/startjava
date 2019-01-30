public class JaegerTwo{
	private String modelNameTwo = "Chrome Brutus";
	private String markTwo = "Mark-3";
	private String originTwo = "Canada";	

	public String getModelNameTwo() {
		return modelNameTwo;
	}

	void setModelNameTwo (String modelNameTwo) {
		this.modelNameTwo = modelNameTwo;
	}

	public String getMarkTwo() {
		return markTwo;
	} 

	public void setMarkTwo(String markTwo) {
		this.markTwo = markTwo;
	}

	public String getOriginTwo() {
		return originTwo;
	}

	public void setOrigiTwon(String originTwo) {
		this.originTwo = originTwo;
	}



	public boolean drift() {
		System.out.println("Вы вошли в дрифт " );
		return true;
	}

	void move() {
		System.out.println("Вы прошли 5 шагов " );
	}

	void useVortex() {


	}
}