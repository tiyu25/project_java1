package calculator;

import java.beans.PropertyEditorSupport;
import java.util.LinkedList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // 연산 결과를 저장할 배열
        int[] resultArr = new int[10];

        // 저장된 결과의 개수를 세는 변수
        int count = 0;

        Scanner sc = new Scanner(System.in);

        //결과
        int result = 0;

        while(true) {
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: "); // +, -, *, /
            // charAt(idx): charAt 메서드는 매개변수로 char 타입으로 반환하고자 하는 문자열의 위치(index)를 받는다.
            char operator = sc.next().charAt(0);

            switch(operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        // num2이 0이 아닐 때
                        result = num1 / num2;
                    } else {
                        // num2이 0일 때
                        System.out.println("나눗셈 연산에서 두번째 정수에 0이 입력될 수 없습니다.");
                        continue;
                    }
                    break;
                default:
                    // 연산자를 잘못 입력했을 때
                    System.out.println("잘못된 연산자 입니다.");
                    continue;
            }
            // 결과 출력
            System.out.println("결과: " + result);

            if (count >= resultArr.length) {
                // 저장된 결과가 10개거나 그 이상일 때
                for (int i = 1; i < resultArr.length; i++) {
                    resultArr[i - 1] = resultArr[i];
                }
                resultArr[resultArr.length - 1] = result;
            } else {
                resultArr[count] = result; // 빈 공간에 결과 저장
                count++;
            }

            System.out.println("저장된 연산 결과: ");
            for (int i=0; i < count; i++) {
                System.out.println(resultArr[i]);
            }

            // 탈출문 출력
            System.out.println("더 계산하시겠습니까?(exit 입력 시 종료) 계속하려면 아무 키나 입력해주세요.");
            String exit = sc.next();
            if(exit.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }


        }





    }
}
