/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundproperty;

import java.util.Scanner;
/**
 *
 * @author eiwte
 */
public class BoundProperty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyPropertyBean  mySource = new MyPropertyBean();
        Listener1 L1 = new Listener1();
        Listener2 L2 = new Listener2();
        
        mySource.addPropertyChangeListener(L1);
        mySource.addPropertyChangeListener(L2);

        System.out.print("Enter Score: ");
        String s = sc.nextLine();
        
        while(!s.equals("")){
            mySource.setText(s);
            System.out.println("--------------------------------");
            System.out.print("Enter Score: ");
            s = sc.nextLine();
        }
        
        System.out.println("======================= End the Program =======================");
    }
    
}
