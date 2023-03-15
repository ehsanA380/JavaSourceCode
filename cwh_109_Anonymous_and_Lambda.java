package com.company;
@FunctionalInterface
 interface DemoAno{
    void meth1(int a);
//    void meth2();
}
// class HarryFunc implements DemoAno{
//
//     @Override
//     public void meth1() {
//         System.out.println("I am method 1");
//     }
// }

//class Anonydemo implements DemoAno{
//
//    @Override
//    public void meth1() {
//        System.out.println("I am meth1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("I am meth2");
//    }
//}
public class cwh_109_Anonymous_and_Lambda {
    public static void main(String[] args) {
//        Anonydemo obj= new Anonydemo();
//        obj.meth1();
        //Anonymous class------------------
//        DemoAno obj= new DemoAno() {
//            @Override
//            public void meth1() {
//                System.out.println("this is anonymous meth1");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("this is anonymous meth1");
//            }
//        };
//        obj.meth1();
        // Lambda Expression
//        DemoAno obj= new HarryFunc() ;
//        obj.meth1();
        DemoAno obj=(a)->{System.out.println("I am method 1 from this lambda expression"+ a);};
        obj.meth1(6);
    }
}
