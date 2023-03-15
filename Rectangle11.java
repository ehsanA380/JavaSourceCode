package com.company;

public class Rectangle11 extends  shape {
    Rectangle11(int dim1, int dim2){
        super(dim1,dim2);
    }
    public int area(){
        return this.dim1 * this.dim2;
    }

    public static void main(String[] args) {
        Rectangle11 sq= new Rectangle11(2,5);
        System.out.println(sq.area());
    }
}




