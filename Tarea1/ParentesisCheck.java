import java.util.*;

/*Input: String "([()])" true*/

// This algorithm runs in O(n) time because we go through the input string only once.
// n is the length of the input string.

class ParentesisCheck {

    private HashMap<Character, Character> map;
  
    // Builder:
    public ParentesisCheck() {
      // Create a HashMap that maps closing brackets or parenthesis to its opening ones:
      this.map = new HashMap<Character, Character>();
      this.map.put(')', '(');
      this.map.put(']', '[');
    }
  
    public boolean isValid(String s) {
  
      // Create a Stack of Characters to save the opening brackets and parenthesis that we need to find a closing character to.
      Stack<Character> stack = new Stack<Character>();
    
      for (Character c : s.toCharArray()) {
  
        // If the current character is a closing bracket.
        if (this.map.containsKey(c)) { // if(c == ']' || c == ')')
  
          // Get the top element of the stack. If the stack is empty, set a dummy value of 'x'

          char top;

          if(stack.empty()){

            top = 'x';

          } else {

            top = stack.pop();

          }
  
          // If the mapping for this bracket doesn't match the stack's top element, return false.
          if (top != this.map.get(c)) {
            return false;
          }
        } else {
          // If it was an opening bracket, push to the stack.
          stack.push(c);
        }
      }
      
      // Check if the stack is empty. If its not, then its an invalid input.
      if(stack.isEmpty()){

        return true;

      } else {

        return false;

      }

    }
  }