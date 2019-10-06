import java.util.Scanner;
class fcfs{
	void waittime(int wt[],int n,int bt[]){
		 wt[0]=0;
		for(int i=1;i<n;i++){
			wt[i]=bt[i-1]+wt[i-1];
		}
	}
	//totalwaitime=totalwaitime+wt[i]
	//averagewaitime=totalwaitime/n
	public static void main(String[] args){
		int process[] = {1,2,3};
		int n = process.length;
		int burst[] = {10,5,8};
		int wt[] = new int[n];
		fcfs as = new fcfs();
	as.waittime(wt,n,burst);
	System.out.println("waitime");
	for(int i=0;i<n;i++){
		System.out.println(wt[i]);
	}
	}
}