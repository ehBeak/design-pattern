package singleton;

public class RuntimeExample {

    public static void main(String[] args) {
        /**
         * 자바와 스프링에서 찾아보는 패턴
         */
        Runtime runtime = Runtime.getRuntime(); //자바 실행환경
        System.out.println("runtime = " + runtime.maxMemory());

    }
}
