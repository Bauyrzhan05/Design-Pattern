package IteratorTree;

import java.util.LinkedList;
import java.util.Queue;

public class BFSIterator<T> implements Iterator<T> {
    private Queue<TreeNode<T>> queue = new LinkedList<>();

    public BFSIterator(TreeNode<T> root) {
        if (root != null) queue.add(root);
    }

    public boolean hasNext() {
        return !queue.isEmpty();
    }

    public T next() {
        TreeNode<T> node = queue.poll();
        if (node.left != null) queue.add(node.left);
        if (node.right != null) queue.add(node.right);
        return node.data;
    }
}

