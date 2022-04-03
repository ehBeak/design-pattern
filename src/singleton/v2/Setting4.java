package singleton.v2;

/**
 * static inner 사용하기 - lazy
 */
public class Setting4 {

    private Setting4() {}

    private static class SettingsHolder {
        private static final Setting4 INSTANCE = new Setting4();
    }

    public static Setting4 getInstance() { // getInstance가 호축될 때 inner class가 로딩된다. - lazy
        return SettingsHolder.INSTANCE;
    }

}
