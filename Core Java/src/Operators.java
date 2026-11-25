public class Operators {
    static void main(String[] args) {
        System.out.println("----Arithmetical Operators----");

        int a = 20;
        int b = 10;
        System.out.println("Addition + --------" + (a+b));
        System.out.println("substraction -  ------- " +( a-b));
        System.out.println("Multiplication *  --------" +( a*b));
        System.out.println("Division / -  --------" +( a/b));
        System.out.println("Modulus %  ---------" +( a%b));
        System.out.println("------------------------------");

        System.out.println("----Relational  Operators----");

        int c = 20 ;
        int d= 10;
        System.out.println("Greater than >  ----" + (c>d));
        System.out.println("less than <  ----" + (c<d));
        System.out.println("Greater than equalto >=  ----" + (c>=d));
        System.out.println("less than <=  ----" + (c<=d));
        System.out.println("equalto equalto == >  ----" + (c==d));
        System.out.println("not equal to ! >  ----" + (c!=d));
        System.out.println("------------------------------");
        System.out.println("----Logical Operators----");
        int age = 25;
        boolean hasTicket = true;
        System.out.println("AND - " + (age>=18 && hasTicket));
        System.out.println("OR - " + (age>=18 || hasTicket));
        System.out.println("NOT - " + (!hasTicket));

        System.out.println("------------------------------");
    }
}
