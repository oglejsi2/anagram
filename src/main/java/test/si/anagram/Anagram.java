/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.si.anagram;

import java.util.Arrays;

/**
 *
 * @author Robert Čmrlec
 */
public class Anagram {
    
    private final String source;
    private final String target;
    private final boolean isAnagram;
    
    
    public Anagram(String source, String target) {
        this.source=source;
        this.target=target;       
        this.isAnagram=this.checkAnagram();        
    }   

    public String getSource() {
        return source;
    }

    public String getTarget() {
        return target;
    }

    public boolean isIsAnagram() {
        return isAnagram;
    }
    
    

    public boolean checkAnagram() {
        boolean locIsAnagram;
        if (this.source.length()==this.target.length()) {
            char[] sourceArray=this.source.toCharArray();
            char[] targetArray=this.target.toCharArray();
            Arrays.sort(sourceArray);
            Arrays.sort(targetArray);            
            locIsAnagram=Arrays.equals(sourceArray,targetArray);
        }
        else {
            locIsAnagram=false;
        }
        return locIsAnagram;       
    }
}
