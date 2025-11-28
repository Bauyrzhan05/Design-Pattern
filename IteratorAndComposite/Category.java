package IteratorAndComposite;

import java.util.ArrayList;
import java.util.List;

public class Category extends CatalogComponent {
    private List<CatalogComponent> children = new ArrayList<>();

    public Category(String name) {
        super(name);
    }

    @Override
    public void add(CatalogComponent component) {
        children.add(component);
    }

    @Override
    public List<CatalogComponent> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return "Category: " + name;
    }
}

