public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.setNameWolf ("Petr");
		wolfOne.setSex("male");
		wolfOne.setColor("brown");
		wolfOne.setWeight(12);
		wolfOne.setAge(9);
		System.out.println("Wolf's name is = " + wolfOne.getNameWolf());
		System.out.println("Sex = " + wolfOne.getSex());
		System.out.println("Color = " + wolfOne.getColor());
		System.out.println("Weight = " + wolfOne.getWeight());
		System.out.println("Age = " + wolfOne.getAge());
		wolfOne.move();
	}
}