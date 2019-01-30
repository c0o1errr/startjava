public class JaegerOne{
	private String modelNameOne = "Matador Fury";
	private String markOne = "Mark-3";
	private String originOne = "Mexico";
	
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