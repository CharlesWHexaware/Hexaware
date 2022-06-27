package hexa.training.testspringboot;

import hexa.training.testspringboot.entity.Product;
import hexa.training.testspringboot.entity.Student;
import hexa.training.testspringboot.repository.ProductRepository;
import hexa.training.testspringboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSpringbootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringbootApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private ProductRepository productRepository;


	@Override
	public void run(String... args) throws Exception {
		/*Student student = new Student();
		student.setFirstName("John");
		student.setLastName("Doe");
		student.setEmailID("jdoe@gmail.com");
		studentRepository.save(student);

		Student student1 = new Student();
		student1.setFirstName("Jane");
		student1.setLastName("Doe");
		student1.setEmailID("jdoe2@gmail.com");
		studentRepository.save(student1);*/

		/*Product product = new Product(100, "Kindle Fire", "Amazon", 100);
		productRepository.save(product);
		Product product1 = new Product(200, "Inspirion 15", "Dell", 600);
		productRepository.save(product1);
		Product product3 = new Product(300, "Galaxy 10", "Samsung", 700);
		productRepository.save(product3);
		Product product4 = new Product(400, "Macbook", "Apple", 4000);
		productRepository.save(product4);
		Product product5 = new Product(401, "Iphone 10", "Apple", 1200);
		productRepository.save(product5);
		Product product6 = new Product(500, "Mazda 3", "Honda", 13000);
		productRepository.save(product6);*/
		//productRepository.deleteAll();




	}
}
