package calculator;

import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
        int num2 = sc.nextInt();

        System.out.print("사칙연산 기호를 입력하세요: "); // +, -, *, /
        // charAt(idx): charAt 메서드는 매개변수로 char 타입으로 반환하고자 하는 문자열의 위치(index)를 받는다.
        char operator = sc.next().charAt(0);

//        // if문
//        int result = 0; // 결과값을 저장할 변수 선언
//        if (operator == '+') {
//            result = num1 + num2;
//        } else if (operator == '-') {
//            result = num1 - num2;
//        } else if (operator == '*') {
//            result = num1 * num2;
//        } else if (operator == '/') {
//            if (num2 != 0) {
//                // 두번째 정수(num2)가 0이 아닐 때
//                result = num1 / num2;
//            } else {
//                // 두번째 정수(num2)가 0일때
//                System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
//                return;
//            }
//        } else {
//            // 연산자가 ' +, -, *, / ' 중 하나가 아닐 때
//            System.out.println("잘못된 연산자 입니다.");
//            return;
//        }
//        //계산 결과를 출력
//        System.out.println("결과: " + result);

        // switch문
        int result = 0;
        switch(operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    break;
                } else {
                    System.out.println("나눗셈 연산에서 두번째 정수에 0이 입력될 수 없습니다.");
                    break;
                }
            default:
                System.out.println("오류임 ㅋㅋ");
        }
        System.out.println("결과: " + result);


    }
}
