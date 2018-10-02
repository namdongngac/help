/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;
import java.util.*;
/**
 *
 * @author admin
 */
public class DictionaryManagement {
    public int n;
    Dictionary word=new Dictionary();
    
    public void insertFromCommandline(){
        String wt;
        String we;
        Scanner inp = new Scanner(System.in);
            n = inp.nextInt();
            for(int i=0;i<n;i++){
                wt = inp.nextLine();
                word.Word[i].setwt(wt);
                we = inp.nextLine();
                word.Word[i].setwe(we);
            }
        
    }
}
