import java.util.Stack;

public class Main {
    public static void main(String[] args){

        // *******************************************************

        // stack = LIFO data structure. Last-In First-Out
        //               stores objects into a sort of "vertical tower"
        //    push() to add objects to the top
        //    pop() to remove objects from the top

        // uses of stacks?
        // 1. undo/redo features in text editors
        // 2. moving back/forward through browser history
        // 3. backtracking algorithms (maze, file directories)
        // 4. calling functions (call stack)

        // *******************************************************

        Stack<String> stack = new Stack<>();

        System.out.println(stack.empty());

        stack.push("Item1");
        stack.push("Item2");
        stack.push("Item3");
        stack.push("Item4");
        stack.push("Item5");

        System.out.println(stack.empty());
        System.out.println(stack);

        //pop will remove item from stack
        String topItem = stack.pop();

        System.out.println(stack);

        System.out.println(topItem);

        //peek will not remove item from stack
        topItem = stack.peek();

        System.out.println(stack);

        System.out.println(topItem);

        //search will retorn the position of searhced item in the stack (starting from 1 - top)
        System.out.println(stack.search("Item3"));
        System.out.println(stack.search("Item2"));
        System.out.println(stack.search("Item"));

        //trying to run out off memory
        for (int i=0; i<1000000000; i++){
            stack.push("ItemN");
            System.out.println(i);
        }

    }
}
