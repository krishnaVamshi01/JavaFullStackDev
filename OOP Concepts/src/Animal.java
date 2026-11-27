public class Animal {
//    inheritencce , parent properties or methods can be reused by child trhough inheritence
//    using ectends keyword


    void eat() {
        System.out.println("eatinggg");
    }
}
public class Dog extends Animal{
    void bark(){
        System.out.println("Dog Barks");
    }
}

void main(String[] args) {
 Dog d = new Dog();
 d.bark();
 d.eat();
}


