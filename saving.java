//package Practice;
//
//import java.util.Scanner;
//
////예제2.
////첫 달에 일정 금액을 저축,
////그 다음부터 70만원이 될 때까지 매월 같은 금액을 저축해서 70만원이 될 때까지 반복한다.
////그 후, 70만원이 넘은 시점부터는 매월 더 많은 같은 금액을 저축하여 100만원이 될 때까지 반복한다..
////목표액 100만원까지 몇 번을 저축해야 하는지 구하기
////** 입력값은 총 3번이다. 첫 달 저축액, 1~70까지의 매월 저축액,  70~100까지의 매월 저축액
////** 출력값은 100만원에 도달하기까지 총 저축한 횟수.
//public class saving {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int goal = 100;
//        int a=0;
//        int b=0;
//
////        System.out.println("목표 저축 금액을 입력하세요. (단위:만원)");
////        int goal = sc.nextInt();
//        System.out.println("첫 달 저축액을 입력하세요. 몇 만원?");
//        int start = sc.nextInt();
//        System.out.println("그 후, 저축금액이 70만원이 될 때까지 매월 저축할 금액은?");
//        int before = sc.nextInt();
//        System.out.println("저축금액이 목표 금액 100만원에 도달할 때까지 매월 저축할 금액은? 조금 더 높게 저축하세요!");
//        int after = sc.nextInt();
//
//        if (start < 70) {
//            for(int i=0;i<10;i++){
//                a= start+before;
//                return{(start+before)<=70};
//                System.out.println(i);
//            } {
//                a = start;
//                a+=before;
//
//                System.out.println(a);
//            }System.out.println(a);
//            System.out.println(i+1);
//
//        } else if (start >= 70) {
//            b=start;
//            b += after;
//            }System.out.println(b);
//
//        }
//
//
////        if (0 < start && start < 70) {
////            int a = goal-start;
////            while(a<(goal*0.7)){
////                int i=0;
////                a=r-before;
////            System.out.println(a);
////            a=a-before;
////            System.out.println(a);
////            System.out.println(i);
////            break()
////            }
////            for (int i = 0; i < 10; i++) {
////                a = start + (before * i);
////            times = i+1;
////            return();
////            }
//
////            int b = r - start;
////            for (int j = 0; j > 70 && j <= 100; j++) {
////            }
////            System.out.printf("저축금액2 : %d", (r - before));
////            System.out.printf("%d회", (a + 1));
////
////            System.out.println(" ");
////            System.out.printf("저축금액3 : %d ", (r - after));
////            System.out.println(" ");
////            System.out.printf("%d", (r - after));
////            System.out.println(" ");
////
////        } else if (70 <= start) {
////            for (int j = 0; j > 70 && j <= goal; j--) {
////                int b = start + after;
////                System.out.printf("저축금액3 : %d", (r - after));
////                System.out.println(" ");
////                System.out.printf("%d", (j + 1));
////                System.out.println(" ");
////            }
////        }
//
////    }
//}
