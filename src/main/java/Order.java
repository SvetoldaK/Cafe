import lombok.Data;
import java.util.Random;

@Data
public class Order {

    public static Order order;
    Random RANDOM = new Random();
    int minOrderNumber = 1;
    int maxOrderNumber = 5;

    private final String name;
    private final int orderNumber;

    public void menu() {
        Order name1 = new Order("американо", 1);
        Order name2 = new Order("торт", 2);
        Order name3 = new Order("чай", 3);
        Order name4 = new Order("капучино", 4);
        Order name5 = new Order("панкейк", 5);
    }

    public void order() {
        int number = RANDOM.nextInt(maxOrderNumber);
        switch (number){
            case (1):
                System.out.println("Пришел заказ на американо");
                break;
            case (2):
                System.out.println("Пришел заказ на торт");
                break;
            case (3):
                System.out.println("Пришел заказ на чай");
                break;
            case (4):
                System.out.println("Пришел заказ на капучино");
                break;
            case (5):
                System.out.println("Пришел заказ на панкейк");
                break;
        }
    }
}
