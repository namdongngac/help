/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author admin
 */
public class DictionaryCommandline {
    DictionaryManagement c=new DictionaryManagement();
    public void showAllWords(){
        for(int i=0;i<c.n;i++){
            System.out.print(c.word.Word[i].getwt());
            System.out.print(" mean "+c.word.Word[i].getwe());
        }
    }
    public void dictionaryBasic(){
        c.insertFromCommandline();
        showAllWords();
    }
}
