public class Wolf {

	private String nameWolf = "������";
	private String sex = "male";
	private String color = "grey";
	private float weight = 12.5f;
	private int age = 5;

	public String getNameWolf() {
		return nameWolf;
	}

	void setNameWolf(String nameWolf) {
		if (nameWolf == "�������") {
			System.out.println ( " ���� �� �������");
		} else {
		this.nameWolf = nameWolf;
	}

	public String getSex() {
		return sex;
	}




	
	public void move () {
		System.out.println("��� �� 8 �����");
	}

	public boolean sit () {
		System.out.println("����");
		return true;
	}

	public void run () {
		System.out.println("���� ������!");
	}

	public String useHawl() {
		return ("����");
	}

}