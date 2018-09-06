import java.util.*;
public class Driver
{
    public static void main(String[] args)
    {
        ArrayList<Media> library = new ArrayList<Media>();
        library.add(new Book("Dare to go Solo", "Elizabeth Boese"));
        library.add(new DVD("Dare to go Solo", 2006));
        library.add(new DVD("Dare to go Solo", 1999));
        library.add(new Book("Intro to Programming with Java Applets", "Elizabeth Boese"));
        library.add(new DVD("Intro to Programming",2011));
        library.add(new DVD("Intro to Programming",1970));
        library.add(new DVD("Dare to go Solo", 2012));
        library.add(new DVD("Dare to go Solo", 2000));
        library.add(new Book("Dare to go Solo", "Wise Travelguy"));
        library.add(new Book("Intro to Programming with Java Applets", "Elizabeth Boe"));
        Collections.sort(library);
        for (Object media : library)
            System.out.println(media);

    }
}