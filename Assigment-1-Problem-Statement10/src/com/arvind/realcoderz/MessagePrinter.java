package com.arvind.realcoderz;

public class MessagePrinter {
	void printMessage(String name) {
		System.out.println("hello.."+ name);
	}
	public static void main(String[] args) {
		MessagePrinter mp=new MessagePrinter();
		mp.printMessage("Arvind Verma ");
	}
}
