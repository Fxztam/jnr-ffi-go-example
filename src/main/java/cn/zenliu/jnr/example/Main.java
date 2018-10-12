package cn.zenliu.jnr.example;

import jnr.ffi.LibraryLoader;

import java.io.UnsupportedEncodingException;

public class Main {
    private static final Jnr JNR;

    static {
        JNR = LibraryLoader.create(Jnr.class).load("./jnr.dll");
    }

    public static void main(String[] args) {

        System.out.println(JNR.StringTest());
        System.out.println(JNR.ByteTest());
        try {
            System.out.println(new String(JNR.ByteTest().getBytes(),"UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        JNR.ToStringTest("发给 go a123");
        System.out.println(JNR.IntTest());
        System.out.println(JNR.IntInTest(100));
    }
}
