from collections import deque, defaultdict
import sys
input = sys.stdin.read

def find_final_ranking(n, last_year, changes):
    # 그래프 초기화
    graph = defaultdict(list)
    in_degree = [0] * (n + 1)
    
    # 작년 순위 그래프를 생성
    for i in range(n):
        for j in range(i + 1, n):
            graph[last_year[i]].append(last_year[j])
            in_degree[last_year[j]] += 1
    
    # 변경된 순위를 반영
    for a, b in changes:
        if b in graph[a]:
            graph[a].remove(b)
            in_degree[b] -= 1
            graph[b].append(a)
            in_degree[a] += 1
        else:
            graph[b].remove(a)
            in_degree[a] -= 1
            graph[a].append(b)
            in_degree[b] += 1
    
    # 위상 정렬의 초기 조건
    queue = deque([i for i in range(1, n + 1) if in_degree[i] == 0])
    result = []
    
    while queue:
        if len(queue) > 1:
            # 순위가 결정될 수 없는 경우
            return "?"
        
        current = queue.popleft()
        result.append(current)
        
        for neighbor in graph[current]:
            in_degree[neighbor] -= 1
            if in_degree[neighbor] == 0:
                queue.append(neighbor)
    
    if len(result) == n:
        return " ".join(map(str, result))
    else:
        return "IMPOSSIBLE"

def main():
    input_data = input().strip().splitlines()
    index = 0
    t = int(input_data[index])
    index += 1
    results = []
    
    for _ in range(t):
        n = int(input_data[index])
        index += 1
        last_year = list(map(int, input_data[index].split()))
        index += 1
        m = int(input_data[index])
        index += 1
        changes = []
        
        for _ in range(m):
            a, b = map(int, input_data[index].split())
            changes.append((a, b))
            index += 1
        
        result = find_final_ranking(n, last_year, changes)
        results.append(result)
    
    print("\n".join(results))

if __name__ == "__main__":
    main()
