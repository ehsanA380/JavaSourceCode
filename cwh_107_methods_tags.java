package com.company;

/**
 * This is a good class
 */
public class cwh_107_methods_tags {
    /**
     *
     * @param args These are arguments supplied to command line
     */
    public static void main(String[] args) {
        System.out.println("I am main method");
    }

    /**
     *Hello This is the method and this is most beautiful of this class
     * @param i this is the first number to add
     * @param j This is the second number to add
     * @return sum of two number as an interger
     * @throws Exception if i is 0
     * @deprecated This method is depreacated please use + operator
     */
    public int add(int i,int j) throws Exception{
        if(i==0){
            throw new Exception();
        }
        int c;
        c=i+j;
        return c;
    }
}
