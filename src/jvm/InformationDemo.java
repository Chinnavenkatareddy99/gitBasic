package jvm;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class InformationDemo {
	public static void main(String[] args) {
		GettingInfoemationByClassObject gi = new GettingInfoemationByClassObject();
		Class c = gi.getClass();
		System.out.println(c.getName());
		Method[] m = c.getDeclaredMethods();

		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
		}
		Field[] f = c.getDeclaredFields();

		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i]);
		}
	} 

}
