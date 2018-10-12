package main

import "C"

//export StringTest
func StringTest() string {
	return "12345"
}

//export ByteTest
func ByteTest() *C.char {
	return C.CString("12344")

}

//export IntTest
func IntTest() int {
	return 1024
}

//export IntInTest
func IntInTest(a int) int {
	return 1024 * a
}
func main() {

}
