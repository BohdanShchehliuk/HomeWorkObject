package Task2_4;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("Sumsung", 120, "AB1234567CD");
        System.out.println(device.toString());
        Monitor monitor = new Monitor("Sumsung", 120, "AB1234567CD", 1280, 1024);
        System.out.println(monitor.toString());
        // перепровірямо метод equals до обєктів класу Device
        Device device1 = new Device("Sumsung", 120, "AB1234567CD");
        Device device2 = new Device(null, 120, "AB1234567CD");
        System.out.println(device1.equals(device));
        System.out.println(device2.equals(device));
        // перепровірямо метод equals до обєктів класу Monitor
        Monitor monitor1 = new Monitor("Sumsung", 120, "AB1234567CD", 1280, 1024);
        Monitor monitor2 = new Monitor("Sumsung", 120, null, 1280, 1024);
        System.out.println(monitor1.equals(monitor));
        System.out.println(monitor2.equals(monitor));
        // перепровірямо метод  hashCode() до обєктів класу Device
        System.out.println(device.hashCode());
        System.out.println(device1.hashCode());
        System.out.println(device2.hashCode());
        // перепровірямо метод hashCode() до обєктів класу Monitor
        System.out.println(monitor.hashCode());
        System.out.println(monitor1.hashCode());
        System.out.println(monitor2.hashCode());
    }
}
