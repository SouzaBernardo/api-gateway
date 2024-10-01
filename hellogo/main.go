package main

import (
	"net/http"
)

func main() {
	http.HandleFunc("/hellogo", hello)
	err := http.ListenAndServe(":8080", nil)
	if err != nil {
		return
	}
}

func hello(writer http.ResponseWriter, request *http.Request) {
	writer.Write([]byte("Hello"))
}