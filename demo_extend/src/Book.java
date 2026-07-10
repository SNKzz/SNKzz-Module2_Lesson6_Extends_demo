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
        if (authorizer == null || quantity_pages == 0) {
            System.out.println("=> Book has not been created !!");
        } else {
            System.out.println("Book: \n- Id document: " + super.get_id() + "\n- Publisher: "
                    + super.get_publisher() + "\n- Quantity publisher: "
                    + super.get_quantity_publishes() + "\n- Authorizer: " + this.authorizer
                    + "\n- Quantity of pages: " + this.quantity_pages + "\n");
        }
    }
}
