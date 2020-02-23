package szu.panda.linearlist;

/**
 * @author : wuniting
 * @date :   2020-02-06
 * @description : 线性表的顺序存储结构
 */
public class UserDefineArrayList<T> {

    private Object[] data;
    private int MAX_LENGTH;
    private int length = 0;

    public  UserDefineArrayList(int initialLength){
        this.data = new Object[initialLength];
        this.MAX_LENGTH = initialLength;
    }

    /**
     * 获取data[i]的值
     * @param i
     * @return
     */
    public T get(int i) {
        if (i < 0 || i > length) {
            throw new IndexOutOfBoundsException("输入的数组下标异常");
        } else {
            return (T)data[i];
        }
    }

    /**
     * 往数组末尾增加元素
     * @param e
     */
    public void add(T e) {
        if(length >= MAX_LENGTH){
            throw new IndexOutOfBoundsException("数组溢出");
        } else {
            data[length] = e;
            length++;
        }
    }

    /**
     * 插入元素
     * @param i
     * @param e
     */
    public void insert(int i, T e){
        if(length >= MAX_LENGTH){
            throw new IndexOutOfBoundsException("数组溢出");
        } else if(i < 0 || i >= length){
            throw new IndexOutOfBoundsException("输入的数组下标异常");
        } else {
            for(int m = length-1; m >= i; m--){
                data[m+1] = data[m];
            }
            data[i] = e;
            length++;
        }
    }

    /**
     * 删除data[i]
     * @param i
     */
    public void delete(int i){
        if(length == 0){
            throw new IndexOutOfBoundsException("数组为空");
        } else if(i < 0 || i >= length){
            throw new IndexOutOfBoundsException("输入的数组下标异常");
        } else{
            for(int m = i; m < length-1; m++){
                data[m] = data[m+1];
            }
            length--;
        }
    }

    /**
     * 获取数组大小
     * @return
     */
    public int size(){
        return length;
    }

}
