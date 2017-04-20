package java1702.javase.collection;

/**
 * Created by 刘晋勇 on.
 * 2017/4/8  8:51.
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer =new StringBuffer("hello");
        stringBuffer.append(" world"); //append 附加 添加
        System.out.println(stringBuffer);
        stringBuffer.delete(5,6);  //Ctrl + Q  delete 删除
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.insert(5,",")); //  insert 插入；嵌入
        System.out.println(stringBuffer.insert(stringBuffer.length(),'!'));//offset 偏移量
        System.out.println(stringBuffer.reverse()); //reverse 颠倒；倒转
        stringBuffer.reverse().setCharAt(0,'H');
        System.out.println(stringBuffer);

    }
}
