import java.util.*;
import java.util.stream.*;	

class Practice 
{
public static void main(String ar[])
{
ArrayList<Integer> al=new ArrayList<Integer>();
al.add(10);
al.add(0);
al.add(15);
al.add(5);
al.add(20);
System.out.println(al);
Integer min=al.stream().min((i1,i2)->-i1.compareTo(i2)).get();
Integer max=al.stream().max((i1,i2)->-i1.compareTo(i2)).get();
System.out.println(min);
System.out.println(max);
}	
	}
	
	// System.out.println(al);
	// System.out.println(al);
	

// interview questiom of java(1-hour)

// hibernate (todo)notetracker 19 8-7

 // springboot cousre (2-hour)
 
 // dsa tree graph greedy dynamic (3-4 hour)
 
 // side skills git node js dbms sqlmysql cn operating system  compiler
 
 // aptitude (2-hour)
 
// al2 is an ArrayList<Object>, which means it can hold objects of any type.
// When you add elements to al2, the compiler checks that they are compatible 
// with the Object type.
// When you call al.addAll(al2), the compiler checks that the elements in
 // al2 are compatible with the Number type, which is the type parameter
 // of al. Since al2 contains a String ("ab"), the compiler will not allow 
 // this code to compile.
 
 
 
// Second code:

// al2 is a raw type ArrayList, which means it can hold objects of any
 // type without any type safety checks.
// When you add elements to al2, the compiler does not perform any type 
// checks.
// When you call al.addAll(al2), the compiler does not perform any 
// type checks, and the code will compile. However, at runtime, when
 // you try to add the elements of al2 to al, you will get a
 // ClassCastException because al is expecting Number objects, b
// ut al2 contains a String ("ab").



// The reason is due to the concept of Raw Types in Java.

// In the code, you have two ArrayLists: al and al2. al is a generic ArrayList of Integers, whereas al2 is a raw ArrayList (i.e., it's not parameterized with a specific type).

// Here's what happens:

// You add three Integer objects to al.
// You add a Boolean object and a String object to al2.
// You call al.addAll(al2), which adds all elements from al2 to al.
// Now, when you print al, you might expect an error or a compilation warning, but that's not the case. This is because Java allows raw types to coexist with generic types, but it's not recommended.

// The output will be: [10, 10, 10, true, ram]

// The reason for this behavior is that Java performs type erasure on generic types. This means that at runtime, the type information is lost, and the ArrayList is treated as a raw type. As a result, the addAll method can add objects of different types to al, even though it was initially declared as an ArrayList of Integers.

// However, if you try to retrieve an element from al and assign it to an Integer variable, you'll get a ClassCastException at runtime, because the actual object is not an Integer.

// To avoid these issues, it's recommended to use parameterized types consistently throughout your code. In this case, you should declare al2 as an ArrayList<Object> to indicate that it can hold objects of any type.