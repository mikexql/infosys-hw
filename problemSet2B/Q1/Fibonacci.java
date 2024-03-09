public class Fibonacci {

    private int[] data;
    private int max;
    private int calls;

    Fibonacci(int max){
        this.max=max;
        this.data = new int[max];
        this.data[0]=0;
        this.data[1]=1;
    }

    public int getFibonacciNumber(int n){
        this.calls=0;
        if (n>=max){
            return -1;
        }
        else{
            return fibRecursive(n);
        }
    }

    private int fibRecursive(int n){
        this.calls+=1;
        if (n != 0 && n != 1) {
            if (this.data[n] == 0) {
                this.data[n] = fibRecursive(n - 1) + fibRecursive(n - 2);
            }
        }
        return this.data[n];
    }

    public int getCalls(){
        return this.calls;
    }

    public int[] getData(){
        return this.data;
    }
}


