class DVD extends Media implements Comparable<Media>
{
    private int year;
    public DVD(String title, int year)
    {
        this.title = title;
        this.year = year;
    }
    public int getYear() {return year;}
    public String toString()
    {
        return year + ": " + title + " [DVD]";
    }
    /*
    public int compareTo(DVD d1) {
        System.out.println("reached here");
        return Integer.compare(d1.getYear(), this.getYear());
    }
    */
}