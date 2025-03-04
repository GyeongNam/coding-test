def max_path_sum(n, triangle):
    # dp 배열 초기화
    dp = [[0] * n for _ in range(n)]
    dp[0][0] = triangle[0][0]

    # 모든 위치에서 최대 합 계산
    for i in range(1, n):
        for j in range(i + 1):
            if j == 0:
                dp[i][j] = dp[i-1][j] + triangle[i][0]  # 왼쪽 끝인 경우
            elif j == i:
                dp[i][j] = dp[i-1][j-1] + triangle[i][i]  # 오른쪽 끝인 경우
            else:
                dp[i][j] = max(dp[i-1][j-1], dp[i-1][j]) + triangle[i][j]  # 중간인 경우

    # 마지막 행에서 최대값 반환
    return max(dp[n-1])

# 입력 처리
n = int(input())
triangle = []
for _ in range(n):
    triangle.append(list(map(int, input().split())))

print(max_path_sum(n, triangle))