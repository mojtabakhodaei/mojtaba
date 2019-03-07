import java.util.Scanner;

public class HW2Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your sentence :");
        String str = scanner.nextLine();

        char selectchar;
        int repeatspace = 0;
        for (int j = 0; j < str.length(); j++) {
            if (' ' == str.charAt(j))
                repeatspace++;
        }
        System.out.println("character \" \" is repeated \t" + repeatspace + " time/times");

        for (int i = 0; i < str.length(); i++) {
            selectchar = str.charAt(i);
            int repeatnum = 0;
            if (selectchar != ' ') {
                for (int j = 0; j < str.length(); j++) {
                    if (selectchar == str.charAt(j))
                        repeatnum++;
                }
                System.out.println("character \"" + selectchar + "\" is repeated \t" + repeatnum + " time/times");
                str = str.replace(selectchar, ' ');
            }
        }
    }
}
