package com.andreas.collander.packet1;

import java.io.IOException;

/**
 * Created by Elev1 on 2016-06-03.
 */
public class In {
    public static void main(String[] args) throws IOException {
        System.out.print("Skriv Q eller q för att avsluta.");
        while (true) {
            int ch = System.in.read();
            if (ch == 'Q' || ch == 'q')
                break;
        }
    }
}
