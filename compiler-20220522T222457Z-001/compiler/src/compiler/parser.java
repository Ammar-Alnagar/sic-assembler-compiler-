/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;

import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.*;
import static java.util.Collections.list;
class parser 
{
   

    static void parse(String doc) 
    {
        System.out.println("<< Original document >>");
        System.out.println(doc);
        char[] cArray = doc.toCharArray();
        
        List<String> tokens = new ArrayList<String>();
        
        String tok = "";
        for( int i = 0 ;i < cArray.length ; i++ )
        {
            char current = cArray[i];
             tok =(tok + current).trim(); 
             
            if (current == '"')
            {
                if (!tok.isEmpty())
                {
                    tokens.add(tok.substring(0,tok.length()-1));
                    tok  = "";
                    
                }
                
                while(i<cArray.length)
                {
                    tok+=cArray[i];
                    //only break when we meet the suffix token
                    if(cArray[i] == '"' && tok.length()>1 )
                    {
                        tokens.add(tok);
                        tok = "";
                        break;
                    }
                    
                     i++;
                }
            }
            
            if ( !tok.isEmpty() && i == cArray.length - 1)
            {
                tokens.add(tok);
                tok = "";
                
            }
            
            
        }
        System.out.println();
        printToks(tokens);
        
    }
    private static void printToks(List<String>tokens )
    {
       
        for(String  t :tokens)
        {
            System.out.println(t);
        }
    }
    
}
