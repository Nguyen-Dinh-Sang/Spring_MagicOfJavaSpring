package magicofspring.springindepth;

import magicofspring.springindepth.springframework.BinarySearchImpl2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringFrameworkApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringFrameworkApplication.class);
		getBeanContext(context);
	}

	private static void getBeanContext(ApplicationContext context) {
		BinarySearchImpl2 binarySearch = context.getBean(BinarySearchImpl2.class);
		BinarySearchImpl2 binarySearch2 = context.getBean(BinarySearchImpl2.class);
		System.out.println(binarySearch);
		System.out.println(binarySearch2);
		System.out.println(binarySearch.binarySearch(new int[] {1, 2, 3}, 5));
	}

}
