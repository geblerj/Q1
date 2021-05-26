import java.util.Stack;
public class FunWithStacks{
	public void populateStack(Stack<String> pancakes){
		pancakes.push("Jimmy");
		pancakes.push("Billy");
		pancakes.push("Freddy");
		pancakes.push("Georgie");
		pancakes.push("Sally");
		pancakes.push("Ronny");
		pancakes.push("Sallie");
		pancakes.push("Molly");
		pancakes.push("Worry");
		pancakes.push("Sorry");
	}
	public Stack<String> reverseStack(Stack<String> pancakes){
		Stack<String> newPancakes = new Stack<>();
		for(int i=0;i<10;i++){
			newPancakes.push(pancakes.pop());
		}
		return newPancakes;
	}
}
