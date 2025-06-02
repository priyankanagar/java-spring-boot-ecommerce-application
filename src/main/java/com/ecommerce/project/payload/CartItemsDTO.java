package com.ecommerce.project.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItemsDTO {
    private Long cartItemId;
    private CartDTO cart;
    private ProductDTO productDTO;
    private Integer quantity;
    private Double discount;
    private Double productPrice;
}
