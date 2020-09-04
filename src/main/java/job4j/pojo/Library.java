package job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = new Book();

        book1.setName("Clean Code");

        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;

        print(books);
        System.out.println();
        swap(books, 0 , 3);
        System.out.println();
        print(books);
        System.out.println();
        printCleanCode(books);
    }


    private static void swap(Book[] books, int index1, int index2) {
        Book tmp = books[index1];
        books[index1] = books[index2];
        books[index2] = tmp;
    }

    private static void print(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }

    private static void printCleanCode(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean Code")) {
                System.out.println(books[i]);
            }
        }
    }
}
