package BookList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Book b1 =new Book("ÇALI KUŞU",406,"H.EDİP ADIVAR",1918);
        Book b2 =new Book("GENİŞZAMANLAR",144,"AYŞE KULİN",1918);
        Book b3 =new Book("YAPRAK DÖKÜMÜ",134,"R.NURİ GÜNTEKİN",1918);
        Book b4 =new Book("İNTİBAH",176,"NAMIK KEMAL",1918);
        Book b5 =new Book("SİMYACI",166,"PAULO COELHO",1918);
        Book b6 =new Book("DON KİŞOT",320,"ERVANTES",1918);
        Book b7 =new Book("VADİDEKİZAMBAK",366,"BALZAK",1918);
        Book b8 =new Book("SEMERKANT",318,"AMİN MAALOUF",1918);
        Book b9 =new Book("İKİ ŞEHRİN HİKAYESİ",399,"CHARLES DİCKENS",1918);
        Book b10 =new Book("KUMARBAZ",97,"DOSTOYEVSKİ",1918);

        ArrayList<Book> list = new ArrayList<>();

        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.add(b5);
        list.add(b6);
        list.add(b7);
        list.add(b8);
        list.add(b9);
        list.add(b10);

        Map<String, String> bookMapList = list.stream()
                .collect(Collectors.toMap(Book::getBook,Book::getAuthor));

        List<Book> booksWithMoreThan100Pages = list.stream()
                .filter(i -> i.getPage()>100)
                .toList();

        bookMapList.forEach((key, value) -> System.out.println("Book Name: " + key + ", Author: " + value));

        booksWithMoreThan100Pages.forEach(book -> {
            System.out.println("Book Name: " + book.getBook() + ", Pages: " + book.getPage());
        });

    }
}
