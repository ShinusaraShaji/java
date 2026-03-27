import java.util.Scanner;

class Publisher {
    String pubName;

    Publisher(String pubName) {
        this.pubName = pubName;
    }
}

class Book extends Publisher {
    String book;

    Book(String book, String pubName) {
        super(pubName);
        this.book = book;
    }
}

class Literature extends Book {
    String category;

    Literature(String category, String book, String pubName) {
        super(book, pubName);
        this.category = category;
    }

    void display() {
        System.out.println("Publisher: " + pubName);
        System.out.println("Book: " + book);
        System.out.println("Category: " + category);
    }
}

class Fiction extends Book {
    String category;

    Fiction(String category, String book, String pubName) {
        super(book, pubName);
        this.category = category;
    }

    void display() {
        System.out.println("Publisher: " + pubName);
        System.out.println("Book: " + book);
        System.out.println("Category: " + category);
    }
}

public class BookDetails {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Literature Book Details:");
        System.out.print("Book Name: ");
        String b = s.nextLine();

        System.out.print("Publisher: ");
        String pub = s.nextLine();

        System.out.print("Category: ");
        String c = s.nextLine();

       
        Literature ob1 = new Literature(c, b, pub);

        System.out.println("\nEnter Fiction Book Details:");
        System.out.print("Book Name: ");
        String b1 = s.nextLine();

        System.out.print("Publisher: ");
        String pub1 = s.nextLine();

        System.out.print("Category: ");
        String c1 = s.nextLine();

        Fiction ob2 = new Fiction(c1, b1, pub1);

        System.out.println("\nLiterature Book Details:");
        System.out.println("-------------------------");
        ob1.display();

        System.out.println("\nFiction Book Details:");
        System.out.println("-------------------------");
        ob2.display();

        s.close();
    }
}
