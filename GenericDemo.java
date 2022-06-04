package exam01;

import javax.print.attribute.standard.PrinterInfo;

class EmployeeInfo {
	public int rank;

	public EmployeeInfo(int rank) {
		this.rank = rank;
	}
}

class Person<T, S> {
	public T info;
	public S id;

	public Person(T info, S id) {
		this.info = info;
		this.id = id;
	}
	public <U> void PrinterInfo(U info) {
		System.out.println(info);
	}
}

public class GenericDemo {
	public static void main(String[] args) {
		
		EmployeeInfo e = new EmployeeInfo(1);
		Integer i = new Integer(10);
		
		Person p1 = new Person(e, i);
		p1.PrinterInfo(e);
	}
}
