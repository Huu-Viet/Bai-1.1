import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("nhập họ và tên của bạn: ");
        String ten;
        ten = scanner.nextLine();
        int length = ten.length();
        char[] arrChar = ten.toCharArray();
        for(int i=0;i<length;i++){
            if((i == 0)&& (arrChar[i] != ' ')) arrChar[i] -= 32;
            else if (arrChar[i] == ' ') {
                arrChar[i+1]-=32;
            }
        }
        System.out.println(arrChar);
    }
}