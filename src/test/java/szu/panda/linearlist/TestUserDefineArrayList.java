package szu.panda.linearlist;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author : wuniting
 * @date :   2020-02-07
 * @description :
 */
public class TestUserDefineArrayList {

    @Test
    public void testArrayList(){
        ArrayList<String> arrayList = new ArrayList<>();


        UserDefineArrayList<String> userDefineArrayList = new UserDefineArrayList<>();
        userDefineArrayList.add("Panda");
        userDefineArrayList.add("Vander");
        System.out.println(userDefineArrayList.get(0));
        System.out.println(userDefineArrayList.get(1));
        System.out.println(userDefineArrayList.size());
        userDefineArrayList.delete(1);
        System.out.println(userDefineArrayList.size());
        userDefineArrayList.insert(0, "Vander");

        System.out.println(userDefineArrayList.size());
        int size = userDefineArrayList.size();
        for (int i = 0; i < size; i++) {
            System.out.println(userDefineArrayList.get(i));
        }
    }
}
