package com.andreas.collander.klass4_2;

/**
 * Created by Elev1 on 2016-06-08.
 */
public class Main {
    public static void main(String[] args) {
        try {


            MyInterFace myInterFace = (MyInterFace) Class.forName("com.andreas.collander.klass4_2.A").newInstance();
            C c = new C(myInterFace);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            System.out.println(e.getMessage());
        }
    }
}
