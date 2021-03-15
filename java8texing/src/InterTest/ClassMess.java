package InterTest;

/**
 * @author LiuGang
 * @date 2021/3/3 - 9:36
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
public class ClassMess {
    private String className;
    private String classType;

    public ClassMess() {
    }

    public ClassMess(String className, String classType) {
        this.className = className;
        this.classType = classType;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    @Override
    public String toString() {
        return "ClassMess{" +
                "className='" + className + '\'' +
                ", classType='" + classType + '\'' +
                '}';
    }
}
