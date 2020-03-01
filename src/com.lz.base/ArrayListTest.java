import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList继承了list接口，实现了4个接口，RandomAccess,Serilizable,Cloneable,AbstractList
 * ArrayList常用方法：add,remove,clear,clone,isEmpty,contains
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);

        //删除位置1上的元素，arraylist从0开始计数
        arrayList.remove(1);
        //克隆方法clone返回一个对象
        Object clone = ((ArrayList<Integer>) arrayList).clone();
        //是否包含5
        System.out.println(arrayList.contains(5));
        System.out.println(arrayList);
        //清除所有元素
        arrayList.clear();
        System.out.println(arrayList);
        //克隆结果
        System.out.println(clone);

    }
}
