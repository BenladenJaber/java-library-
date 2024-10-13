
package demo;


public class NormalBook extends Book {
    private int weight;
    private String printType;
    
    public NormalBook(){}
    
    
    public NormalBook(int w , String type ,String title , int issueyear, int pages, String arr[])
    {
        super.setTitle(title);
        super.setIssueYear(issueyear);
        super.setPages(pages);
        super.setAuthor(arr);
        this.weight=w;
        this.printType=type;
        
    }
    
    @Override
    public String toString()
    {
        String fullinfo=super.toString();
        fullinfo+="\nThe weight of the book is "+weight+"\nThe printType is "+printType;
        return fullinfo;
    }

}
