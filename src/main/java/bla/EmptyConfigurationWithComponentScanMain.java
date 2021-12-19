package bla;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// configuration is outside the class
public class EmptyConfigurationWithComponentScanMain {

	public static void main(String... args) {
		try (final var context = new AnnotationConfigApplicationContext(EmptyConfigurationWithComponentScan.class)) {
			System.out.println(context.getBean(A.class));
		}
	}
}
