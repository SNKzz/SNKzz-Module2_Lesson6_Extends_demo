public class Document {
    private String id = "#0001";
    private String publisher = "Nam";
    private int quantity_publishes = 20;

    protected Document() {
    }

    protected Document(String id, String publisher, int quantity_publishes) {
        this.id = id;
        this.publisher = publisher;
        this.quantity_publishes = quantity_publishes;
    }

    protected String get_id() {
        return this.id;
    }

    protected String get_publisher() {
        return this.publisher;
    }

    protected int get_quantity_publishes() {
        return this.quantity_publishes;
    }

}
