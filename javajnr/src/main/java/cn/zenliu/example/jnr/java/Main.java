package cn.zenliu.example.jnr.java;

import jnr.ffi.LibraryLoader;

public class Main {
    private static final Jnr JNR;

    static {
        JNR = LibraryLoader.create(Jnr.class).load("./jnr.dll");
    }

    public static void main(String[] args) {

        System.out.printf("String from GOString %s\n",JNR.StringTest());
        System.out.printf("char from GoString %s\n",JNR.CharTest());
        JNR.ToStringTest("发给 go a123");
        System.out.printf("int from go %d\n",JNR.IntTest());
        System.out.printf("int to from go %d\n",JNR.IntInTest(100));
    }
}
