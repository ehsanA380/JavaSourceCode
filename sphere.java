package com.company;

public class sphere extends  shape {
    sphere(int dim1){
        super(dim1,-1);
    }
    public double area(){
        return  4*Math.PI * this.dim1 * this.dim1;
    }

    public static void main(String[] args) {
        sphere s= new sphere(4);
        double result =s.area();
        System.out.println(result);
    }

}
