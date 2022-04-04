package singleton.v3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Setting origin = Setting.INSTANCE;
        /**
         * enum은 리플렉션에서 생성을 막아놓았기 때문에 유일한 인스턴스가 될 수 있다.
         */
        Constructor<Setting> constructor = Setting.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Setting setting = constructor.newInstance();

        System.out.println(origin == setting);
    }
}
