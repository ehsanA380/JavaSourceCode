package com.company;
@FunctionalInterface
 interface myFunctionalInterface {
    void thisMethod();
//    void thisMethod2();
}
class NewPhone extends Phone{
    @Override
    public void showTime(){
        System.out.println("Time is 8 AM");
    }
    @Deprecated
    public int sum(int i,int j){
        return i+j;
    }
}
public class cwh_108_java_annotations {
    @SuppressWarnings("deprecation" )
    public static void main(String[] args) {
        NewPhone phone=new NewPhone();
        phone.showTime();
        phone.sum(5,8);
    }
}
