package by.it.koliada._tasks_.lesson01;

public class Main {
    public static void main(String[] args) {
        for (byte i = 0; i != -1; i++) {
            String y = Integer.toOctalString(i);
            String z = Integer.toHexString(i).toUpperCase();
            String binary = Integer.toBinaryString(i);
            if (binary.length() > 8) binary = binary.substring(binary.length() - 8);
            binary = String.format("%8s", binary).replace(" ", "0");
            System.out.print(y + " " + z + " ");
            System.out.printf("%8s %4d %n", binary, i);

        }
        byte mi=-1;
            String y1 = Integer.toOctalString(mi);
            String z1 = Integer.toHexString(mi).toUpperCase();
            String binary1 = Integer.toBinaryString(mi);
            if (binary1.length() > 8) binary1 = binary1.substring(binary1.length() - 8);
            binary1 = String.format("%8s", binary1).replace(" ", "0");
            System.out.print(y1 + " " + z1 + " ");
            System.out.printf("%8s %4d %n", binary1, mi);
    }
}
