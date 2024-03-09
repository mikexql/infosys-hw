package problemSet2B.Q3;

import java.util.ArrayList;
import java.util.List;

import problemSet2B.Q2.CustomStack;

public class StackImpl<T> implements CustomStack<T> {
    
    private List<T> myList;

    public StackImpl(){
        myList=new ArrayList<>();
    }

    @Override
    public void push(T t) {
        myList.add(t);
    }

    @Override
    public T pop() {
        if (isEmpty()){
            return null;
        }
        T temp = myList.get(myList.size() - 1);
        myList.remove(myList.size()-1);
        return temp;
    }

    @Override
    public int size() {
        if (myList.size()==0){
            return 0;
        }
        return myList.size();
    }

    @Override
    public T peek() {
        if (isEmpty()){
            return null;
        }
        else{
            return myList.get(myList.size()-1);
        }
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }
}
