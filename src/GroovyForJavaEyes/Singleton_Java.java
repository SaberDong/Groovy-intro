package GroovyForJavaEyes;

public class Singleton_Java {

	private static Singleton_Java singleton_Java;
	
	private Singleton_Java() {}
	
	public static Singleton_Java getInstance() {
		
		if (singleton_Java == null) {
			singleton_Java = new Singleton_Java();
		}
		
		return singleton_Java;
	}
	
}
