package calculator;

import java.beans.PropertyEditorSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Calculator 인스턴스 생성
        Calculator calculator = new Calculator();

        ArrayList<Integer> resultArr = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int result = 0;

        while(true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: "); // +, -, *, /
            char operator = sc.next().charAt(0);

            // 연산 결과 출력 및 저장
            try {
                result = calculator.calculate(num1, num2, operator);
            } catch (Exception e) {
                // 나눗셈 두번째 정수 0 입력 시 예외처리
                System.out.println(e.getMessage());
            }

            // 결과 출력
            System.out.println("결과: " + result);

            // 결과를 리스트에 저장
            resultArr.add(result);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제) 삭제를 원치 않으시면 아무 키나 입력해주세요.");
            String remove = sc.next();
            if (remove.equals("remove")) {
                if (!resultArr.isEmpty()) {
                    resultArr.remove(0);
                    System.out.println("가장 먼저 저장된 연산 결과를 삭제되었습니다.");
                } else {
                    System.out.println("삭제할 연산 결과가 없습니다.");
                }
            }

            // 저장된 결과 출력
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회) 계속하려면 아무 키나 입력해주세요.");
            String inquiry = sc.next();
            if(inquiry.equals("inquiry")) {
                for (int res: resultArr) {
                    System.out.println(res);
                }
            }

            // 탈출문 출력
            System.out.println("더 계산하시겠습니까?(exit 입력 시 종료) 계속하려면 아무 키나 입력해주세요.");
            String exit = sc.next();
            if (exit.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
