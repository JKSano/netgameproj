/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commerce;

/**
 *
 * @author Louie
 */

import interfaces.*;

public class FoodStore implements FreshFoodTrader, ProcessedFoodTrader{
    private int ownerid;
    private float freshFoodQuality;
    private float processedFoodQuality;
    private int freshFoodCapacity;
    private int processedFoodCapacity;
    private int freshFoodQuantity;
    private int processedFoodQuantity;

    @Override
    public int buyFreshFood(FreshFoodTrader a) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    
    }

    
    
    @Override
    public int getFreshFoodQuantity() {
        return freshFoodQuantity;
    }

    @Override
    public float getFreshFoodQuality() {
        return freshFoodQuality;
    }

    @Override
    public int getFreshFoodCapacity() {
        return freshFoodCapacity;
    }

    @Override
    public int buyProcessedFood(ProcessedFoodTrader a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getProcessedFoodQuantity() {
        return processedFoodQuantity;
    }

    @Override
    public float getProcessedFoodQuality() {
        return processedFoodQuality;
    }

    @Override
    public int getProcessedFoodCapacity() {
        return processedFoodCapacity;
    }
    
    
}
