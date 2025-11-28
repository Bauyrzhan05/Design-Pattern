package IteratorTree;

import java.util.Stack;

public class PreorderIterator<T> implements Iterator<T> {
    private Stack<TreeNode<T>> stack = new Stack<>();

    public PreorderIterator(TreeNode<T> root) {
        if (root != null) stack.push(root);
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public T next() {
        TreeNode<T> node = stack.pop();
        if (node.right != null) stack.push(node.right);
        if (node.left != null) stack.push(node.left);
        return node.data;
    }
}

