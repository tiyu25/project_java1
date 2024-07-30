package calculator;

public class DivideOperator {
    public int calculate(int num1, int num2) throws Exception {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new Exception("나눗셈 연산에서 두번째 정수에 0이 입력될 수 없습니다.");
        }
    }
}
