package Factory_Method.Registry_Factory;

import Factory_Method.Simple_Factory.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import Factory_Method.Simple_Factory.ConcreteProductA;
import Factory_Method.Simple_Factory.ConcreteProductB;

public class RegistryFactory {
    private static final Map<String, Supplier<Product>> registry = new HashMap<>();

    public static void registerProduct(String type, Supplier<Product> supplier) {
        registry.put(type, supplier);
    }

    public static Product createProduct(String type) {
        Supplier<Product> supplier = registry.get(type);
        if (supplier != null) {
            return supplier.get();
        }
        return null;
    }
}

// Same Product and ConcreteProduct classes as in the Simple Factory Method example

