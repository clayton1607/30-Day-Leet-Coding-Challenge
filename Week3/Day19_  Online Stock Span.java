class StockSpanner {
    private Stack<Integer> stack;
    private ArrayList<Integer> arr;
    private int count;
    public StockSpanner() {
        stack = new Stack<>();
        arr = new ArrayList<>();
        count=0;
    }
    
    public int next(int price) {
        if(arr.size() == 0){
            stack.push(0);
            arr.add(price);
            count++;
            return 1;
            
        }
        else{
            arr.add(price);
            //System.out.println(stack + " "+ arr);
            while(!stack.empty() && arr.get(stack.peek()) <= price)
                stack.pop();
            //System.out.println(stack + " "+ arr);
            int x =(stack.empty()) ? (count + 1) : (count - stack.peek());
            stack.push(count);
            count++;
            return x;
        }
      
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */