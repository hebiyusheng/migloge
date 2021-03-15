package ClassTest;

/**
 * @author LiuGang
 * @date 2021/1/14 - 19:55
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
public class Test {

    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            try {
                Thread.sleep(2000);
                System.out.println("当前："+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
