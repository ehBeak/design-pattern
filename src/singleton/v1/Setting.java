package singleton.v1;

/**
 * 문제점
 * -멀티 쓰레드 환경에서 안전하지 않음
 */

public class Setting {

    private static Setting instance;

    private Setting() { }

    //static 영역
    public static Setting getInstance() {
        if (instance == null) {
            instance = new Setting();
        }
        return instance;
    }
}

