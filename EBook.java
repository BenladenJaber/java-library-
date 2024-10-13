
package demo;

public class EBook extends Book {
    
    private int sizeInBytes;
    private String fileType;

    public EBook() {
    }   
    
        public void setSizeInBytes(int sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

        public EBook(int sizeinbyte , String filetype ,String title , int issueyear, int pages, String arr[])
        {
            super.setTitle(title);
            super.setIssueYear(issueyear);
            super.setPages(pages);
            super.setAuthor(arr);
            this.sizeInBytes=sizeinbyte;
            this.fileType=filetype;
        }
        
        public void setFileType(String fileType) {    
        this.fileType = fileType;
    }

    public int getSizeInBytes() {
        return sizeInBytes;
    }

    public String getFileType() {
        return fileType;
    }

    
    @Override
    public String toString()
    {
        String data = super.toString();
        data+="\nThe size in Bytes is "+sizeInBytes+"\nThe file Type is "+fileType;
        return data;
    }

    
}
