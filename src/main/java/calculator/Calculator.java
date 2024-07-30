package calculator;

import java.util.ArrayList;

public class Calculator {
    // 연산 결과를 저장할 컬렉션 타입(List) 필드 선언 및 생성
    ArrayList<Integer> resultArr = new ArrayList<>();

    // 원의 넓이 결과를 저장할 컬렉션 타입(List) 필드 선언 및 생성
    ArrayList<Double> circleResultArr = new ArrayList<>();

    // 사칙연산 결과
    int result = 0;

    // 원의 넓이 결과
    double areaResult;

    public int calculate(int num1, int num2, char operator) throws Exception {
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
                    // throws를 통하여 예외처리
                    throw new Exception("나눗셈 연산에서 두번째 정수에 0이 입력될 수 없습니다.");
                }
                break;
            default:
                // 연산자를 잘못 입력했을 때
                throw new Exception("잘못된 연산자 입니다.");
        }

        // 결과를 리스트에 저장
        resultArr.add(result); 

        return result;
    }

    // (사칙연산) Getter 메서드
    public ArrayList<Integer> getResult() {
        return resultArr;
    }

    // (사칙연산) Setter 메서드
    public void setResultArr(ArrayList<Integer> resultArr) {
        this.resultArr = resultArr;
    }

    // (사칙연산) 가장 먼저 저장된 데이터 삭제
    public void removeResult() {
        if (!resultArr.isEmpty()) {
            resultArr.remove(0);
            System.out.println("가장 먼저 저장된 연산 결과를 삭제되었습니다.");
        } else {
            System.out.println("삭제할 연산 결과가 없습니다.");
        }
    }

    // (사칙연산) 저장된 결과 출력
    public void inquiryResults() {
        for (int res: resultArr) {
            System.out.println(res);
        }
    }


    // static, final 키워드 사용 설명과 활용한 이유
    // 1. 계산된 원의 넓이를 저장합니다.
    // 2. 생성자로 초기화됩니다.
    // 3. 외부에서 직접 접근할 수 없습니다.
    // 4. Getter, Setter 메서드를 구현합니다.
    // 5. 원의 넓이 결과값들을 조회하는 메서드를 구현합니다.


    // 원주률
    final double PI = 3.14159; // 원주율을 변경할 수 없는 값이기 때문에 final을 사용

    public double calculateCircleArea(double radius) {
        // 원의 넓이 계산
        areaResult = PI*radius*radius;

        // 결과를 리스트에 저장
        circleResultArr.add((double) areaResult);

        // 결과값 출력
        System.out.println(areaResult);

        return areaResult;
    }

    public ArrayList<Double> getAreaResult() {
        return circleResultArr;
    }

    public void setAreaResultArr(ArrayList<Double> circleResultArr) {
        this.circleResultArr = circleResultArr;
    }

    public void inquiryAreaResults() {
        for (double res: circleResultArr) {
            System.out.println(res);
        }
    }


















}
