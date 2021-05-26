import java.util.Stack;
class Main{
	public static void main(String args[]){
		Stack<String> pancakes = new Stack<>();
		FunWithStacks fun = new FunWithStacks();
		fun.populateStack(pancakes);
		System.out.println(pancakes);
		Stack<String> newPancakes = new Stack<>();
		newPancakes = fun.reverseStack(pancakes);
		System.out.println(newPancakes);
	}
}
