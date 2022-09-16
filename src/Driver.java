
public class Driver {
	
	public static void main(String args[]) {
		 
		NmeetingsInOneRoom room=new NmeetingsInOneRoom();
		
		int[] start = {75250, 50074, 43659, 8931, 11273, 27545, 50879, 77924};
		int[] end= {112960, 114515, 81825, 93424 ,54316, 35533, 73383, 160252};
		
		int ans=room.maxMeetings(start, end, 8);
		 System.out.println(ans);
		
		
		
	}
	

}
