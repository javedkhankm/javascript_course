package com.cybertek.package1;

//1 - import package.*

//import com.cybertek.package2.*;

//2 - import package.className

//	import com.cybertek.package2.Class2;
//	import com.cybertek.package2.Class3;

//if you have same class under different packages


public class Class1 {

	public static void main(String[] args) {
		
		//There are three ways to access package from outside package
		//1 - import package.*;
		//2 - import package.className;
		//3 - fully qualified name
		
		//Class2 cl = new Class2();
		//Class3 cl1 = new Class3();
		
		//3 - fully qualified name //for this way you don't need Class2 cl = new Class2();/Class3 cl1 = 
		//new Class3(); separately.
		
		com.cybertek.package2.Class2 cl = new com.cybertek.package2.Class2();
		com.cybertek.package2.Class3 cl1 = new com.cybertek.package2.Class3(); 
	}

}
