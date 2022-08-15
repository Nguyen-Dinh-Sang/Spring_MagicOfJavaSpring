package magicofspring;

import magicofspring.springindepth.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringMagicOfJavaSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringMagicOfJavaSpringApplication.class, args);
		getBeanContext(context);
	}

	private static void getBeanContext(ApplicationContext context) {
		BinarySearchImpl binarySearch = context.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch2 = context.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);
		System.out.println(binarySearch2);
		binarySearch.binarySearch(new int[] {1, 2, 3}, 5);
	}

}
