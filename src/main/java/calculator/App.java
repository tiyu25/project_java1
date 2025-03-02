package calculator;

import java.beans.PropertyEditorSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
        CircleCalculator circleCalculator = new CircleCalculator();

        // 사칙연산
        ArrayList<Integer> resultArr = new ArrayList<>();

        // 원의 넓이
        ArrayList<Double> circleResultArr = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int result = 0;

        // 반복문 시작
        while(true) {
            System.out.println("진행할 기능을 선택해주세요. (사칙연산: 0, 원의 너비: 1)");
            String choice = sc.next();
            if (choice.equals("0")) {
                //사칙연산
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt();

                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt();

                System.out.print("사칙연산 기호를 입력하세요: "); // +, -, *, /
                char operator = sc.next().charAt(0);

                // 연산 결과 출력 및 저장
                try {
                    result = arithmeticCalculator.calculate(num1, num2, operator);
                } catch (Exception e) {
                    // 나눗셈 두번째 정수 0 입력 시 예외처리
                    System.out.println(e.getMessage());
                }

                // 결과 출력
                System.out.println("결과: " + result);

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제) 삭제를 원치 않으시면 아무 키나 입력해주세요.");
                String remove = sc.next();
                if (remove.equals("remove")) {
                    arithmeticCalculator.removeResult();
                }

                // 저장된 결과 출력
                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회) 계속하려면 아무 키나 입력해주세요.");
                String inquiry = sc.next();
                if(inquiry.equals("inquiry")) {
                    arithmeticCalculator.inquiryResults();
                }

                // 탈출문 출력
                System.out.println("더 계산하시겠습니까?(exit 입력 시 종료) 계속하려면 아무 키나 입력해주세요.");
                String exit = sc.next();
                if (exit.equals("exit")) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
            } else if (choice.equals("1")) {
                // 결과 값
                double areaResult;

                // 사용자에게 반지름 값을 받음
                System.out.println("원의 반지름을 입력해주세요.");
                double radius = sc.nextDouble();

                circleCalculator.calculateCircleArea(radius);

                // 저장된 결과값 조회
                System.out.println("저장된 원의 넓이 값을 조회하시겠습니까? (inquiry 입력 시 조회) 계속하려면 아무 키나 입력해주세요.");
                String inquiry1 = sc.next();
                if(inquiry1.equals("inquiry")) {
                    circleCalculator.inquiryAreaResults();
                }

            }
        }
    }
}
