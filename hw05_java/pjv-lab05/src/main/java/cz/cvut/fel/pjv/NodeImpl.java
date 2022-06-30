package cz.cvut.fel.pjv;

public class NodeImpl extends TreeImpl implements Node{
    int value = 0;
    NodeImpl childLeft = null;
    NodeImpl childRight = null;
    NodeImpl parent = null;

    public Node getLeft(){
        return childLeft;
    }

    public Node getRight(){
        return childRight;
    }

    public Node getParent() {
        return parent;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int val) {
        value = val;
    }

    public void setLeft_child(NodeImpl node) {
        if (node != null) {this.childLeft = node;}
    }

    public void setRight_child(NodeImpl node) {
        if (node != null) {this.childRight = node;}
    }

    public void setParent(NodeImpl node) {
        if (node != null) {this.parent = node;}
    }
}
