
package com.example.demo.model.api;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class GreetResponse {
    public String text;
    public String orderNumber;
    public String getText()   {
        return this.text;
    }
      public GreetResponse(String text) {
        this.text = text;
        this.orderNumber = "OrderNumber";
    }
}
