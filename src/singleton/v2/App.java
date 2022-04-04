package singleton.v2;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {

        /**
         * 싱글톤 패턴 구현 방법을 깨는 법1 - 리플렉션
         */
        Setting4 origin4 = Setting4.getInstance();

        Constructor<Setting4> constructor = Setting4.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Setting4 setting4 = constructor.newInstance();

        System.out.println(setting4 == origin4);

        /**
         * 싱글톤 패턴 구현 방법을 깨는 법2 - 직렬화, 역직렬화(역직렬화시, 인스턴스 다시 생성)
         */
        Setting3 origin3 = Setting3.getInstance();
        Setting3 setting3 = null;

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("setting3.obj"))) {
            out.writeObject(origin3);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("setting3.obj"))) {
            setting3 = (Setting3) in.readObject();
        }

        System.out.println(origin3 == setting3);


    }
}
