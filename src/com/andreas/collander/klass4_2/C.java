package com.andreas.collander.klass4_2;

/**
 * Created by Elev1 on 2016-06-08.
 */
public class C {
    public C(MyInterFace myInterFace){
        String s = "class: " + myInterFace.getClass().getName();
        System.out.println(s);
    }
}
