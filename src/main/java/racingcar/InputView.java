package racingcar;

import java.util.Scanner;

public class InputView {
    public static String[] getCarNames() {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        return value.split(",");
    }

    public static int getCoin() {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        return Integer.parseInt(value);
    }
}
