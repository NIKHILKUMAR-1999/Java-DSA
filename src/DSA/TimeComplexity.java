package DSA;
public class TimeComplexity {
public static void main (String[] args) {
    double now = System.currentTimeMillis();  /*current Time taken by algorithm*/
    
    TimeComplexity time = new TimeComplexity();
    
	System.out.println(time.findsum(999999));
//	System.out.println(time.findsum(999999));
	System.out.println(now);
	System.out.println("Time Take = "+(System.currentTimeMillis()-now)+"millisecs");
}
//public int findsum(int n) {
//	return n*(n+1)/2;
//}

public int findsum(int n) {
int sum=0;
for(int i=1; i<=n ; i++) {
	
	sum= sum+i;
}
return sum;
}
}
