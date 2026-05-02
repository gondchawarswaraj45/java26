class Library {

    static String libraryName;

    static {
        libraryName = "City Central Library";
        System.out.println("Static block: Library initialized");
    }

    static void showLibrary() {
        System.out.println("Library Name: " + libraryName);
    }
}

class Book {

    String bookName;
    int bookId;

    {
        System.out.println("Instance block: Book object created");
    }

    Book(String name, int id) {
        bookName = name;
        bookId = id;
    }

    void showBook() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Book ID: " + bookId);
    }
}

class MainLibrary {
    public static void main(String[] args) {

        Library.showLibrary();
        System.out.println();

        Book b1 = new Book("Java Programming", 101);
        b1.showBook();

        System.out.println();

        Book b2 = new Book("Data Structures", 102);
        b2.showBook();
    }
}
