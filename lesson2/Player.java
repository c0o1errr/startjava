public class Player {
	private String name;	
	private int number;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == "") {
			System.out.println("Incorrect name ");
		} else {
			this.name = name;
		}		
	}	

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}