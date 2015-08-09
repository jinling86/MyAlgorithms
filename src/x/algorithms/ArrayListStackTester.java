package x.algorithms;

public class ArrayListStackTester {
	
	static public void runTest()
	{
		ArrayListStack aStack = new ArrayListStack();
		
		// Push AAA, BBB, CCC
		aStack.push("AAA");
		aStack.push("BBB");
		aStack.push("CCC");
		
		// Expect to pop CCC, BBB, AAA
		while(!aStack.isEmpty())
		{
			System.out.println(aStack.peek());
			aStack.pop();
		}
		
		// Expect to pop null
		String nullString = aStack.pop();
		if(nullString == null)
			System.out.println("ArrayListStack is a good stack.");
	}
}
