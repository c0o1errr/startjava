public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.setNameWolf ("Петя");
		wolfOne.setSex("male");
		wolfOne.setColor("brown");
		wolfOne.setWeight(12);
		wolfOne.setAge(9);
		System.out.println("Волка зовут = " + wolfOne.getNameWolf());
		System.out.println("Пол = " + wolfOne.getSex());
		System.out.println("Цвет = " + wolfOne.getColor());
		System.out.println("Вес = " + wolfOne.getWeight());
		System.out.println("Возраст = " + wolfOne.getAge());
		wolfOne.move();
	}
}