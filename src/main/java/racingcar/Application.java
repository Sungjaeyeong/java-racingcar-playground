package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String[] carNames = InputView.getCarNames();

        ArrayList<Car> list = new ArrayList<>();
        for (String carName : carNames) {
            list.add(new Car(carName));
        }

        Cars cars = new Cars(list);

        System.out.println("시도할 회수는 몇회인가요?");
        int coin = InputView.getCoin();

        System.out.println("실행결과");
        for (int i=0; i<coin; i++) {
            cars.moveAll();
            ResultView.printResult(cars);
        }

        ResultView.printEnd(cars);
    }
}
