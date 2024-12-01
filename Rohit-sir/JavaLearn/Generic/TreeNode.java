
public class TreeNode<T> {

    private T data;
    private TreeNode<T> left;
    private TreeNode<T> right;
    public void setValue(T data){
        this.data = data;
    }
    public T getValue(){
        return data;
    }
    protected  void setLeftNode(TreeNode<T>node){
        this.left = node;
    }
    protected  void setRightNode(TreeNode<T> node){
        this.right = node;
    }
    protected  TreeNode<T> getLeftNode() {
        return this.left;
    }
    protected  TreeNode<T> getRightNode(){
        return this.right;
    }
}


