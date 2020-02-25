import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class bfs{
	void transversal(int arr[][]) {
		int v=arr.length;
		Boolean visited[]=new Boolean[v];
		Arrays.fill(visited,false);
		Queue<Integer> que=new LinkedList<Integer>();
		que.add(0);
		visited[0]=true;
		while(!que.isEmpty()) {
			int j=que.poll();
			System.out.println(j+1);
			for(int i=0;i<v;i++) {
				//here j represents the node number and i represts the connected nodes to it
				if(arr[j][i]==1 && visited[i]==false) {
					que.add(i);
					visited[i]=true;
				}
			}
		}
	}	
}
public class BFSMatrix {

	public static void main(String[] args) {
		int arr[][]= { {0,1,0,1,1},{1,0,1,1,0},{0,1,0,0,0},{1,1,0,0,1},{1,0,0,1,0}};
		bfs obj=new bfs();
		obj.transversal(arr);
	}
		
}
