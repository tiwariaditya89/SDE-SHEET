/*
Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is leader if it is greater than or eq>>ual to all the elements to its right side. The rightmost element is always a leader. 
*/



class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> a = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        s.push(arr[n-1]);
        for(int i = n-2;i>=0;i--){
            if(s.peek()<=arr[i]){
                s.push(arr[i]);
            }
        }
        
        int temp =s.size();
        for(int i=0;i<temp;i++){
            a.add(s.pop());
        }
        return a;
    }
}