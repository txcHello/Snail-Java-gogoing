package dataStructure.doubleLinkedList;

/**
 * @Author Administrator
 * @Date 2023/2/2 16:58
 * @Version 1.0
 * Desc:
 */
public class DoubleLinkedListNode {
    private String value;
    private DoubleLinkedListNode pre;
    private DoubleLinkedList next;

    public DoubleLinkedListNode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public DoubleLinkedListNode getPre() {
        return pre;
    }

    public void setPre(DoubleLinkedListNode pre) {
        this.pre = pre;
    }

    public DoubleLinkedList getNext() {
        return next;
    }

    public void setNext(DoubleLinkedList next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "DoubleLinkedListNode{" +
                "value='" + value + '\'' +
                ", pre=" + pre +
                ", next=" + next +
                '}';
    }
}
