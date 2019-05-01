import java.util.ArrayList;
import java.util.List;

public class CountElements {

    static void count(int a[]){
        List<Integer> done = new ArrayList<Integer>();
        for(int i=0;i<a.length;i++){
            if(done.indexOf(a[i]) < 0){
                int count=1;
                for(int j=i+1;j<a.length;j++){
                    if(a[i] == a[j]){
                        count++;
                    }
                    done.add(a[i]);
                }
                System.out.println("element "+a[i]+" occurred "+count + " times");
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,6,7,3,9,9,9};
        count(a);
    }
}
