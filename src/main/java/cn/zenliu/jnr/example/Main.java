package cn.zenliu.jnr.example;

import jnr.ffi.LibraryLoader;

import java.io.UnsupportedEncodingException;

public class Main {
    private static final Jnr JNR;

    static {
        JNR = LibraryLoader.create(Jnr.class).load("./jnr.dll");
    }

    public static void main(String[] args) {

        System.out.printf("String from GOString %s\n",JNR.StringTest());
        System.out.printf("char from GoString %s\n",JNR.ByteTest());
        JNR.ToStringTest("发给 go a123");
        System.out.println(JNR.IntTest());
        System.out.println(JNR.IntInTest(100));
    }
}
