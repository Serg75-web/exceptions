import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopRepositoryTest {

    Product item1 = new Product(10, "Milk", 25);
    Product item2 = new Product(12, "Bread", 67);
    Product item3 = new Product(17, "Orange", 91);

    @Test

    public void test() {

        ShopRepository repo = new ShopRepository();

        repo.add(item1);
        repo.add(item2);
        repo.add(item3);

        repo.remove(10);

        Product[] expected = {item2, item3};
        Product[] actual = repo.findAll();
    }

    @Test
    public void test1() {

        ShopRepository repo = new ShopRepository();

        repo.add(item1);
        repo.add(item2);
        repo.add(item3);

        Assertions.assertThrows(NotFoundException.class, () -> {
            repo.remove(13);
        });

    }


}
