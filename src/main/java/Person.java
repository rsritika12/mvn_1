/**
 * Created by ler494 on 6/14/17.
 */
public class Person {
    String fn;
    String ln;
    Integer ssn;
    Eq eqs;
    Ex exs;
    Tu tus;



    Person(String fnArg, String lnArg, Integer ssnArg,Eq eqArg,Ex exArg,Tu tuArg) {
        fn = fnArg;
        ln = lnArg;
        ssn = ssnArg;
        eqs = eqArg;
        exs = exArg;
        tus = tuArg;
    }
    Eq bobEq = new Eq(700);
    Eq jillEq = new Eq(400);
    Eq edEq = new Eq(900);

    Ex bobEx = new Ex(800);
    Ex jillEx = new Ex(470);
    Ex edEx = new Ex(600);

    Tu  bobTu = new Tu(550);
    Tu  jillTu = new Tu(595);
    Tu  edTu = new Tu(720);


    public int avg(Integer a, Integer b, Integer c) {
        return (a+b+c)/3;
    }



    public static void main(String[] args) {

        Eq bobEq = new Eq(700);
        Eq jillEq = new Eq(400);
        Eq edEq = new Eq(900);

        Ex bobEx = new Ex(800);
        Ex jillEx = new Ex(470);
        Ex edEx = new Ex(600);

        Tu  bobTu = new Tu(550);
        Tu  jillTu = new Tu(595);
        Tu  edTu = new Tu(720);



        Person pBob = new Person ("Bob", "Smith", 9090,bobEq,bobEx,bobTu);
        Person pJill = new Person ("Jill", "Jones", 9830,jillEq,jillEx,jillTu);
        Person pEd = new Person ("Ed", "Mox", 1230,edEq,edEx,edTu);

        System.out.println(pBob.fn +" has a credit score for EQ, EX, and TU of " + pBob.bobEq.score + ", " +  pBob.bobEx.score + ", " + pBob.bobTu.score + " respectively");
        System.out.println("Bob's average is " + (pBob.bobEq.score +  pBob.bobEx.score +  pBob.bobTu.score)/3 );
        System.out.println(pJill.fn +" has a credit score for EQ, EX, and TU of " + pJill.jillEq.score + ", " +  pJill.jillEx.score + ", " + pBob.jillTu.score + " respectively");
        System.out.println("Jill's average is " + (pJill.jillEq.score + pJill.jillEx.score + pJill.jillTu.score)/3);
        System.out.println(pEd.fn +" has a credit score for EQ, EX, and TU of " + pEd.edEq.score + ", " +  pEd.edEx.score + ", " + pEd.edTu.score + " respectively");
        System.out.println("Ed's average is " + (pEd.edEq.score + pEd.edEx.score + pEd.edTu.score)/3);
    }

}