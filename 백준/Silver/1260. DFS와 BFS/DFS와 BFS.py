from collections import deque

def dfs(v, visited, graph, result):
    visited[v] = True
    result.append(v)
    for i in range(1, len(graph)):
        if not visited[i] and graph[v][i] == 1:
            dfs(i, visited, graph, result)

def bfs(v, visited, graph, result):
    queue = deque([v])
    visited[v] = True
    while queue:
        node = queue.popleft()
        result.append(node)
        for i in range(1, len(graph)):
            if not visited[i] and graph[node][i] == 1:
                queue.append(i)
                visited[i] = True

def main():
    N, M, V = map(int, input().split())  
    graph = [[0] * (N + 1) for _ in range(N + 1)]  

    for _ in range(M):
        u, v = map(int, input().split())
        graph[u][v] = graph[v][u] = 1  

    visited_dfs = [False] * (N + 1)
    visited_bfs = [False] * (N + 1)
    
    dfs_result = []
    bfs_result = []
    
    dfs(V, visited_dfs, graph, dfs_result)
    
    bfs(V, visited_bfs, graph, bfs_result)
    
    print(" ".join(map(str, dfs_result)))
    print(" ".join(map(str, bfs_result)))


if __name__ == "__main__":
    main()
