package org.shop.rest;

import com.google.gson.Gson;
import org.shop.dto.OrderDto;
import org.shop.service.impl.OrderServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")

public class Rest {

    private final OrderServiceImpl orderService;

    public Rest(OrderServiceImpl orderService) {
        this.orderService = orderService;
    }


    @GetMapping(value = "/all",produces =  "application/json" )
    public String getAll(){
        return new Gson().toJson(orderService.findAll());
    }

    @GetMapping(value = "/get/{id}",produces =  "application/json")
    public String getById(@PathVariable(value = "id")Integer id){
        return new Gson().toJson(orderService.findOrderById(id));
    }

    /**
     * {"name":"post","client":"post","orderDetails":[{"name":"tsop","price":999.0},{"name":"tsop_1","price":222.0},{"name":"name","price":333.0}]}
     * */
    @PostMapping(value = "/add")
    public boolean addOrder(@RequestBody  OrderDto orderDto){
        try{
            orderService.saveOrder(orderDto );
            return true;
        }catch (Exception ex){
            return false;
        }
    }

    /**
     * {"id":10,"name":"post","client":"post","orderDetails":[{"name":"tsop","price":999.0},{"name":"tsop_1","price":222.0},{"name":"name","price":333.0}]}
     * */
    @DeleteMapping("/remove")
    public boolean deliteOrder(@RequestBody  OrderDto orderDto){
        try{
            orderService.deleteOrder(orderDto.getId() );
            return true;
        }catch (Exception ex){
            return false;
        }
    }

}
