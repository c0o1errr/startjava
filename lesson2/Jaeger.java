public class Jaeger{
	private String modelNameOne = "Matador Fury";
	private String markOne = "Mark-3";
	private String originOne = "Mexico";
	private String modelNameTwo = "Chrome Brutus";
	private String markTwo = "Mark-3";
	private String originTwo = "Canada";	

	
	public String getModelNameOne() {
		return modelNameOne;
	}

	void setModelNameOne (String modelNameOne) {
		this.modelNameOne = modelNameOne;		
	}

	public String getMarkOne() {
		return markOne;
	} 

	public void setMarkOne(String markOne) {
		this.markOne = markOne;
	}

	public String getOriginOne() {
		return originOne;
	}

	public void setOriginOne(String originOne) {
		this.originOne = originOne;
	}
		
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