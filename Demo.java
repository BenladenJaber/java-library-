
package demo;

import java.util.Scanner;


public class Demo {

    
    public static void main(String[] args) {
        
       Scanner scan = new Scanner(System.in);
        
       Book book_array[]=new Book[3];
       String authors[]=new String[1];
       String title;
       String author;
       int year;
       int page;
       
        for (int i = 0; i < book_array.length; i++) {
           title=scan.next();
           year=scan.nextInt();
           page=scan.nextInt();
           author=scan.next();
           
           authors[0]=author;
          
           
           Book book = new Book(title,year,page,authors);
           book_array[i]=book;
           
         
        }
        
        for (int i = 0; i < book_array.length; i++) {
            System.out.println(book_array[i].toString());
        }
     
        
      
        
        
        
    }
    
}
