package practice.code.oop.javabean;

/**
 * Description:
 * date: 2020 2020/8/5 10:26
 *
 * @author shaowenhao
 * @since JDK 1.8
 */

// 数据库的customer表里的字段id .... 和 Customer对应
//开发一般预留无参构造器是为了后面的反射章节


public class Customer {

    private  int id;
    private String name;

    public Customer(){

    }

    public void setId(int i){
        id = i;
    }

    public int getId(){
        return id;
    }

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }
}
