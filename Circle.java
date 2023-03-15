package com.company;

public class Circle extends  shape {
    Circle(int dim1){
        super(dim1,-1);
    }
    public double area(){
        System.out.println(Math.PI * this.dim1 * this.dim1);
        return  Math.PI * this.dim1 * this.dim1;

    }

    public static void main(String[] args) {
        Circle c= new Circle(2);
       c.area();
    }
}

