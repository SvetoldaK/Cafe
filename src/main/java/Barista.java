import lombok.Data;

@Data
public class Barista {

    private final String name;

    public void barista() {
        Barista barista1 = new Barista("Коля");
        Barista barista2 = new Barista("Петя");
    }

    public void takeOrder(Order order) {
        System.out.println("Бариста " + this.name + " взял заказ");
        Order.order = order;
    }

    public void makeOrder() {
        System.out.println("Бариста " + this.name + " делает заказ");
    }

    public void giveOrder() {
        System.out.println("Бариста " + this.name + " отдал заказ");
        Order.order = null;
    }
}
