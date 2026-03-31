class LibraryBook {
    String title, author;
    double price;
    boolean available=true;

    LibraryBook(String t,String a,double p){ title=t; author=a; price=p; }
    void borrowBook(){ if(available){ available=false; } }
}
