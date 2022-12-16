package zhang;

import org.springframework.beans.factory.annotation.InitDestroyAnnotationBeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@ComponentScan(excludeFilters ={@ComponentScan.Filter(type = FilterType.ANNOTATION)})
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Config.class);
        context.refresh();
        userService bean = context.getBean(userService.class);
        System.out.println(bean);
        System.out.println("modify");
        System.out.println("hotfix-commit1");
        System.out.println("hotfix-commit2");
    }

}
