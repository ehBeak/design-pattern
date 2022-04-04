package singleton.v2;

import java.io.Serializable;

/**
 * double checked locking 사용하기 - 필요할 때 초기화(lazy)
 */
public class Setting3 implements Serializable {

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

    // 역직렬화 대응 방안
    protected Object readResolve() {// 역직렬화시, 이 함수 사용함
        return getInstance();
    }
}
