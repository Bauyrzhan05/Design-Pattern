package IteratorTree;

import java.util.Stack;

public class InorderIterator<T> implements Iterator<T> {
    private Stack<TreeNode<T>> stack = new Stack<>();
    private TreeNode<T> current;

    public InorderIterator(TreeNode<T> root) {
        current = root;
    }

    public boolean hasNext() {
        return !stack.isEmpty() || current != null;
    }

    public T next() {
        while (current != null) {
            stack.push(current);
            current = current.left;
        }
        current = stack.pop();
        T result = current.data;
        current = current.right;
        return result;
    }
}

