package com.rsaad;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.rsaad.Item;
import com.rsaad.ShoppingBasket;

public class ShoppingBasketTest {
	
	 @Test
	 public void testTotal_GivenEmptyBasket() {
		 // Arrange
		 ShoppingBasket basket = new ShoppingBasket(new ArrayList<>());
		 
		 // Act
		 double result = basket.getTotal();
		 
		 // Assert
		 assertEquals(0.0, result);
	 }

	 @Test
	 public void testTotal_GivenOneItem() {
		 // Arrange
		 ShoppingBasket basket = buildBasketWithItems(new Item(100.0,1));
		 
		 // Act
		 double result = basket.getTotal();
		 
		 // Assert
		 assertEquals(100.0, result);
	 }
	 
	 @Test
	 public void testTotal_GivenMultipleItems() {
		 // Arrange
		 ShoppingBasket basket = buildBasketWithItems(new Item(100.0,1),new Item(200.0,2));
		 
		 // Act
		 double result = basket.getTotal();
		 
		 // Assert
		 assertEquals(500.0, result);
	 }
	 
	 public ShoppingBasket buildBasketWithItems(Item ...items) {
		 return new ShoppingBasket(Arrays.asList(items));
	 }
}
