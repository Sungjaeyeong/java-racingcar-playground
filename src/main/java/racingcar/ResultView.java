package racingcar;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ResultView {
    public static void printResult(Cars cars) {
        cars.printResultOfCars();
        System.out.println();
    }

    public static void printEnd(Cars cars) {
        List<Car> result = cars.maxLocationCars();
        String names = result.stream()
                .map(Car::getName)
                .collect(Collectors.joining(", "));
        System.out.println(names + "가 최종 우승했습니다.");
    }
}
