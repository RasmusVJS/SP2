public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {
        Author author1 = new Author("Rasmus Svendsen");
        PrintedBook book1 = new PrintedBook("Chapter 1: Hero", "SKØN", 10, 200);
        PrintedBook book2 = new PrintedBook("Chapter 2: Spectre", "FAG", 5, 500);
        AudioBook book3 = new AudioBook("Chapter 3: Dragon", "SKØN", 20, 600);
        author1.addTitle(book1);
        author1.addTitle(book2);
        author1.addTitle(book3);
        System.out.println(author1.getName() + ": " + author1.calculateTotalPay() + "kr");
    }
}
