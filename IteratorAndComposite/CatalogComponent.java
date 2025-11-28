package IteratorAndComposite;

import java.util.List;

public abstract class CatalogComponent {
    protected String name;

    public CatalogComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add(CatalogComponent component) {
        throw new UnsupportedOperationException();
    }

    public List<CatalogComponent> getChildren() {
        throw new UnsupportedOperationException();
    }

    public boolean isLeaf() {
        return false;
    }

    public void showAllProducts() {
        Iterator iterator = new CatalogIterator(this);
        while (iterator.hasMore()) {
            System.out.println(iterator.getNext());
        }
    }
}

