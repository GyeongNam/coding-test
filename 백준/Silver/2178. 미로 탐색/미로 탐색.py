from collections import deque

def bfs(maze, N, M):
    directions = [(0, 1), (1, 0), (0, -1), (-1, 0)]
    queue = deque([(0, 0)])
    visited = [[False] * M for _ in range(N)]
    visited[0][0] = True
    
    while queue:
        x, y = queue.popleft()
        
        for dx, dy in directions:
            nx, ny = x + dx, y + dy
            
            if 0 <= nx < N and 0 <= ny < M and not visited[nx][ny] and maze[nx][ny] == 1:
                visited[nx][ny] = True
                maze[nx][ny] = maze[x][y] + 1
                queue.append((nx, ny))
    
    return maze[N-1][M-1]

N, M = map(int, input().split())
maze = [list(map(int, input().strip())) for _ in range(N)]

result = bfs(maze, N, M)
print(result)