package com.company;

class circle{
    public int radius;
    circle(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder extends  circle{
    public int heights;

    Cylinder(int r,int h){
        super(r);
        System.out.println("I am cylinder parameterized constructor");
        this.heights=h;

    }
    public  double volume(){
        return Math.PI*this.radius*this.radius*this.heights;
    }
}
public class cwh_53_ch10Ps {
    public static void main(String[] args) {
//        circle obj=new circle(12);
        cylinderical obj=new cylinderical(2,4);
        System.out.println(obj.area());
//        System.out.println(obj.volume());
    }
}
