package singleton.v2;

public class UserInner {

    private UserInner() {
    }

    static class Inner {
        private static final UserInner INSTANCE = new UserInner();
    }

    public static UserInner getInstance() {
        return Inner.INSTANCE;
    }

}
