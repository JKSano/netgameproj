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
public interface ChemicalsTrader {
    public int buyChemicals(ChemicalsTrader a);
    public boolean isSellingChemicals();
    public boolean isBuyingChemicals();
    public float getChemicalsPrice();
    public int getChemicalsQuantity();
    public float getChemicalsQuality();
    public int getChemicalsCapacity();
}
