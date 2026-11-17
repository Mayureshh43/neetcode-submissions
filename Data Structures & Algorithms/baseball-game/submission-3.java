class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<Integer>();
        int ops1=0;
        for(String op: operations){
            if("C".equals(op)){
                ops1 -= stack.peek();
                stack.pop();
            }else if("D".equals(op)){
                if(!stack.empty()){
                int s= stack.peek();
                stack.push(s*2);
                ops1 += stack.peek();
                }
            }else if("+".equals(op)){
                if(stack.size()>=2){
                stack.push(stack.get(stack.size()-1)+ stack.get(stack.size()-2));
                ops1 += stack.peek();
                }
            }else{
                stack.push(Integer.parseInt(op));
                ops1 += stack.peek();
            }
        }
        return ops1;
    }
}