package practice.code.interfacedemo;

/**
 * Description:
 * date: 2020 2020/8/10 17:04
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class USBTest {
    public static void main(String[] args) {

        Computer com = new Computer();
        Flash flash = new Flash();
        com.transferData(flash);

        USB usb = new USB() {
            public void start() {
                System.out.println("aaaa");
            }

            public void stop() {
                System.out.println("bbbb");
            }
        };

    }
}

class Computer{
    public  void transferData(USB usb){
        usb.start();
        System.out.println("具体传输细节");
        usb.stop();
    }
}

interface USB{

    void start();

    void stop();
}

class Flash implements USB{

    public void start() {
        System.out.println("U盘开启工作");
    }

    public void stop() {
        System.out.println("U盘结束工作");
    }
}

class Printer implements USB{

    public void start() {
        System.out.println("打印机开启工作");
    }

    public void stop() {
        System.out.println("打印机结束工作");
    }
}