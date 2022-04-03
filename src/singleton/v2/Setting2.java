package singleton.v2;

/**
 * 이른 초기화(eager initialization) 사용하기 - 인스턴스 생성을 하는데, 비용이 많이 들지 않는다면
 */
public class Setting2 {

    private static final Setting2 INSTANCE = new Setting2();

    private Setting2() {}

    public static Setting2 getInstance() {
        return INSTANCE;
    }
}
