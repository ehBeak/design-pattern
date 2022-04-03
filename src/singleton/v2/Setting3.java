package singleton.v2;

/**
 * double checked locking 사용하기 - 필요할 때 초기화(lazy)
 */
public class Setting3 {

    private static volatile Setting3 instance;

    private Setting3() {}

    public static Setting3 getInstance() {
        if (instance == null) {
            synchronized (Setting3.class) {// if문에 여러 쓰레드가 들어왔을 때만 동기화 사용
                if (instance == null) {
                    instance = new Setting3();
                }
            }
        }
        return instance;
    }
}
