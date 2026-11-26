class main {
  static void main(String[] args) {
//        CLASS AND OBJECT
        Students s1 = new Students();
        s1.id = 101;
        s1.name = "krishna";
        s1.study();

//          Method
        Calculator calc = new Calculator();
       int result =  calc.add(12,15);
        System.out.println(result);

//        Method Overloading
        int result1 = calc.add(10,20,30);
        System.out.println(result1);

        double result2 = calc.add(11.11 ,12.00 , 13.55);
        System.out.println(result);

    }
}