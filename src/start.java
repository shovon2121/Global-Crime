/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shovon
 */
public class start {
    
    public static void main(String[] args){
        
        splash spl = new splash();
        login v = new login();
        spl.setVisible(true);
        
        try{
            
            for(int i=0;i<=100;i++){
                Thread.sleep(35);
               // spl.loadnum.setText(Integer.toString(i)+"%");
               // spl.bar.setValue(i);
                
                if(i==100){
                    spl.setVisible(false);
                    v.setVisible(true);
                }
                
            }
            
        }catch(Exception e){
            
        }
        
    }
}
