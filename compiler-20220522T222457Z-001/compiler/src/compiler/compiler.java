
package compiler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;


public class compiler
{
  
 public static void main(String[] args)  throws FileNotFoundException, IOException 
            
    {
       
       
     
      
       
       
        
        
        
    
   
        
        File f = new File("test.TXT");
        Scanner s = new Scanner(f);
        File f2 = new File("test2.TXT");
        Scanner s2 = new Scanner(f2);
        File f3 = new File("test3.TXT");
        Scanner s3 = new Scanner(f3);
        /*
        both files need equal inputs <<<<<< if not <<<<<<< file not found in the less file ,.
        */
        
     
        
        
        int ctr = 0 ;
       
        Scanner s1 = new Scanner(f);
        
        
        
       
         while(s.hasNextLine())
        {
            ctr++;
            s.nextLine();
        }
        String[] Identification = new String[ctr];
        
        for(int i = 0 ; i < Identification.length ; i++)
        {
            Identification[i] = s1.nextLine();
           
        }
       
        
        
        String[] Sign = new String[ctr];
        //String[] variable_code = new String[ctr];
        for(int i = 0 ; i < Identification.length ; i++)
        {
            Sign[i] = s2.nextLine();
           
        }
//         for(int i = 0 ; i < Identification.length ; i++)
//        {
//           
//             switch(Sign[i])
//            {
//                case"X":
//                {
//                    Sign[i] =  s2.nextLine();
//                    
//                }
//                break;
//                case"Y":
//                {
//                    Sign[i] =  s2.nextLine();
//                }
//                break;
//                default:
//                {}
//             }
//        }
           while(s1.hasNext())
           {
                for(int i = 0 ; i < Identification.length ; i++)
                {
            Identification[i] = s1.nextLine();
           
                }
           }
        //second file 
        
        
        
        
        //third file 
       
          String[] Num = new String[ctr];
          
           for(int i = 0 ; i < Identification.length ; i++)
        {
            
            Num[i] = s3.nextLine();
           
        }
     
           //third file 

        
//                   
//          
        
        
        while(s1.hasNext())
           {
            for(int i = 0 ; i < Identification.length ; i++)
           {
               switch(Sign[i])
               {
                   case"X":
                   {
                       Sign[i] = s1.nextLine();

                   }
                   break;
                   case"Y":
                   {
                       Sign[i] = s1.nextLine();
                   }
                   break;
                    case"+":
                   {
                       Sign[i] = s1.nextLine();
                   }
                   break;
                    case"-":
                   {
                       Sign[i] = s1.nextLine();
                   }
                   break;
                    default:
                    {}
                
                
            }
        }
           }
          
              
              
          
        
         for(int i = 0 ; i < Identification.length ; i++)
        {
            
            switch (Identification[i])
            {
                case "OPERATION":
                {
                    
                      if (Sign[i].equals("SUM"))
                    {
                         int res1 =Integer.valueOf(Num[0]);
                         int res2 =Integer.valueOf(Num[1]);
                         int res3 = res1+res2;
                         System.out.println("LDA\t"+Sign[i-2]+"\t"+Num[0]);
                        System.out.println("LDA\t"+Sign[i-1]+"\t"+Num[1]);
                        System.out.println("ADD\t"+Sign[i-1]+"\t");
                        System.out.println("STA\t"+Sign[i-1]+"\t"+res3);
                      //  System.out.println(Integer.parseInt(Num[i])+Integer.parseInt(Num[i]));
                      // System.out.println(Num[0]);
                      // System.out.println(Num[1]);
                      
                       
                       
                       //System.out.println(res1+res2);
                        
                    }
                        if (Sign[i].equals("SUB"))
                    {
                        int res1 =Integer.valueOf(Num[0]);
                         int res2 =Integer.valueOf(Num[1]);
                         int res3 = res1-res2;
                         System.out.println("LDA\t"+Sign[i-2]+"\t"+Num[0]);
                        System.out.println("LDA\t"+Sign[i-1]+"\t"+Num[1]);
                        System.out.println("SUB\t"+Sign[i-1]+"\t");
                        System.out.println("STA\t"+Sign[i-1]+"\t"+res3);
                         //System.out.println(Integer.parseInt(Num[i])-Integer.parseInt(Num[i+1]));
                    }
                        
                }
                break;
                case "CONDITION":
                {
                     if (Sign[i].equals("="))
                    {
                        System.out.println("LDA\t"+Sign[i-2]+"\t");
                        System.out.println("LDA\t"+Sign[i-1]+"\t");
                        System.out.println("COMP\t"+Sign[i-1]+"\t");
                         System.out.println("JEQ\t"+"\t"+"RETADR");
                        //System.out.println("STA\t"+Sign[i-1]+"\t");
                        
                    }
                    if (Sign[i].equals(">"))
                    {
                         System.out.println("LDA\t"+Sign[i-2]+"\t");
                        System.out.println("LDA\t"+Sign[i-1]+"\t");
                         System.out.println("COMP\t"+Sign[i-1]+"\t");
                        System.out.println("JGT\t"+"\t"+"RETADR");
                      //  System.out.println("STA\t"+Sign[i-1]+"\t");
                    }
                     if (Sign[i].equals("<"))
                    {
                         System.out.println("LDA\t"+Sign[i-2]+"\t");
                        System.out.println("LDA\t"+Sign[i-1]+"\t");
                        System.out.println("COMP\t"+Sign[i-1]+"\t");
                        System.out.println("JLT\t"+"\t"+"RETADR");
                        //System.out.println("STA\t"+Sign[i+1]+"\t");
                    }
                     
                    
                }
                break;
                
            }
            
        }
            

	    



        
    }
}

        
        
      
        
       
    
   
   
    


  
    
         
  

	
