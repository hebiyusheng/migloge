package ClassTest;

import entity.User;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author LiuGang
 * @date 2021/1/14 - 20:26
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
public class Test1 {
    static List<String> list = Arrays.asList("aa?","bb","bb","cc?","dd","ee");
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User("admin","213"));
        list.add(new User("admin1","qwe"));
        list.add(new User("admin1","rrr"));
        list.add(new User("admin","qweqq"));

        List<User> userList = removeDuplicateOrder(list);
        userList.forEach(System.out::println);

    }


    public static List<User> removeDuplicateOrder(List<User> list){
        Set<User> set = new TreeSet<User>(new Comparator<User>() {
            @Override
            public int compare(User a, User b) {
                // 字符串则按照asicc码升序排列
                return a.getUsername().compareTo(b.getUsername());
            }
        });
        set.addAll(list);
        return new ArrayList<User>(set);
    }











    public static String asda(String string){
        if (string!=null){
            if (string.trim().contains("--") && string.trim().contains("**")){
                String replace1 = string.replace("--", "").replace("**", "");
                return replace1;
            }else if (string.trim().contains("--")){
                String replace2 = string.trim().replace("--", "");
                return replace2;
            }else if (string.trim().contains("**")){
                String replace3 = string.trim().replace("**", "");
                return replace3;
            }
        }
        return string;
    }



    /**
     * 中间操作符
     *
     * skip
     * 去除指定长度的元素并且返回剩余后面的元素
     */
    public static void zhongjian(){
        System.out.println(list.stream().skip(2).collect(Collectors.toList()));
    }
    public static void zhongzhi(){
        //转化成stream流的两种方式
        //并行执行
        list.parallelStream();
        List<String> collect = list.stream().filter(str -> str.contains("?")).collect(Collectors.toList());
        System.out.println("filter条件过滤"+collect);
        List<String> collect1 = list.stream().distinct().collect(Collectors.toList());
        System.out.println("distinct去重元素"+collect1);
        User user1 = new User("admin","123");
        User user2 = new User("gqk","123");
        User user3 = new User("89","123");
        User user4 = new User("admin","123");
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        List<User> collect2 = userList.stream().distinct().collect(Collectors.toList());
        System.out.println("对象集合distinct去重"+collect2);

        System.out.println("limitd 分页"+list.stream().limit(3).collect(Collectors.toList()));
    }





    /**
     * 终止操作符
     */
}
