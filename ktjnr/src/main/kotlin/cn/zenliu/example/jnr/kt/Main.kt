package cn.zenliu.example.jnr.kt

import jnr.ffi.LibraryLoader

object JnrR {
    val jr = LibraryLoader.create(Jnr::class.java).load("./jnr.dll")
}


fun main(args: Array<String>) {
    println("time of go var char ${JnrR.jr.Time()}")
    println("time of go   ${JnrR.jr.Time2()}")
}
