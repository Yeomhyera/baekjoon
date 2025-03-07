class Solution {
    
    static boolean[] visited;
    static int answer = 0;
    
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        DFS(0, k, dungeons);
        return answer;
    }
    
    public static void DFS(int X, int K, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            if (visited[i] || dungeons[i][0] > K) {
                continue;
            }
            visited[i] = true;
            DFS(X + 1, K - dungeons[i][1], dungeons);
            visited[i] = false;
        }
        answer = Math.max(answer, X);
    }
    
}