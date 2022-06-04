package exam01;

import java.util.*;

class Person1 implements Comparable{
	private String name;
	private int age;
	
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Object o) {
		Person1 p = (Person1)o;
		return this.age - p.age;
	}
	@Override
	public String toString() {
		
		return name + ": " + age;
		
	}
}

public class ArrayObjSearch {
	public static void main(String[] args) {
		Person1[] ar = new Person1[3];
		ar[0] = new Person1("Lee",29);
		ar[1] = new Person1("Goo",15);
		ar[2] = new Person1("soo", 37);
		Arrays.sort(ar);
		int idx = Arrays.binarySearch(ar, new Person1("who are you", 37));
		System.out.println(ar[idx]);
	}
}
