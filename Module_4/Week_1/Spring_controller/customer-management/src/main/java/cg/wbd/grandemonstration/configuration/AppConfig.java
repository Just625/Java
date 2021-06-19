package cg.wbd.grandemonstration.configuration;

import cg.wbd.grandemonstration.service.CustomerService;
import cg.wbd.grandemonstration.service.impl.SimpleCustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("cg.wbd.grandemonstration.controller")
public class AppConfig {
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver internalResourceView = new InternalResourceViewResolver();
        internalResourceView.setPrefix("/WEB-INF/templates/");
        internalResourceView.setSuffix(".jsp");
        return internalResourceView;
    }
    @Bean
    public CustomerService customerService(){
        return new SimpleCustomerServiceImpl();
    }
}
