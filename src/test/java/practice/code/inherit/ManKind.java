package practice.code.inherit;

/**
 * Description:
 * date: 2020 2020/8/6 21:16
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class ManKind {

    private int sex;
    private int salary;

    public ManKind() {
    }

    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public void manOrWoman(){
        if(sex == 1){
            System.out.println("man");
        }else if(sex == 0){
            System.out.println("woman");
        }
    }

    public void employeed(){
//        if(salary == 0){
//            System.out.println("no job");
//        }else{
//            System.out.println("job");
//        }
        String jobInfo = (salary == 0) ? "no job" : "job";
        System.out.println(jobInfo);
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
