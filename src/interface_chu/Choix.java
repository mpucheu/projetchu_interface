/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_chu;

/**
 *
 * PUCHEU Marion
 * MARLIAT Julien
 */
public class Choix {
     private String nomChoix;
    
    public Choix (String leChoix){
        nomChoix = leChoix;
    }
    
    public void setNomChoix(String newChoix){
        nomChoix = newChoix;
    }
    
    public String getNomChoix(){
        return nomChoix;
    }
}
