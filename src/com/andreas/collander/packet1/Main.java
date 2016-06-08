package com.andreas.collander.packet1;
import java.lang.reflect.Method;

class Main {


    public static void main(String[] args) throws Exception {

       A a = (A) Class.forName("com.andreas.collander.packet1.A").newInstance();
       Method m = a.getClass().getDeclaredMethod("b");
        m.invoke(a);
    }


}



