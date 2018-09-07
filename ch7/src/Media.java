abstract class Media implements Comparable<Media>
{
    protected String title;
    public String getTitle() {return  title;}


    public int compareTo(Media m) {

        if (m instanceof Book && this instanceof DVD) {
            return -1;
        }
        if (m instanceof DVD && this instanceof DVD) {
            if (((DVD) this).getTitle() != (((DVD) m).getTitle()) ) {

                return this.getTitle().compareTo(m.getTitle());
            } else {

                return ((DVD) this).getYear() - ((DVD) m).getYear();
            }
        }
        if (m instanceof Book && this instanceof Book) {
            if (this.getTitle() != (m.getTitle())) {

                return this.getTitle().compareTo(m.getTitle());
            } else {
                return ((Book) this).getAuthor().compareTo(((Book) m).getAuthor());
            }
        }
        return 0;

    }
}

