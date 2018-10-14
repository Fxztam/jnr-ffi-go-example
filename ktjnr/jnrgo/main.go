package main

/*
	struct gotime{
		int64 wall
		int64 ext
	}
*/
import "C"
import "time"

func main() {

}

//export Time
func Time() *C.char {
	return C.CString(time.Now().Format("2006-01-02 15:04:05"))
}

//export Bytes
func Bytes(buf *C.uchar, len C.int) *C.uchar {
	return nil
}
