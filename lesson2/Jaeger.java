public class Jaeger {
	private String modelName;
	private String mark;
	private String origin;
	
	
	public String getModelName() {
		return modelName;
	}

	void setModelName(String modelName) {
		this.modelName = modelName;		
	}

	public String getMark() {
		return mark;
	} 

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}	
	
	public boolean drift() {
		System.out.println("�� ����� � ���� " );
		return true;
	}

	void move() {
		System.out.println("�� ������ 5 ����� " );
	}
	void useVortex() {
	}
}