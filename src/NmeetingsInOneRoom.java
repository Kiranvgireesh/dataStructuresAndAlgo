import java.util.Arrays;

public class NmeetingsInOneRoom {
	public static int maxMeetings(int start[], int end[], int n)
    {
        int[][] arr=new int[n][2];
        
        for(int i=0;i<n;i++){
            arr[i][0]=start[i];
            arr[i][1]=end[i];
            
        }
        
        Arrays.sort(arr,(a, b) -> Integer.compare(a[1],b[1
                                                         ]) );
        
        int count=0;
        int last=0;
        
        for(int i=0;i<n;i++){
            if(arr[i][0]>last){
                count++;
                last=arr[i][1];
            }
            
            
            
        }
        return count;
        
        
        
    }

}
