package IteratorTree;

import java.util.*;

public class PostorderIterator<T> implements Iterator<T> {
    private Stack<TreeNode<T>> stack = new Stack<>();
    private Stack<T> output = new Stack<>();

    public PostorderIterator(TreeNode<T> root) {
        if (root != null) stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode<T> node = stack.pop();
            output.push(node.data);
            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
        }
    }

    public boolean hasNext() {
        return !output.isEmpty();
    }

    public T next() {
        return output.pop();
    }
}

