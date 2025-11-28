package IteratorAndComposite;

import java.util.*;

public class CatalogIterator implements Iterator {
    private Stack<CatalogComponent> stack = new Stack<>();

    public CatalogIterator(CatalogComponent root) {
        stack.push(root);
    }

    @Override
    public boolean hasMore() {
        while (!stack.isEmpty()) {
            CatalogComponent top = stack.peek();
            if (top.isLeaf()) {
                return true;
            } else {
                stack.pop();
                List<CatalogComponent> children = top.getChildren();
                Collections.reverse(children);
                for (CatalogComponent child : children) {
                    stack.push(child);
                }
            }
        }
        return false;
    }

    @Override
    public CatalogComponent getNext() {
        return hasMore() ? stack.pop() : null;
    }
}

