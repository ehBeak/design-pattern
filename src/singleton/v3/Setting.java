package singleton.v3;

/**
 * 안전하고 단순하게 구현하는 방법 - 리플렉션에 안전, 직렬화와 역직렬화에 안전
 * 단점: 이미 만들어짐
 */
public enum Setting {

    INSTANCE;

    private Integer number;

    Setting() {

    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
