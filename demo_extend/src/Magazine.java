public class Magazine extends Document {
    private int number_publish;
    private int month_publish;

    public Magazine() {
    }

    public void set_month(int month_publish) {
        if (month_publish < 1 || month_publish > 12) {
            System.out.println("=> Month must be between 1 -> 12 !!!");
        } else {
            this.month_publish = month_publish;
        }
    }

    public void set_number_publish(int number_publish) {
        if (number_publish < 0) {
            System.out.println("=> Number publishes must be greater than 0 !!");
        } else {
            this.number_publish = number_publish;
        }
    }

    public void get_magazine() {
        System.out.println("Book: " + super.get_id() + " - " + super.get_publisher() + " - "
                + super.get_quantity_publishes() + " - " + this.number_publish + " - " + this.month_publish);
    }
}
