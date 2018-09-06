class Book extends  Media implements Comparable<Media>
{
    private String author;
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }
    public String getAuthor() {return  author;}
    public String toString()
    {
        return getTitle() + " by " + getAuthor();
    }

    public int compareTo(Book b1) {

        System.out.println("b1 title" + b1.title);
        System.out.println( "this title" + this.title);
        return this.getTitle().compareTo(b1.getTitle());
    }
}
