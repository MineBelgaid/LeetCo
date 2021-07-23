class MyLinkedList {
    Node head;
    public int length;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = null;
        length = 0;

    }

    /**
     * Get the value of the index-th node in the linked list. If the index is
     * invalid, return -1.
     */
    public int get(int index) {
        if (index < 0 | index >= length) {
            return -1;
        } else {
            Node currNode = head;
            for (int i = 0; i <= index - 1; i++) {
                currNode = currNode.next;
            }
            return currNode.data;
        }

    }

    /**
     * Add a node of value val before the first element of the linked list. After
     * the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        Node new_node = new Node(val, head);
        head = new_node;
        length++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if (length == 0) {
            head = new Node(val, null);
        } else {

            Node new_node = new Node(val, null);
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = new_node;
        }

        length++;

    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index
     * equals to the length of linked list, the node will be appended to the end of
     * linked list. If index is greater than the length, the node will not be
     * inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
        } else {
            Node currNode = head;
            for (int i = 0; i < index - 1; i++) {
                currNode = currNode.next;
            }
            Node new_node = new Node(val, currNode.next);
            currNode.next = new_node;
        }

        length++;

    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index == 0) {
            head = head.next;
            length--;
        }
        if ((index > 0) & (index < length)) {
            Node temp = head;
            for (int k = 0; k < (index - 1); k++) {
                temp = temp.next;

            }
            temp.next = temp.next.next;
            length--;
        }
    }

    private class Node {
        int data;
        Node next;

        Node(int d, Node next) {
            this.data = d;
            this.next = next;
        }

        Node(int d) {
            this.data = d;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList(); int param_1 = obj.get(index);
 * obj.addAtHead(val); obj.addAtTail(val); obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */