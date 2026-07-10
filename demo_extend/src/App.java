public class App {
    public static void main(String[] args) throws Exception {
        Book book = new Book();
        Magazine magazine = new Magazine();

        book.set_authorizer("Alan");
        book.set_quantity_pages(50);
        book.get_book();

        magazine.set_month(6);
        magazine.set_number_publish(12);
        magazine.get_magazine();
    }
}
