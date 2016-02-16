/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spellcheckuser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

/**
 *
 * @author Harshita V
 */
public class SpellCheckUser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try{
           // Input file-putting into hashmap
          FileReader file=new FileReader("F:/input.txt");
          BufferedReader bufRead = new BufferedReader(file);
          String myLine = null;
          SpellCheck sl=new SpellCheck();
          while((myLine=bufRead.readLine()) != null)
          {sl.add(myLine);}
           
          // request file
          
         FileReader reqfile=new FileReader("F:/req.txt");
         BufferedReader bufRead2 = new BufferedReader(reqfile);
         String reqWords=null;
         PrintWriter writer = new PrintWriter("F:/result.txt");
          while((reqWords=bufRead2.readLine()) != null)
              
          {
              String[] reqwordsarr=reqWords.split(" ");
              for(int i=0;i<reqwordsarr.length;i++)
                 { 
                    // if(reqwordsarr[i].)
                     
                     sl.misspeltwords(reqwordsarr[i].toLowerCase(),writer);
                 }
          }
          
          //write to the file
          writer.close();

        
    }
        catch(Exception e){System.out.println(e);}}
    }
    

