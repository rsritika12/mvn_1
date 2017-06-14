/**
 * Created by ler494 on 6/14/17.
 */
public class Company {
    String name;
    Integer score;
    Person p;
    Company (String nArg, Integer sArg,Person pArg) {
        name = nArg;
        p = pArg;
        score = sArg;
        System.out.println(" credit score is" + score + " for " + p.fn);
    }
    Person pBob = new Person ("Bob", "Smith", 9090);
    Person pJill = new Person ("Jill", "Jones", 9830);
    Person pEd = new Person ("Ed", "Mox", 1230);

    public static void main(String []args) {
        Company EQ = new Company ("eq",700, new Person("Bob", "Smith", 9090) );
        Company EX = new Company ("ex", 800, new Person ("Jill", "Jones", 9830));
        Company TU = new Company ("tu", 550, new Person ("Ed", "Mox", 1230));
        System.out.println(" credit score average is " + (EQ.score + EX.score +TU.score)/3);

    }

}
