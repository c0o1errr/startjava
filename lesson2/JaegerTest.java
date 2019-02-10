public class JaegerTest {
	public static void main (String [] args) {
		Jaeger jaeger = new Jaeger();

		System.out.println("Model first jaeger : " + jaeger.getModelNameOne());
		System.out.println("Model second jaeger : " + jaeger.getModelNameTwo());
		System.out.println("Mark first jaeger : " + jaeger.getMarkOne());
		System.out.println("Mark second jaeger : " + jaeger.getMarkTwo());
		System.out.println("Origin first jaeger : " + jaeger.getOriginOne());
		System.out.println("Origin second jaeger : " + jaeger.getOriginTwo());

	}
}