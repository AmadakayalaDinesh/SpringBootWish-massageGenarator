package example.wish.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import example.wish.main.genarator.WishMassage;

@SpringBootApplication
public class WishMassageGenaratorApplication {
	
	
	@Bean(name="ldt")
	public java.time.LocalDateTime LocalDateTime() {
		return java.time.LocalDateTime.now();
	}
	

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(WishMassageGenaratorApplication.class, args);
		//Get The Targett Class Obj
		WishMassage genarator=ctx.getBean("wmg",WishMassage.class);
		//Invoke The B Method
	            String hp= genarator.Wishing("BHUVANESWARI");
	     System.out.println("Result:"+hp);
		System.out.print("D3eghvghaagzaasass");
	     //Continer Close
	     ((ConfigurableApplicationContext) ctx).close();
	}

}
