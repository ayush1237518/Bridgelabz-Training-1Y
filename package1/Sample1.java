
package com.gla.package1;

public class Sample1 {
    private int varA;
    private static int varB;
    private void methodA(){

    }
    private static void methodB(){

    }
    public int varE;
    public static int varF;
    public void methodE(){

    }
    public static void methodF(){

    }

    int varC;
    static int varD;
    void methodC(){

    }
    static void methodD(){

    }

    protected int varG;
    protected static int varH;
    protected void methodG(){

    }
    protected static void methodH(){

    }    static void main(String[] args) {
        System.out.println(varB);
        Sample1 obj = new Sample1();
        System.out.println(obj.varA);

        methodB();

        obj.methodC();
        System.out.println(varD);
        System.out.println(obj.varC);

        methodD();
        obj.methodC();

        obj.methodE();
        System.out.println(varF);
        System.out.println(obj.varE);

        methodF();
        obj.methodE();

        obj.methodG();
        System.out.println(varH);
        System.out.println(obj.varG);

        methodH();
        obj.methodG();
    }
}
