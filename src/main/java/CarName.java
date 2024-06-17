public class CarName {
    private final String name;

    public CarName(String name) {
        if (name.length() > 5)
            throw new IllegalArgumentException("자동차의 이름은 5자를 초과할 수 없습니다.");
        this.name = name;
    }
}
