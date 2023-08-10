/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class ColorBox extends Box {
    private int color;

    public ColorBox() {
    }

    public ColorBox(int color) {
        this.color = color;
    }

    public ColorBox(String code, double price, int color) {
        super(code, price);
        this.color = color;
    }
    
    public double getNewPrice() {
        if(color > 100) {
            return super.getPrice() + super.getPrice()*0.1;
        } else {
            return super.getPrice();
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + color;
    }
    
   
}
