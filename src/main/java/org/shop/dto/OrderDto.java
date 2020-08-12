package org.shop.dto;

import com.google.gson.Gson;

import java.util.List;

/**
 * feel free to add any code to this class
 */
public class OrderDto {
    private long id;
    private String name;
    private String client;
    private List<OrderDetailDto> orderDetails;

    public OrderDto() {
    }

    public OrderDto(long id, String name, String client) {
        this.id = id;
        this.name = name;
        this.client = client;
    }

    public OrderDto(long id, String name, String client, List<OrderDetailDto> orderDetails) {
        this.id = id;
        this.name = name;
        this.client=client;
        this.orderDetails = orderDetails;
    }

    public OrderDto(String name,String client, List<OrderDetailDto> orderDetails) {
        this.name = name;
        this.client=client;
        this.orderDetails = orderDetails;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<OrderDetailDto> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetailDto> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }


}
