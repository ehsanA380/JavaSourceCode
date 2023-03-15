package com.company;
class  rectangle{
    public int length;
    public int breadth;

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    rectangle(int l, int b){
        this.length=l;
        this.breadth=b;
    }
    public int  area(){
        return length*breadth;
    }
}

class  cuboid extends  rectangle{
    public  int height;

    public int getHeight() {
        return height;
    }

    cuboid(int l, int b, int h){
        super(l,b);
        this.height =h;
    }
    public  int perimeter(){
        return  2*(length+breadth);
    }
    public int volume(){
        return area()*height;
    }
}
public class rectangleAndCuboid {
    public static void main(String[] args) {
        cuboid cube =new cuboid(7,2,3);
        System.out.println(cube.volume());
        System.out.println(cube.perimeter());
        System.out.println(cube.getBreadth());
        System.out.println(cube.getLength());
        System.out.println(cube.getHeight());
    }
}
