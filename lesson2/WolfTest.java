public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.setNameWolf ("����");
		wolfOne.setSex("male");
		wolfOne.setColor("brown");
		wolfOne.setWeight(12);
		wolfOne.setAge(9);
		System.out.println("����� ����� = " + wolfOne.getNameWolf());
		System.out.println("��� = " + wolfOne.getSex());
		System.out.println("���� = " + wolfOne.getColor());
		System.out.println("��� = " + wolfOne.getWeight());
		System.out.println("������� = " + wolfOne.getAge());
		wolfOne.move();
	}
}