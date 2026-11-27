public class Student2 {
//    Getters and Setters
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

void main(String[] args) {
    Student2 stud = new Student2();
    stud.setName("krishna");
    System.out.println(stud.getName());
}
