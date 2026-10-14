import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    String name;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "{ name: '" + name + "', price: " + price + " }";
    }
}

public class Assignment6 {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 800));
        products.add(new Product("Mouse", 25));
        products.add(new Product("Keyboard", 45));

        System.out.println("-- All Products (forEach) --");

        products.forEach(p -> System.out.println(
                "Item: " + p.name + " - Price: $" + p.price));

        System.out.println("\n-- Filtered Products (Price < $50) --");

        List<Product> filtered = products.stream()
                .filter(p -> p.price < 50)
                .collect(Collectors.toList());

        System.out.println(filtered);

        System.out.println("\n-- Mapped Product Tags (map) --");

        List<String> tags = products.stream()
                .map(p -> p.name.toUpperCase()
                        + " costs $" + p.price)
                .collect(Collectors.toList());

        System.out.println(tags);
    }
}