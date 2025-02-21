def find_max_length(K, N, cables):
    start = 1
    end = max(cables)

    while start <= end:
        mid = (start + end) // 2  # 중간값 계산

        # 현재 길이로 만들 수 있는 랜선의 개수 계산
        count = 0  # 각 케이블에서 만들 수 있는 랜선 수의 합
        for cable in cables:
            count += cable // mid

        if count >= N:  # 랜선을 N개 이상 만들 수 있는 경우
            start = mid + 1  # 더 긴 길이 시도
        else:
            end = mid - 1

    return end

# 입력 처리
K, N = map(int, input().split())
cables = [int(input()) for _ in range(K)]
print(find_max_length(K, N, cables))