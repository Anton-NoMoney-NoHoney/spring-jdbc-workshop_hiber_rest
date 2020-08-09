package org.shop.rest;

import org.shop.db.OrdersRepository;
import org.shop.dto.OrderDto;
import org.shop.service.OrdersService;
import org.shop.service.impl.OrderServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("")
public class Rest {

    /* ApplicationContext context = new ClassPathXmlApplicationContext("spring/application-context.xml");
     OrdersRepository ordersRepository = context.getBean("ordersRepository", OrdersRepository.class);
     OrdersService service=new OrderServiceImpl(ordersRepository);*/
    @GetMapping()
    public String/*List<OrderDto>*/ fgd(){

        return "service.findAll()";
    }

}
