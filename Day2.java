import java.util.Scanner;

public class Day2 {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int[] time = new int[arr1.length];
        int sum = 0;
        for(int i=0;i<arr1.length;i++){
            if(arr2[i]<29) {
                time[i] = arr2[i] - arr1[i];
                sum += time[i];
            }else{
                arr2[i]=21;
                time[i] = arr2[i] - arr1[i];
                sum += time[i];
            }
        }
        answer = sum;
        return answer;
    }

    public static void main(String[] args) {
        Day2 method = new Day2();
        int[] arr1 = {9, 7, 8, 9, 7, 9, 8};
        int[] arr2 = {23, 22, 26, 26, 29, 27, 22};
        System.out.println(method.solution(arr1, arr2));
    }
}
class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//a는 홀수
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i <= a / 2) {//2차함수 그래프? 위에 쪽
                    if (i + j <= a / 2 - 1)//
                        System.out.print(" ");
                    else if (j - i >= a/2 + 1)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                } else if (i > a/2) {// 아래 쪽
                    if (i - j >= a/2 + 1)
                        System.out.print(" ");
                    else if (j + i >= a/2*3 + 1)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}