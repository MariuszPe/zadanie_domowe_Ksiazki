import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean isOver;
        int bookCounter = 0;
        Books[] book = new Books[10];

        Scanner inputBook = new Scanner(System.in);
        System.out.println("Enter a new book to the list");

        do {
            book[bookCounter] = new Books();

            System.out.print("Author: ");
            book[bookCounter].setAuthor(inputBook.nextLine());
            System.out.print("Title: ");
            book[bookCounter].setTitle(inputBook.nextLine());
            System.out.print("Short description: ");
            book[bookCounter].setDescription(inputBook.nextLine());
            System.out.print("Pages quantity: ");
            book[bookCounter].setQuantityOfPages(inputBook.nextInt());
            System.out.println("Do you want to enter another position? (y/n)");
            isOver = inputBook.next().equals("n");

            bookCounter++;
            inputBook.nextLine();
        } while (!isOver);

        for (int i = 0; i < bookCounter; i++) {
            System.out.println(book[i]);
        }


        System.out.println("Bye bye!");
        inputBook.close();
    }
}
