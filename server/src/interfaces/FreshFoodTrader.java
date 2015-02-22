/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Louie
 */
public interface FreshFoodTrader {
    public int buyFreshFood(FreshFoodTrader a);
    public boolean isSellingfFreshFood();
    public boolean isBuyingFreshFood();
    public float getFreshFoodPrice();
    public int getFreshFoodQuantity();
    public float getFreshFoodQuality();
    public int getFreshFoodCapacity();
}
