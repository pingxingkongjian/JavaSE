package java1702.javase.reflect.demo.b;

/**
 * Created by ${刘晋勇}
 * on 2017/5/5.
 */
public class Service {
    private DeviceWriter deviceWriter;

    public Service(DeviceWriter deviceWriter) {
        this.deviceWriter = deviceWriter;
    }

//    public void setDeviceWriter(DeviceWriter deviceWriter) {
//        this.deviceWriter = deviceWriter;
//    }

    public void write() {
        deviceWriter.writeToDevice();
    }
}
