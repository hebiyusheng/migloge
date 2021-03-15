package InterTest;

/**
 * @author LiuGang
 * @date 2021/3/3 - 9:35
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
public class Users {
    private String name;
    private String address;
    private String beizhu;

    public Users() {
    }

    public Users(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Users(String name, String address, String beizhu) {
        this.name = name;
        this.address = address;
        this.beizhu = beizhu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", beizhu='" + beizhu + '\'' +
                '}';
    }
}
