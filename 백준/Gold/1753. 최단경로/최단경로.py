import heapq
import sys
input = sys.stdin.readline 

def dijkstra(V, K, graph):
    # 최단 거리 테이블 초기화
    distance = [float('inf')] * (V + 1)
    distance[K] = 0
    queue = []
    
    # 시작 노드 정보 우선순위 큐에 삽입
    heapq.heappush(queue, (0, K))
    
    while queue:
        # 가장 최단 거리가 짧은 노드 정보 꺼내기
        dist, now = heapq.heappop(queue)
        
        # 현재 노드까지의 거리가 이미 더 짧은 경우 무시
        if distance[now] < dist:
            continue
            
        # 현재 노드와 연결된 다른 노드들 확인
        for next_node, weight in graph[now]:
            cost = dist + weight
            
            # 현재 노드를 거쳐서 다른 노드로 이동하는 거리가 더 짧은 경우
            if cost < distance[next_node]:
                distance[next_node] = cost
                heapq.heappush(queue, (cost, next_node))
                
    return distance

# 입력의 효율적인 처리
V, E = map(int, input().split())
K = int(input())

# 그래프 초기화를 더 효율적으로
graph = [[] for _ in range(V + 1)]
for _ in range(E):
    u, v, w = map(int, input().split())
    graph[u].append((v, w))

# 다익스트라 알고리즘 수행
result = dijkstra(V, K, graph)

for i in range(1, V + 1):
    print("INF" if result[i] == float('inf') else result[i])