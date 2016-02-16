/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spellcheckuser;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Harshita V
 */
public class SpellCheck {
    private TreeSet<String> set=new TreeSet
            <String>();
    
    
    
    public void add(String line)
    {
        if(!set.contains(line))
            {set.add(line);}
        
        
    }
 
    
    
    public void misspeltwords(String word,PrintWriter writer){
    
    if(!set.contains(word)){
        
       //System.out.println(word+" "+"word not found");
        
        writer.println(word+" "+"");
        
          
            
        }
    
    //return new ArrayList();
    
    else{
        //System.out.println(word+" found");
        writer.println();
       
    //return map.get(word);
    }
    //writer.close();
    }

   
    
}
