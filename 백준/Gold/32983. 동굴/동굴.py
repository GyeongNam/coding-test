from collections import deque

def max_profit(N, M, C, S_r, S_c, cave):
    directions = [(-1, 0), (1, 0), (0, -1), (0, 1)]
    dist = [[-1] * M for _ in range(N)]
    rupee_by_dist = []

    # 0-indexed
    start_r, start_c = S_r - 1, S_c - 1
    queue = deque()
    queue.append((start_r, start_c))
    dist[start_r][start_c] = 0

    while queue:
        r, c = queue.popleft()
        d = dist[r][c]

        # 거리별 루피 합 배열 크기 맞추기
        if d >= len(rupee_by_dist):
            rupee_by_dist.extend([0] * (d - len(rupee_by_dist) + 1))
        if cave[r][c] != -1:
            rupee_by_dist[d] += cave[r][c]

        for dr, dc in directions:
            nr, nc = r + dr, c + dc
            if 0 <= nr < N and 0 <= nc < M and cave[nr][nc] != -1 and dist[nr][nc] == -1:
                dist[nr][nc] = d + 1
                queue.append((nr, nc))

    # 누적합 계산
    prefix = [0] * (len(rupee_by_dist) + 1)
    for i in range(len(rupee_by_dist)):
        prefix[i+1] = prefix[i] + rupee_by_dist[i]

    # 최대 이윤 계산
    max_profit = 0
    for L in range(1, len(prefix)):
        loot = prefix[L]
        cost = (L - 1) * C
        max_profit = max(max_profit, loot - cost)

    return max(max_profit, 0)

# 입력 받기
N, M, C = map(int, input().split())
S_r, S_c = map(int, input().split())
cave = [list(map(int, input().split())) for _ in range(N)]

# 최대 이윤 계산
result = max_profit(N, M, C, S_r, S_c, cave)
print(result)
