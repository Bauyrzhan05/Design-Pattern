package IteratorAndComposite;

public class Product extends CatalogComponent {
    public Product(String name) {
        super(name);
    }

    @Override
    public boolean isLeaf() {
        return true;
    }

    @Override
    public String toString() {
        return "Product: " + name;
    }
}
