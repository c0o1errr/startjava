public class JaegerTest {
	public static void main (String [] args) {
		JaegerOne jaegerFirst = new JaegerOne();
		JaegerTwo jaegerSecond = new JaegerTwo();
		
		System.out.println("Model first jaeger " + jaegerFirst.getModelNameOne());
		System.out.println("Model second jaeger " + jaegerSecond.getModelNameTwo());
	}
}