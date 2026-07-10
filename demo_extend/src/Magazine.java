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
        if (this.number_publish != 0) {
            System.out.println("Magazine: \n- Id document: " + super.get_id() + "\n- Publisher: "
                    + super.get_publisher() + "\n- Quantity publisher: "
                    + super.get_quantity_publishes() + "\n- Number of publishing: " + this.number_publish
                    + "\n- Month of publishing: " + this.month_publish + "\n");
        } else {
            System.out.println("=> Magazine has not been created !!");
        }

    }
}
