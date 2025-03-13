from collections import deque

def bfs(n, m, grid):
    directions = [(0, 1), (1, 0), (0, -1), (-1, 0)]
    visited = [[[False] * 2 for _ in range(m)] for _ in range(n)]  
    queue = deque([(0, 0, 0, 1)])  
    visited[0][0][0] = True

    while queue:
        x, y, wall_broken, dist = queue.popleft()

        if x == n - 1 and y == m - 1:
            return dist

        for dx, dy in directions:
            nx, ny = x + dx, y + dy

            if 0 <= nx < n and 0 <= ny < m:  # 유효한 범위인지 확인

                if grid[nx][ny] == 0 and not visited[nx][ny][wall_broken]:
                    visited[nx][ny][wall_broken] = True
                    queue.append((nx, ny, wall_broken, dist + 1))

                elif grid[nx][ny] == 1 and wall_broken == 0 and not visited[nx][ny][1]:
                    visited[nx][ny][1] = True
                    queue.append((nx, ny, 1, dist + 1))

    return -1  

n, m = map(int, input().split())
grid = [list(map(int, input().strip())) for _ in range(n)]


result = bfs(n, m, grid)
print(result)
