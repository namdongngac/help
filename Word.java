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
public class Word {
    private String word_target;
    private String word_explain;
    public String getwt(){
        return word_target;
    }
    public void setwt(String n){
        this.word_target=n;
    }
    public String getwe(){
        return word_explain;
    }
    public void setwe(String n){
        this.word_explain=n;
    }
}
