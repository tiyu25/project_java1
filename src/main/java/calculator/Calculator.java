package calculator;

import java.util.ArrayList;

public class Calculator {
    // 연산 결과를 저장할 컬렉션 타입(List) 필드 선언 및 생성
    ArrayList<Integer> resultArr = new ArrayList<>();

    // Getter 메서드
    public ArrayList<Integer> getResult() {
        return resultArr;
    }

    // Setter 메서드
    public void setResultArr(ArrayList<Integer> resultArr) {
        this.resultArr = resultArr;
    }
    //결과
    int result = 0;

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
