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
public interface ProcessedFoodTrader {
    public int buyProcessedFood(ProcessedFoodTrader a);
    public boolean isSellingProcessedFood();
    public boolean isBuyingProcessedFood();
    public float getProcessedFoodPrice();
    public int getProcessedFoodQuantity();
    public float getProcessedFoodQuality();
    public int getProcessedFoodCapacity();
    
}
