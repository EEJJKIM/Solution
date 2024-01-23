import java.util.Arrays;
//짝수홀수 개수
class Solution{
    public static void main(String[] args) {
        int[] num_list={1, 2, 3, 4, 5};
        int[] answer = {};
        int[] odd = {};
        int[] even = {};
        System.out.println("num_list = " + num_list.length);
        for(int i=0; i< num_list.length;i++){ //
            if(num_list[i]%2==1){ //홀수면
                odd+=num_list[i];// odd에 배열에 넣어라
                answer
                System.out.println("abc");
                }else{
//            System.out.println(odd[1]);
        }}
        }

}



//특정한 문자를 대문자로 바꾸기
//class Solution{
//    public static void main(String[] args) {
//        String my_string= "programmers";
//        String alp = "p";
//
//        String answer = "";
//
//        String[] str1= my_string.split("");
//
//
//            for(int i=0; i<str1.length;i++){
//                if(str1[i].equals(alp)){
//                answer += str1[i].toUpperCase();
//                }else{
//                    answer += str1[i];
//                }
//                }System.out.println("str1 = " + answer);
//        }
//    }







//길이에 따른 연산

//class Solution {
//    public static void main(String[] args) {
//        int[] num_list={3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
//        방법1. 내가 푼 것
//        System.out.println("num_list = " + num_list.length);
//        if(num_list.length>=11){
//            answer=0;
//            for(int i=0; i< num_list.length; i++){
//                answer += num_list[i];
//
//            }System.out.println("answer = " + answer);
//       }else {
//            for (int i = 0; i < num_list.length; i++) {
//                answer *= num_list[i];
//
//            }
//            System.out.println("num_list = " + num_list.length);
//            System.out.println("answer = " + answer);
//        }
//        }
//    }

//        //        방법2. 삼항연산 해보자
//        int answer =(num_list.length>=11)? 0 : 1;
//        for(int i=0; i<num_list.length;i++){
//            if(num_list.length>=11){
//                answer+=num_list[i];
//            }else{
//                answer*=num_list[i];
//            }
//        }System.out.println("answer = " + answer);}
//}






//원소들의 곱과 합;
//class Solution{
//    public static void main(String[] args) {
//        int[] num_list={3, 4, 5, 2, 1};
//        int answer = 0;
//        int sum =0;
//        int sumSquare =0;
//        int multiply = 0;
//
//
//        for(int i=0; i<num_list.length; i++){
//            sum = num_list[i];
//        }
//        System.out.println("multiply = " + multiply);
//        System.out.println("sumSquare = " + sum*sum); // 모든 원소의 합의 제곱!!
//
//        for(int j=0; j<num_list.length;j++ ){
//        multiply *= num_list[j];
//
//    }
//        System.out.println("multiply = " + multiply);
//        System.out.println((sum*sum > multiply) ? 1 : 0);
//    }
//}



///홀짝에 따라 다른 값 반환하기 (복습필요!!!!!!!)?????? 1개통과??
//public class Solution{
//    public static void main(String[] args) {
//        int n=7;
//        int answer = 0;
//        if(n%2==1 && n>0){//n이 홀수 && 양수 &&
//            for(int i=1;i<n; i+=2){ // i=n, n부터 시작해서 i++ 전까지??  반복문 증가하며 돌아라
//                // n가 홀수고 양수이면?
//                answer += i; // odd에 n을 넣어라
//                System.out.println("i = " + i);
//            }
//        else if(n%2==0 && n>0){//짝수면?
//            for(int i=1;i<=n; i++){
//                int even += n*n;
//                System.out.println("even = " + even);
//                }
//        }
//        }
//    }







//조건에 맞게 수열 변환하기1---------실패
//public class Solution {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 100, 99, 98};
//        int[] answer = {};
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]>=50 && arr[i]%2==0){ // i번째 배열값이 50이상이면서 짝수이면?
//                answer[i] += arr[i]/2; // 2로 나누고 answer의 i값 배열에 넣기
//                System.out.println("answer[i] = " + answer[i]);
//            }else if(arr[i]<50 && arr[i]%2==1){ // i번째 배열값이 50미만이면서 홀수이면?
//                answer[i] += arr[i]*2;//2를 곱하고 answer의 i값 배열에 넣기
//                System.out.println("answer[i] = " + answer[i]);
//            }else{
//                answer[i] = arr[i];
//                System.out.println("answer[i] = " + answer[i]);
//            }
//        }
//    }
//}



//홀수 vs 짝수 - 완성
//public class Solution{
//    public static void main(String[] args) {
//        int[] num_list = {4, 2, 6, 1, 7, 6};
//        int answer1 = 0;
//        int answer2 = 0;
//        for(int i=0; i<num_list.length; i++){
//            if(i%2==1){ //홀수
//                answer1 += num_list[i]; //answer1에 홀수 배열 넣기
//            }else{ //짝수
//                answer2 +=num_list[i];
//            }
//        }System.out.println((answer1>answer2) ? answer1 : answer2);
//    }}




//        포기...
//            int[] arr = new int[]{1,2,3,100,99,98};
//            int[] answer = {};
//        for(int i=0; i<arr.length; i++) {
//            if (arr[i] >= 50 && arr[i] % 2 == 0) {
//                answer[i] += arr[i] /2;
//                System.out.println("answer1 = " + answer);
//                System.out.println("i = " + i);
//            } else if (arr[i] < 50 && arr[i] * 2 == 1) {
//                answer[i] += arr[i] *2;
//                System.out.println("answer2 = " + answer);
//                System.out.println("i = " + i);
//            } else {
//                answer[i] += 0;
//                System.out.println("answer3 = " + answer);
//                System.out.println("i = " + i);
//            }
//        }
//        System.out.println("answer = " + answer);
//    }
//}




//==========================================================================
//public class Solution{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str1 = sc.next();
//        String str2 = sc.next();
//
//        Aclass a = new Aclass(); // Aclass에대한 인스턴스 생성
//        System.out.println(a.solution(str1,str2));
//    }
//}
//class Aclass {
//    public String solution(String str1, String str2){
//        String answer = "";
//        for(int i=0; i<str1.length(); i++){
//            answer += String.valueOf(str1.charAt(i))+String.valueOf(str2.charAt(i));
//        }
//        return answer;
//    }
//}
//==========================================================================
//class Solution {
//    public String solution(String str1, String str2){
//        String answer = "";
//        for(int i=0; i<str1.length(); i++){
//            answer += String.valueOf(str1.charAt(i))+String.valueOf(str2.charAt(i));
//        }
//        return answer;
//    }
//}
//==========================================================================

//public class Solution {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = a+b;
//        System.out.printf("%d+%d=%d",a,b,c);
//
//    }
//
//    }
