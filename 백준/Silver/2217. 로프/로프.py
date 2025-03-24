def max_weight(N, ropes):
    ropes.sort(reverse=True)  # 내림차순 정렬
    max_w = 0

    for i in range(N):
        current_w = ropes[i] * (i + 1)  # i + 1은 현재 로프의 개수
        max_w = max(max_w, current_w)  

    return max_w

N = int(input())
ropes = [int(input()) for _ in range(N)]
print(max_weight(N, ropes))
