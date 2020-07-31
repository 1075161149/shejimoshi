package 练习;

public class testdanli {
public static void main(String[] args)
{
    danli one=danli.getInstance();
    danli two=danli.getInstance();
    System.out.println(one=two);
    System.out.println(two);
    System.out.println("//////////");
    lanhan one1=lanhan.getInstance();
    lanhan two1=lanhan.getInstance();
    System.out.println(one1);
    System.out.println(two1);
}

}
