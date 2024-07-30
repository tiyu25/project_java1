package calculator;

import java.util.ArrayList;

public class CircleCalculator {
    // 원의 넓이 결과를 저장할 컬렉션 타입(List) 필드 선언 및 생성
    ArrayList<Double> circleResultArr = new ArrayList<>();

    // 원의 넓이 결과
    double areaResult;

    // 원주율
    final double PI = 3.14159;

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
