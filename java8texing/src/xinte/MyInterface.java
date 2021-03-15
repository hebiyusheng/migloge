package xinte;

/**
 * @author LiuGang
 * @date 2021/2/25 - 18:55
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
public interface MyInterface {
    /**
     * 定义属性
     * @return
     */
    String notDefault();

    /**
     * java 8 中接口可以默认实现
     * @return
     */
    default String testDefault() {
        return "java 8 中默认实现方法体";
    }


}
