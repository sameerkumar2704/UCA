
import java.util.Iterator;

public class CustomBinarSerachTree<T extends Comparable<T>> implements TreeInterFace<T> {

    private TreeNode<T> root = null;

    @Override
    public T getRootValue() {
        return root == null ? null : root.getValue();
    }

    @Override
    public Iterator<T> iterator() {
        return new BinarySearchTreeItr();
    }

    private TreeNode<T> getLeafNode(TreeNode<T> root) {
        if (root == null) {
            return null;
        }
        if (root.getLeftNode() == null && root.getRightNode() == null) {
            return root;
        }

        TreeNode<T> left = getLeafNode(root.getLeftNode());
        if (left != null) {
            return left;
        }
        TreeNode<T> right = getLeafNode(root.getRightNode());
        return right;
    }

    @Override
    public TreeNode<T> removeTop() {
        if (root == null) {
            return null;
        }
        TreeNode<T> temp = root;
        TreeNode<T> left_root = this.root.getLeftNode();
        TreeNode<T> right_root = this.root.getRightNode();
        if (left_root != null && right_root != null) {
            getLeafNode(right_root).setLeftNode(left_root);
            this.root = right_root;
        } else if (left_root == null) {
            this.root = right_root;
        } else if (right_root == null) {
            this.root = left_root;
        }

        return temp;
    }

    @Override
    public void addElement(T value) {

        TreeNode<T> node = new TreeNode();
        node.setValue(value);
        if (root == null) {
            root = node;
            return;
        }
        TreeNode<T> start = root;
        TreeNode<T> prev_node = null;
        while (start != null) {
            prev_node = start;
            if (start.getValue().compareTo(node.getValue()) < 0) {
                start = start.getRightNode();
            } else {
                start = start.getLeftNode();
            }

        }
        if (prev_node.getValue().compareTo(node.getValue()) < 0) {
            prev_node.setRightNode(node);

           
        } else {
            prev_node.setLeftNode(node);
        }


    }
    private void Inorder(TreeNode<T> root){
        if(root == null) {System.out.println("null"); return ;}
        Inorder(root.getLeftNode());
        Inorder(root.getRightNode());
        System.out.println(root.getValue());
    }
    public void PrintTree(){
        Inorder(root);
    }

    private class BinarySearchTreeItr implements Iterator<T> {

        @Override
        public boolean hasNext() {

            return root != null;
        }

        @Override
        public T next() {
            T value = root.getValue();
            removeTop();
            return value;
        }

    }


}
