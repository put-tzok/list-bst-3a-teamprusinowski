package pl.prusinowski;

import javax.swing.*;

public class Bst {
    private BstNode core =null;
    private int size= 0;

    public void insert(int value){
        if (this.core == null){
            this.core = new BstNode(value);
        }else{
            BstNode currentNode = this.core;
            while(true){
                if (currentNode.getValue() >= value )
                {
                    if (currentNode.getLeft() ==null)
                    {
                        currentNode.setLeft(new BstNode(value));
                        break;
                    }else
                    {
                        currentNode = currentNode.getLeft();
                    }

                }else if (currentNode.getValue() < value )
                {
                    if (currentNode.getRight() ==null)
                    {
                        currentNode.setRight(new BstNode(value));
                        break;
                    }else
                    {
                        currentNode = currentNode.getRight();
                    }
                }
            }

        }
        size++;
    }



    public int getSize() {
        return size;
    }

    public boolean search(int value){
        BstNode currentNode = this.core;
        while(true){
            if (currentNode.getValue() < value )
            {
                if (currentNode.getRight() == null){
                    return false;
                }

                currentNode = currentNode.getRight();


            }else if (currentNode.getValue() > value )
            {
                if (currentNode.getLeft() == null){
                    return false;
                }

                currentNode = currentNode.getLeft();
            }else if (currentNode.getValue() == value){
                return true;
            }
        }
    }
    public int max(){
        BstNode currentNode = this.core;
        while (currentNode.getRight() !=null){
            currentNode = currentNode.getRight();
        }
        return currentNode.getValue();
    }
    public BstNode nextHigher(BstNode core){
        BstNode currentNode = core.getRight();
        while (currentNode.getLeft() !=null){
            currentNode = currentNode.getLeft();
        }
        return currentNode;
    }

    public boolean delete(int value){
        BstNode currentNode = this.core;
        if(search(value)){
            while(true){
                if (currentNode.getValue() < value )
                {
                    currentNode = currentNode.getRight();
                }else if (currentNode.getValue() > value )
                {
                    currentNode = currentNode.getLeft();
                }else if (currentNode.getValue() == value){
                    if (hasNoChild(currentNode)){
                        currentNode.clean();
                        return true;
                    }else if (hasOneChild(currentNode)){
                        replace(currentNode);
                        return true;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private void replace(BstNode currentNode) {
        if (currentNode.getRight()==null){
            currentNode.setValue(currentNode.getLeft().getValue());
            currentNode.setLeft(null);

        }else if (currentNode.getLeft() ==null){
            currentNode.setValue(currentNode.getRight().getValue());
            currentNode.setRight(null);

        }

    }

    private boolean hasNoChild(BstNode node){
        return node.getRight() ==null && node.getLeft()==null;
    }
    private boolean hasOneChild(BstNode node){
        return node.getRight() ==null || node.getLeft()==null;
    }
    public void print(){
        System.out.println(core.getRight().getRight().getValue());

    }


}
