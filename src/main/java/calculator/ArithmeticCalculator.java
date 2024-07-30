package calculator;

import java.util.ArrayList;

public class ArithmeticCalculator {
    ArrayList<Integer> resultArr = new ArrayList<>();

    private AddOperator addOperator;
    private SubtractOperator subtractOperator;
    private MultiplyOperator multiplyOperator;
    private DivideOperator divideOperator;

    public ArithmeticCalculator() {
        this.addOperator = new AddOperator();
        this.subtractOperator = new SubtractOperator();
        this.multiplyOperator = new MultiplyOperator();
        this.divideOperator = new DivideOperator();
    }

    // 사칙연산 결과
    int result = 0;

    public int calculate(int num1, int num2, char operator) throws Exception {
        switch(operator) {
            case '+':
                result = addOperator.calculate(num1, num2);
                break;
            case '-':
                result = subtractOperator.calculate(num1, num2);
                break;
            case '*':
                result = multiplyOperator.calculate(num1, num2);
                break;
            case '/':
                try {
                    result = divideOperator.calculate(num1, num2);
                } catch (Exception e) {
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

    // Getter 메서드
    public ArrayList<Integer> getResult() {
        return resultArr;
    }

    // Setter 메서드
    public void setResultArr(ArrayList<Integer> resultArr) {
        this.resultArr = resultArr;
    }

    // 가장 먼저 저장된 데이터 삭제
    public void removeResult() {
        if (!resultArr.isEmpty()) {
            resultArr.remove(0);
            System.out.println("가장 먼저 저장된 연산 결과를 삭제되었습니다.");
        } else {
            System.out.println("삭제할 연산 결과가 없습니다.");
        }
    }

    // 저장된 결과 출력
    public void inquiryResults() {
        for (int res: resultArr) {
            System.out.println(res);
        }
    }
}
