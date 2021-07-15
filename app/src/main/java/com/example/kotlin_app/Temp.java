package com.example.kotlin_app;

import java.util.ArrayList;
import java.util.List;

public class Temp {
    public static void main(String[] args) {
        List<Integer> ls=new ArrayList();
        for(int i=0;i<10;i++)
        {
            ls.add(1);
        }
        System.out.println(ls);
        for(int i=0;i<10;i++)
        {
            if(i==5)
            {
                ls.set(i,5);
            }
            else
            {
                ls.set(i,2);
            }
        }
        System.out.println(ls);
    }
}
