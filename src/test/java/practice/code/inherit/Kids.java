package practice.code.inherit;

/**
 * Description:
 * date: 2020 2020/8/6 21:20
 *
 * @author shaowenhao
 * @since JDK 1.8
 */
public class Kids extends ManKind {
    private int yearOld;

    public Kids() {
    }

    public Kids(int yearOld) {
        this.yearOld = yearOld;
    }

    public void printAge(){
        System.out.println("i am" + yearOld + "years old");
    }

    public void setYearOld(int yearOld) {
        this.yearOld = yearOld;
    }

    public int getYearOld() {
        return yearOld;
    }
}
