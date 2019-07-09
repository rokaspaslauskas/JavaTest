
package penktaPaskaita;

public class WordCount {  
      static int wordcount(String string1)  
        {  
          int count=0;  
      
            char ch1[]= new char[string1.length()];     
            for(int n=0;n<string1.length();n++)  
            {  
                ch1[n]= string1.charAt(n);  
                if( ((n>0)&&(ch1[n]!=' ')&&(ch1[n-1]==' ')) || ((ch1[0]!=' ')&&(n==0)) )  
                    count++;  
            }  
            return count;  
        }  
      public static void main(String[] args) {  
          String string =;  
         System.out.println(wordcount(string) + " words.");   
    }  
}  