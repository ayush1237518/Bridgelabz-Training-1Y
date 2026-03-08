
package com.access.two;

import com.access.one.Base;

public class Derived extends Base {

    public static void main(String[] args) {

        Derived obj = new Derived();

        obj.protectedMethod();
        obj.publicMethod();
    }
}
