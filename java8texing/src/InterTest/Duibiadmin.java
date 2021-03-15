package InterTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author LiuGang
 * @date 2021/3/2 - 18:38
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
public class Duibiadmin {

    private static List<Users> list = new ArrayList<>();
    private static List<ClassMess> messList = new ArrayList<>();;


    public static void main(String[] args) {
        fuzhu();




        //进行大写转换
        List<ClassMess> classMesses = cloumnToExcel(messList);
        Set<Users> users = biduiAddCloumn(classMesses, Duibiadmin.list);


        users.forEach(i-> System.out.println(i));

    }

    public static Set<Users> biduiAddCloumn(List<ClassMess> classMessListm,List<Users> usersList){
        List<Users> usersListNew = new ArrayList<>();
        Set<Users> userSet = new HashSet<>();
        if (!classMessListm.isEmpty() && !usersList.isEmpty()){
            for (int i = 0; i < classMessListm.size() ; i++) {
                for (int j = 0; j < usersList.size() ; j++) {
                    if (classMessListm.get(i).getClassType().equalsIgnoreCase(usersList.get(j).getAddress())){
                        usersList.get(j).setBeizhu(classMessListm.get(i).getClassType());
                        usersListNew.add(usersList.get(j));
                        userSet.add(usersList.get(j));
                    }
                }
            }
        }
        usersListNew.forEach(i-> System.out.println(i));
        System.out.println("========================");
        return userSet;
    }






    public static void fuzhu(){
        Users users1 = new Users("张三","JIUQUAN");
        Users users2 = new Users("李四","LANZHOU");
        Users users3 = new Users("王五","JIAYUGUAN");
        Users users4 = new Users("赵六","XIAN");
        Users users6 = new Users("opwqe","XIAN");
        Users users5 = new Users("赵六123","XIAN1111");
        list.add(users1);
        list.add(users2);
        list.add(users3);
        list.add(users4);
        list.add(users5);
        list.add(users6);

        ClassMess classMess1 = new ClassMess("报案号","jiuquan");
        ClassMess classMess2 = new ClassMess("保单号","jiayuguan");
        ClassMess classMess3 = new ClassMess("批量号","lanzhou");
        ClassMess classMess4 = new ClassMess("创建时间","xian");
        ClassMess classMess6 = new ClassMess("创建时间xian","xian");
        ClassMess classMess5 = new ClassMess("创建时间123","xian1111");
        messList.add(classMess1);
        messList.add(classMess2);
        messList.add(classMess3);
        messList.add(classMess4);
        messList.add(classMess5);
        messList.add(classMess6);
    }

    public static List<ClassMess> cloumnToExcel(List<ClassMess> excelPOJOList){
        List<ClassMess> excelPOJOListTo = new ArrayList<>();
        if (!excelPOJOList.isEmpty()){
            for (ClassMess pojo : excelPOJOList) {
                pojo.setClassType(pojo.getClassType().toUpperCase());
                excelPOJOListTo.add(pojo);
            }
        }
        return excelPOJOListTo;
    }

}
