package java1702.javase.reflect.demo.b;

/**
 * Created by ${刘晋勇}
 * on 2017/5/5.
 */
public class Test {
    public static void main(String[] args) {
        Service service = new Service(new FloppyWriter());
//        service.setDeviceWriter(new PortableHdWriter());
        service.write();
    }
}
