def main():
    N, M = map(int, input().split())
    inf = float('inf')
    dist = [ [inf] * (N+1) for _ in range(N + 1)]
    
    for i in range(1, N+1):
        dist[i][i] = 0
    
    for i in range(M):
        a, b = map(int, input().split())
        dist[a][b] = dist[b][a] = 1
        
    for k in range(1, N+1):
        for i in range(1, N+1):
            for j in range(1, N+1):
                dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j])

    min_value  = float('inf')
    answer = 0
    
    for i in range(1, N+1):
        hap = sum(dist[i][1:])
        
        if hap < min_value:
            min_value = hap
            answer = i
            
    print(answer)

if __name__ == "__main__":
    main()
