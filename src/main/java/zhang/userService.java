package zhang;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.SmartFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class userService{

    @Autowired
    private orderService orderService;

    @Override
    public String toString() {
        return "userService{" +
                "orderService=" + orderService +
                '}';
    }
}
