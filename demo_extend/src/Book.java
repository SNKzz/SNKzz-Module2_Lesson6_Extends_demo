public class Book extends Document {
    private String authorizer;
    private int quantity_pages;

    public Book() {
    }

    public void set_authorizer(String authorizer) {
        this.authorizer = authorizer;
    }

    public void set_quantity_pages(int quantity_pages) {
        if (quantity_pages < 1) {
            System.out.println("=> Quantity of pages must be greater than 1 !!");
        } else {
            this.quantity_pages = quantity_pages;
        }
    }

    public void get_book() {
        System.out.println("Book: " + super.get_id() + " - " + super.get_publisher() + " - "
                + super.get_quantity_publishes() + " - " + this.authorizer + " - " + this.quantity_pages);
    }
}
