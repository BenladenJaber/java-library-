
package demo;


public class Book {
    private String title;
    private int issueYear;
    private int pages;
    
    private  String author[];
    
    public Book() {
    }

    public Book(String title, int issueYear, int pages) {
        this.title = title;
        this.issueYear = issueYear;
        this.pages = pages;
       
    }

    public Book(String title, int issueYear, int pages,String a[]) {
        this.title = title;
        this.issueYear = issueYear;
        this.pages = pages;
         author = new String[a.length];
        for(int i=0;i<a.length;i++){
            author[i] = a[i];
    }
     }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setIssueYear(int issueYear) {
        this.issueYear = issueYear;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setAuthor(String a[]) {
       
            for(int i = 0;i<a.length;i++)
                author[i] = a[i];
        
    }

    
    public void setAuthor(String a, int index){
   
  
        if(index <author.length && index >=0)  //location for the author should be in the array size in index
             author[index] = a;
   }
    
   public String getAuthor(int index){
    if(index < author.length && index >=0)
        return author[index];
    else
        return " index not exist";
   }
   
     public String[] getAuthor(){
       return author;
  }

    public String getTitle() {
        return title;
    }

    public int getIssueYear() {
        return issueYear;
    }

    public int getPages() {
        return pages;
    }
    
    @Override
    public String toString() {
        String details = "The title is "+ title + "\nthe issue year is "+issueYear+"\nthe number of pages is "+pages;
        details += "\nThe authors of the book are\n";
   
        for(int i=0;i<author.length;i++){
            details += author[i] +"\n";
        }
        return details;
    }
    
}

    
