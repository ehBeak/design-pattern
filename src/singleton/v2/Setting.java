package singleton.v2;

/**
 * synchronized 키워드로 쓰레드에 안전하지만, 성능저하
 */
public class Setting {

    private static Setting instance;

    private Setting() {}

    public static synchronized Setting getInstance() {
        if (instance == null) {
            return new Setting();
        }
        return instance;
    }
}
