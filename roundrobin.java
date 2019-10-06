class roundrobin{
	void waittime(int wt[],int burst[],int rem_b[],int quantum,int n){
		int t = 0;
		while(true){
			boolean done = true;
			
			for(int i=0;i<n;i++){
				if(rem_b[i]>0){
					done = false;
					if(rem_b[i]>quantum){
						t = t + quantum;
						rem_b[i] -= quantum;
					}
					else{
						t = t + rem_b[i];
						wt[i] = t - burst[i];
						rem_b[i]=0;
					}
				}
				}
				if(done==true){
					break;
			}
	}
	
	}
	void turnaroundtime(int tat[],int wt[],int bt[],int n){
		
		for(int i=0;i<n;i++){
			tat[i] = wt[i] + bt [i]; 
		}
	}
	public static void main(String args[]){
		int process[] = {1,2,3};
		int burst[] = {10,5,8};
		int n = burst.length;
		int quantum = 2;
		int rem_b[] = new int[n];
		int wt[] =new int[n];
		int tat[] = new int[n];
		for(int i=0;i<n;i++){
			rem_b[i]=burst[i];
		}
		roundrobin ab = new roundrobin();
		ab.waittime(wt,burst,rem_b,quantum,n);
		ab.turnaroundtime(tat,wt,burst,n);
		System.out.println("process"+"      "+"bursttime"+"       "+"waittime"+"      "+"tat");
		for(int i=0;i<n;i++){
		System.out.println(i+"\t\t"+burst[i]+"\t\t"+wt[i]+"\t\t"+tat[i]);
	}
		
	}
}
