package xinte;

/**
 * @author LiuGang
 * @date 2021/2/25 - 18:55
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
public class One implements MyInterface{


    @Override
    public String notDefault() {
        return null;
    }

    @Override
    public String testDefault() {
        return "这不是借口中的more实现额方法、这个是实现接口中重写了的方法！";
    }


    public static void main(String[] args) {
        MyInterface myInterface = new One();
        System.out.println(myInterface.testDefault());
    }
}
