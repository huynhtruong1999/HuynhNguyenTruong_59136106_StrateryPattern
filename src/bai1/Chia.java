/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author ASUS
 */
public class Chia implements ITinh {

    @Override
    public float tinh(float a, float b) {
        if (b != 0) {
            return a / b;
        } 
    }

}
