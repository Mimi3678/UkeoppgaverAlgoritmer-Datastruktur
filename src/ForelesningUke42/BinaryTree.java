package ForelesningUke42;

public class BinaryTreeNode {

    char value;
    BinaryTreeNode left_child;
    BinaryTreeNode right_child;

    BinaryTreeNode(char value){
        this.value = value;
        this.left_child = null;
        this.right_child = null;
    }

    //lage venstre barn
    void addLeftChild(char value){
        this.left_child = new BinaryTreeNode(value);
    }

    //lage høyre barn
    void addRightChild(char value)
}
