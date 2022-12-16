package zhang;


import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("zhang")
public class Config {

    @Bean(autowire = Autowire.BY_NAME)
    public orderService orderService(){
        return new orderService();
    }
}
