import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class Test implements CommandLineRunner{
	@Autowired
	ApplicationContext cxt;
	public static void main(String[] args) {
		SpringApplication.run(Test.class, args);
		

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("pavi");
	}

}
