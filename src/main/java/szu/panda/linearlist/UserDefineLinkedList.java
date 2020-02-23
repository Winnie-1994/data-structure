package szu.panda.linearlist;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.ws.soap.Addressing;

/**
 * @author : wuniting
 * @date :   2020/2/16
 * @description : 线性表的链式存储结构——单链表
 */
public class UserDefineLinkedList <T>{

    Node<Object> node;

    int size = 0;

    @AllArgsConstructor
    @NoArgsConstructor
    class Node<T>{
        /**
         * 结点元素值
         */
        Object data;

        /**
         * 下一结点
         */
        Node<T> next;
    }

    public UserDefineLinkedList(){
        this.node = new Node<>();
        node.next = null;
    }

    /**
     * 获取第i个位置的结点元素值
     * @param i
     * @return
     */
    public T get(int i){
        Node<Object> temp = this.node.next;
        int j = 1;
        while (j < i){
            temp = temp.next;
            if(temp == null){
                throw new IndexOutOfBoundsException("链表第i个元素不存在");
            }
            j++;
        }
        return (T)temp.data;
    }

    /**
     * 往链表末尾增加结点
     * @param e
     */
    public void add(T e){
        Node<Object> temp, newNode;
        temp = this.node;
        newNode = new Node<>();
        while (temp.next != null){
            temp = temp.next;
        }
        newNode.data = e;
        newNode.next = null;
        temp.next = newNode;
        this.size++;
    }

    /**
     * 往链表第i个位置之前插入新的元素e
     * @param i
     * @param e
     */
    public void insert(int i, T e){
        Node<Object> temp, newNode;
        temp = this.node;
        newNode = new Node<>();
        int j = 1;
        while (j < i){
            temp = temp.next;
            if (temp == null){
                throw new IndexOutOfBoundsException("链表插入元素：第i个元素不存在");
            }
            j++;
        }
        newNode.data = e;
        newNode.next = temp.next;
        temp.next = newNode;
        this.size++;
    }

    /**
     * 删除第i个数据元素
     * @param i
     */
    public T delete(int i){
        Node<Object> temp1, temp2;
        temp1 = this.node;
        int j =1;
        while (j < i){
            temp1 = temp1.next;
            if(temp1 == null){
                throw new IndexOutOfBoundsException("链表删除元素：第i个元素不存在");
            }
            j++;
        }
        temp2 = temp1.next;
        temp1.next = temp2.next;
        T e = (T)temp2.data;
        temp2 = null;
        return e;
    }

}
