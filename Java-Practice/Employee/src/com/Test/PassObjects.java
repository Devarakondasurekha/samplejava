package com.Test;

public class PassObjects {

	public static void main(String[] args) {
		Employee obj1 = new Employee(10);
		Employee obj2 = new Employee(20);
		Check obj = new Check();
		System.out.println(obj1.id+"\t"+obj2.id);
		obj.swap(obj1,obj2);
		System.out.println(obj1.id+"\t"+obj2.id);
		

	}

}
