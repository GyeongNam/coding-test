from sys import stdin

input = stdin.readline # 빠른 입력

# 입력값 받기
n, m = map(int, input().split())
graph = [[] for _ in range(n + 1)]
for _ in range(m):
    x, y, d = map(int, input().split())
    graph[x].append((y, d))
    graph[y].append((x, d))

s, e = map(int, input().split())
ans = 0
left = 1
right = 10 ** 9
# 이분탐색을 두 포인트 방식으로 수행
while left <= right:
    mid = (left + right) // 2 # 중간값. 이 값보다 큰 중량 제한을 가진 다리만 건널 수 있어요.
    visited = [False] * (n + 1) # 그래프 탐색 초기 설정
    visited[s] = True
    q = [s]
    # BFS로 구현하기
    for idx in q:
        for adj, d in graph[idx]:
            if not visited[adj] and d >= mid: # 이미 방문한 섬과 중량 제한을 넘어가는 다리는 건너지 않아요.
                visited[adj] = True
                q.append(adj)
    if visited[e]: # 목적지에 도착했다면 정답을 갱신해요.
        ans = mid
        left = mid + 1
    else:
        right = mid - 1
print(ans)