from collections import deque

def tomato_ripening(M, N, box):
    # 방향 벡터 (상, 하, 좌, 우)
    directions = [(-1, 0), (1, 0), (0, -1), (0, 1)]
    
    queue = deque()
    total_tomatoes = 0
    ripe_tomatoes = 0
    
    # 초기 상태를 큐에 추가하고 총 토마토 수 계산
    for r in range(N):
        for c in range(M):
            if box[r][c] == 1:
                queue.append((r, c))  # 익은 토마토의 위치
                ripe_tomatoes += 1
            if box[r][c] != -1:
                total_tomatoes += 1  # 총 토마토 수 (익은 + 익지 않은)
    
    # BFS 시작
    days = 0
    while queue:
        for _ in range(len(queue)):
            r, c = queue.popleft()
            for dr, dc in directions:
                nr, nc = r + dr, c + dc
                if 0 <= nr < N and 0 <= nc < M and box[nr][nc] == 0:
                    box[nr][nc] = 1  # 익게 만듦
                    queue.append((nr, nc))
                    ripe_tomatoes += 1
        days += 1
    
    # 모든 토마토가 익었는지 확인
    if ripe_tomatoes == total_tomatoes:
        return days - 1  # 마지막 증가로 인해 하루가 더해졌으므로 -1
    else:
        return -1

# 입력 받기
M, N = map(int, input().split())
box = [list(map(int, input().split())) for _ in range(N)]

# 최소 일수 계산
result = tomato_ripening(M, N, box)
print(result)
