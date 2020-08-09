package org.shop.spring;

import org.shop.db.OrdersRepository;
import org.shop.service.OrdersService;
import org.shop.service.impl.OrderServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

public class SpringWebAppInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) {
        AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();

        appContext.register(ApplicationContextConfig.class);
        appContext.setConfigLocation("spring/application-context.xml");


        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("SpringDispatcher",
                new DispatcherServlet(appContext));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");


    }
}
