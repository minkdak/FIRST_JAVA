package array;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 노란줄 나오는 이유 - <> 제너릭
        // <> 타입 지정하지않으면 Object가 자동으로 들어감.
        ArrayList<String> list = new ArrayList();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        for(int i = 0; i < list.size(); i++) {
            String str= list.get(i);
            System.out.println(str);
        }

        for(String str: list) {
            System.out.println(str);
        }

    }

}
