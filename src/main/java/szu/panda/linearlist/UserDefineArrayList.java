package szu.panda.linearlist;

/**
 * @author : wuniting
 * @date :   2020-02-06
 * @description :
 */
public class UserDefineArrayList<T extends Object> {

    private T[] data;
    private int MAX_LENGTH = 65535;
    private int length = 0;

    public  UserDefineArrayList(){
        data = (T[]) new Object[MAX_LENGTH];
    }

    public T get(int i) {
        if (i < 0 || i > length) {
            throw new IndexOutOfBoundsException("输入的数组下标异常");
        } else {
            return data[i];
        }
    }

    public void add(T e) {
        if(length >= MAX_LENGTH){
            throw new IndexOutOfBoundsException("数组溢出");
        } else {
            data[length] = e;
            length++;
        }
    }

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

    public int size(){
        return length;
    }

}
