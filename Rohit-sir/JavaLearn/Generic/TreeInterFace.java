interface TreeInterFace<T> extends Iterable<T> {

    public T getRootValue();
    public TreeNode<T> removeTop();
    public void addElement(T node);

}