package pl.prusinowski;

public class LinkedList {
    private Node head = null;
    private int size =0 ;

    public int getSize() {
        return size;
    }

    public void add(int value){
        if (this.head == null){
            this.head = new Node();
            this.head.setValue(value);
            this.head.setNode(new Node());

        }else {
            Node currentNode = this.head.getNode();
            while(currentNode.getNode()!=null){
                currentNode = currentNode.getNode();
            }
                currentNode.setValue(value);
                currentNode.setNode(new Node());

        }
        size++;
    }
    public boolean search(int searchingValue){
        Node currentNode = this.head;
        while (currentNode.getNode() !=null){
            if (currentNode.getValue() == searchingValue){
                return true;
            }
            currentNode = currentNode.getNode();
        }
        return false;
    }

    public void delete(int value){
        Node previousNode =null;
        Node currentNode = this.head;
        while (currentNode.getNode() !=null){
            if (currentNode.getValue() == value){
                if (currentNode.getNode() == null){
                    previousNode.setNode(new Node());
                    clear(currentNode);
                }else if (previousNode ==null){
                    clear(currentNode);
                }else{
                    clear(currentNode);
                    previousNode.setNode(currentNode.getNode());
                }
            }
            previousNode = currentNode;
            currentNode = currentNode.getNode();
        }
        size--;
    }
    private void clear(Node node){
        node.setNode(new Node());
        node.setValue(0);
    }


}
