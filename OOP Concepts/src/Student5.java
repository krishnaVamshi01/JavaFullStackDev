public class Student5 {
//    Default and param/arg constructor
    int id;
    String name;
    Student5(){
        id = 5;
         name = "unKnown";
    }
    Student5(int id , String name){
        this.id = id;
        this.name = name;

    }
}

void main(String[] args) {

    Student5 s5 = new Student5(2, " vamshiii");
    System.out.println(s5.name +s5.id);

    Student5 sDef = new Student5();
    System.out.println(sDef.name +sDef.id);

}
