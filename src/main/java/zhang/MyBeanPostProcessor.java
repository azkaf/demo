package zhang;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if(beanName.equals("userService")){
            System.out.println("实例化后");
        }
        return true;
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if(beanName.equals("userService")){
            System.out.println("实例化前");
            return new userService();
        }
        return null;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals("userService")){
            System.out.println("初始化前");
            System.out.println("初始化前");
        }
        return InstantiationAwareBeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(beanName.equals("userService")){
            System.out.println("初始化后");
        }
        return InstantiationAwareBeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
