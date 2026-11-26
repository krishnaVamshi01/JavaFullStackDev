public class Calcu {
//    static method
    static int add(int a , int b){
        return a+b;
    }
}

void main(String[] args) {
    Calcu cal = new Calcu();
    System.out.println(Calcu.add(12,24));
}
