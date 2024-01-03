package Practice.codingTest;

import java.util.Arrays;
import java.util.Scanner;


class Solution {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            int i=0;
            int j=0;
            if(n%2==1 && i%2==1){//n이 홀수면?
                for(i=0;i<n; i++){ // i가 0번째부터 n번째 전까지??  반복문 증가하며 돌아라
                    if(i%2==1){ // i가 홀수면? answer에 n을 넣어라
                        answer+=n;
                    }else{continue;}
                }
            }else{//짝수면?
                for(j=0;j<n; j++){
                    if(j%2==0){
                        answer += n*n;
                    }else{continue;}}
            }
            return answer;
        }}}




//13. 정수를 합쳐서 a+b b+a 중 더 큰 숫자 return 하기 ***** 미완성
//
//class Solution {
//    public int solution(int a, int b) {
//        int answer = 0;
//        String strA;
//        String strB;
//        strA = String.valueOf(a);
//        strB = String.valueOf(b);
//        if(strA+strB > strB+strA){
//
//        }
//
//        return answer;
//    }
//}



//12. 문자열 곱하기
//class Solution {
//    public String solution(String my_string, int k) {
//        String answer = "";
//
////         1. for문 방법
//        // for(int i=0; i<k; i++){
//        // answer += my_string;
//        // }
//// 2. repeat 방법
//        answer = my_string.repeat(k);
//        return answer;
//    }
//}



//11. 문자열 여러개 합치기
//class Solution {
//    public String solution(String[] arr) {
//        return String.join("", arr);
//
//    }
//}



//10. 문자열 섞기 ******미완성
//public static void main(String[] args) {
//   class Solution()
//}
//
//class Solution {
//        public String solution(String str1, String str2){
//            String answer = "";
//            for(int i=0; i<str1.length(); i++){
//                answer += String.valueOf(str1.charAt(i))+String.valueOf(str2.charAt(i));
//            }
//            return answer;
//        }
//    }


//10. 문자열 지정한 자릿수부터 덮어씌우기 ******미완성



//9. 홀수면 n is odd, 짝수면 n is even 출력하기
//public class Solution {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//방법1. if문사용
//        if(n%2==0){
//            System.out.printf("%d is even", n);
//        }else{
//            System.out.printf("%d is odd", n);
//        }
//방법2. 삼항연산자
//        System.out.println((n%2==0)? n+" is even" : n+" is odd" );
//    }
//}


//8.문자열 하나씩 세로로 나열하기..
//public class Solution {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
////방법1. charAt(i)와 for 반복으로 풀기
////        for(int i=0; i<str.length();i++){
////            System.out.println(str.charAt(i));
////        }
//
////        방법2. split으로 풀기..... 어떻게 하지?
//
//        for (int i=0; i<str.length();i++){
//            String[] result = str.split("",str.length());
//            System.out.println(Arrays.toString(result[i].toCharArray()));
//    }
//    }
//}

//못풀엇다 ㅠㅠㅠ
//문제7. 문자열 붙여서 출력하기
//public class Solution {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
////        String result="";
////        for(int i = 0; i < str.length(); i++) {
////            if(str.charAt(i) != ' ')
////                result += str.charAt(i);
////        }System.out.println(result);
//        str = str.replaceAll("\\p{Z}", "");
//        System.out.print(str);
//    }
//}



//문제6. 덧셈식 출력하기
//public class Solution {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        int n = sc.nextInt();
//방법1. for문 사용해서 문자열 그대로 출력하기
//        for (int i=0;i<n;i++){
//             System.out.print(str);
//        }

//방법2. for문 사용 안하고 그냥 repeat n번 사용하기      System.out.print(str.repeat(n));//
////  
//    }}

//문제5. 특수문자 출력하기
//public class Solution {
//        public static void main(String[] args) {
//            System.out.println("!@#$%^&*(\\\'\"<>?:;");
//        }
//    }

//문제4-1. 대문자는 소문자로, 소문자는 대문자로
//public class Solution0 {
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            String a= sc.next();
//            String result="";
//                for(int i=0;i<a.length();i++){
//                    char c= a.charAt(i);
//                    if(Character.isUpperCase(c)){
//                        result += Character.toLowerCase(c);
//                    }else{
//                        result += Character.toUpperCase(c);
//                    }
//                }System.out.print(result);
//        }
//}


//문제4-2
//public class Solution {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.next();
//        String answer = "";
//
//        for(int i=0;i<a.length();i++){
//            char c =a.charAt(i);
//            if(Character.isUpperCase(c)){
//                answer += Character.toLowerCase(c);
//            }else{
//                answer += Character.toUpperCase(c);
//            }
//        }System.out.print(answer);
//        }}



//문제3
//public class Solution {
//    public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            String str = sc.next();
//            int n = sc.nextInt();
//        //for문으로 풀기
//            for(int i=0; i<n; i++){
//            System.out.print(str);}
//        //while문으로 풀기
//        int i = 0;
//        while(i < n){
//            i++;
//            System.out.println(str);}
//    }
//}


//문제2
//public class Solution {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.printf("a = %d"+"\n"+"b = %d",a, b);
//}}

//문제1
//public class Solution {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str= sc.next();
//        if(str==str){
//            System.out.println(str);
//        }
//    }
//}
