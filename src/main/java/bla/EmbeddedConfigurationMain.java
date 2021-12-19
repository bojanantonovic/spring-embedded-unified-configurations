package bla;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// configuration is inside the class
public class EmbeddedConfigurationMain {

	public static void main(String... args) {
		try (final var context = new AnnotationConfigApplicationContext()) {
			System.out.println("in the main method");

			System.out.println(context.getBean(A.class));
		}
	}

	@Configuration
	@ComponentScan
	static class EmbeddedConfiguration {

	}

	@PostConstruct
	public void init() {
		System.out.println("initializing from a @PostConstruct method");
	}

	@PreDestroy
	public void eol() {
		System.out.println("end of life ...");
	}
}
