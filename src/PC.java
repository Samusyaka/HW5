import java.util.Random;
import java.util.Scanner;

public class PC {

    public static void main(String[] args) {
        PC pc = new PC("AMD Athlon 2500", "2 GB", "250 GB", "GeForce440MX", 5);
        pc.pcdetails();
        pc.TurnOn();
        pc.TurnOff();
    }

    boolean fail = false;
    String cpu;
    String ram;
    String hdd;
    String vga;
    int resource;
    int count = 0;

    PC(String cpu, String ram, String hdd, String vga, int resource) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.vga = vga;
        this.resource = resource;
    }

    void pcdetails() {

        System.out.printf("BIOS information \nCPU: %s \nRAM: %s \nHDD: %s \nVideo: %s \nРесурс: %d \n", cpu, ram, hdd, vga, resource);
    }


    void TurnOn() {
        if (fail) {
            System.out.println("Компьютер не работает");
            return;
        }
        count ++;
        if (count > resource) {
            System.out.println("Ресурс исчерпан");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите число 0 или 1");
        int userenter = scanner.nextInt();
        int cpurandom = rand.nextInt(2);
        if (userenter == cpurandom) {
            System.out.println("Компьютер включен");

        } else {
            fail = true;
            System.out.println("Компьютер сгорел");
        }
    }

    void TurnOff() {
        if (fail) {
            System.out.println("Компьютер не работает");
            return;
        }
        count ++;
        if (count > resource) {
            System.out.println("Ресурс исчерпан");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите число 0 или 1");
        int userenter = scanner.nextInt();
        int cpurandom = rand.nextInt(2);
        if (userenter == cpurandom) {
            System.out.println("Компьютер выключен");

        } else {
            fail = true;
            System.out.println("Компьютер сгорел");
        }
        if (count > resource) {
            System.out.println("Ресурс исчерпан");
        }
    }
}