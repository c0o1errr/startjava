public class JaegerTest {
	public static void main (String [] args) {
		Jaeger jaegerOne = new Jaeger();
		Jaeger jaegerTwo = new Jaeger();
		jaegerOne.setModelName("Matador Fury");
		jaegerTwo.setModelName("Chrome Brutus");
		System.out.println("Model first jaeger : " + jaegerOne.getModelName());
		System.out.println("Model second jaeger : " + jaegerTwo.getModelName());
	}
}