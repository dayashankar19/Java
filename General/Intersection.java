import java.util.Scanner;
import java.util.ArrayList;
public class Intersection {
    public static void main(String[] args) {
        ArrayList <Integer> li=new ArrayList<>();
        int A[]={1,2,2,3,3,4,5,6};
        int B[]={2,3,3,5,6,6,7};
        int i=0,j=0;
        while(i<A.length && j<B.length){
            if(A[i]<B[j]){
                i++;
            }
            else if(B[j]<A[i]){
                j++;
            }
            else{
                li.add(B[j]);
                i++;
                j++;
            }
        }
        for( i=0;i<li.size();i++){
            System.out.println(li.get(i));
        }
    }
}
