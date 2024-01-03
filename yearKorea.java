package Practice.codingTest;

// korea 입력하면 한국나이 ( 현재연도 - 출생연도 +1)
// year 이나 나머지 입력하면 연 나이 ( 현재연도 - 출생연도)
//기준 연도 입력, 출생연도 입력

import java.util.Scanner;

public class yearKorea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("나이 유형를 입력하세요. ex)  korea : 한국 나이/ 그 외: 연 나이");
        String ageType= sc.next();
        System.out.println("기준 연도를 입력하세요");
        int thisYear= sc.nextInt();
        System.out.println("출생 연도를 입력하세요");
        int birthYear= sc.nextInt();

        if(ageType.equals("korea")){
            int a = thisYear - birthYear + 1;
            System.out.printf("한국 나이 : %d", a);
        }else{
            int b = thisYear - birthYear;
            System.out.printf("연 나이 : %d", b);
        }

    }
}
