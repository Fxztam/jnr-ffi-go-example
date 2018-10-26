package main

import "C"

//export StringTest
func StringTest() string {
	return "go string 12345"
}

//export CharTest
func CharTest() *C.char {
	return C.CString("来自go")

}

//export IntTest
func IntTest() int {
	return 1024
}
//export ToStringTest
func ToStringTest(c *C.char)  {
	println(C.GoString(c))
}
//export IntInTest
func IntInTest(a int) int {
	return 1024 * a
}
//export BytesFromJava
func BytesFromJava(bytes *C.char,len C.int)*C.char  {
	return C.CString(string(C.GoBytes(unsafe.Pointer(bytes),len)))
}
func main() {

}
