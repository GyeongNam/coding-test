def calculate_power(n, m, board):
    visited = [[False] * n for _ in range(m)]
    total_white = total_blue = 0

    def dfs(x, y, color):
        count = 1
        visited[x][y] = True
        dx = [-1, 1, 0, 0]
        dy = [0, 0, -1, 1]

        for i in range(4):
            nx = x + dx[i]  
            ny = y + dy[i] 

            if 0 <= nx < m and 0 <= ny < n and not visited[nx][ny] and board[nx][ny] == color:
                count += dfs(nx, ny, color)  

        return count

    for i in range(m):
        for j in range(n):
            if not visited[i][j]:
                count = dfs(i, j, board[i][j])  
                if board[i][j] == 'W':
                    total_white += count * count
                else:
                    total_blue += count * count

    return total_white, total_blue

N, M = map(int, input().split())
board = [list(input().strip()) for _ in range(M)]
white, blue = calculate_power(N, M, board)
print(white, blue)