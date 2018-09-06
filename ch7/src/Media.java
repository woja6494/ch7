abstract class Media implements Comparable<Media>
{
    protected String title;
    public String getTitle() {return  title;}


    public int compareTo(Media m) {


        if (m instanceof Book&& this instanceof Book){
            return ((Book) this).getTitle().compareTo(((Book) m).getTitle());
        }
        else if(m instanceof DVD && this instanceof DVD){
            return Integer.compare(((DVD) this).getYear(), ((DVD) m).getYear());
        }

        System.out.println( "this title" + this.getClass());
        System.out.println( "this title" + this.getTitle());

        System.out.println("m title" + m.getClass());

        return this.getTitle().compareTo(m.getTitle());
    }

}

