package 예상문제들;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오.
 * 단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 
 * 더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.
 * ===========
 * 첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 
 * 탐색을 시작할 정점의 번호 V가 주어진다. 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다.
 * 어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 입력으로 주어지는 간선은 양방향이다.
 * ===
 4 5 1
1 2
1 3
1 4
2 4
3 4
->
1 2 4 3
1 2 3 4
 */
public class bfsdfs기본 {
	
	static int N,M,V;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		V = sc.nextInt();
		
		int[][] mat = new int[N+1][N+1];
		
		for(int i=0; i<M; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			
			mat[from][to] = mat[to][from] = 1;
		}
		
		dfs(mat, new boolean[N+1], V);
		
		bfs(mat, V);
	}
	
	static void bfs(int[][] mat, int start) {
		Queue<Integer> qu = new LinkedList<Integer>();
		boolean[] visited = new boolean[N+1];
		
		qu.offer(start);
		visited[start] = true;//큐 들어갈때 방문체크
		
		while(!qu.isEmpty()) {
			int current = qu.poll();
			for(int j=1; j<N+1; j++) {
				if(!visited[j] && mat[current][j]!=0) {
					qu.offer(j);
					visited[j] =true;
				}
			}
		}
	}
	
	static void dfs(int[][] mat, boolean[] visited, int current) {
		visited[current] = true;
		
		for(int j=1; j<N+1; j++) {
			if(!visited[j] && mat[current][j]!=0) {
				dfs(mat, visited, j);
			}
		}
	}
}
