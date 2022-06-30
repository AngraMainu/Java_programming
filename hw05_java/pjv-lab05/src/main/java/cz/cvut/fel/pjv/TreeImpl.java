package cz.cvut.fel.pjv;

import java.util.Arrays;

public class TreeImpl implements Tree {


    NodeImpl root = null;


    public void setTree(int[] values){
        if(values.length > 0) {
            root = new NodeImpl();
            InitNodes(values, root);
        }
    }

    public void InitNodes(int[] values, NodeImpl node) {
        if(values.length > 0){
            System.out.println(Arrays.toString(values));
            node.setValue(values[ values.length/2 ]);
            if(values.length > 2) {

                //Part of the array to the left from the parent value
                InitChildLeft(node);
                InitNodes(Arrays.copyOfRange(values, 0, values.length / 2), (NodeImpl) node.getLeft());

                //Part of the array to the right from the parent value
                InitChildRight(node);
                InitNodes(Arrays.copyOfRange(values, values.length / 2 + 1, values.length), (NodeImpl) node.getRight());
            } else if(values.length == 2){
                //Part of the array to the left from the parent value
                InitChildLeft(node);
                InitNodes(Arrays.copyOfRange(values, 0, values.length / 2), (NodeImpl) node.getLeft());;
            }
        }
    }

    public void InitChildLeft(NodeImpl node){
        NodeImpl childLeft = new NodeImpl();
        node.setLeft_child(childLeft);
        ((NodeImpl) node.getLeft()) .setParent(node);
    }

    public void InitChildRight(NodeImpl node){
        NodeImpl childRight = new NodeImpl();
        node.setRight_child(childRight);
        ((NodeImpl) node.getRight()) .setParent(node);
    }


    public Node getRoot(){
        return root;
    }

    public String toString(){
       return root == null ? "" : buildString("", root, 0);
    }

    public String buildString (String string, NodeImpl node, int prefixSize){

        string += (new String(new char[prefixSize]).replace("\0", " ")) + "- " + node.getValue() + '\n';

        if(node.getLeft() != null){
            string = buildString(string, (NodeImpl) node.getLeft(),prefixSize+ 1);
        }

        if(node.getRight() != null){
            string = buildString(string, (NodeImpl) node.getRight(),prefixSize + 1);
        }

        return string;
    }

}
