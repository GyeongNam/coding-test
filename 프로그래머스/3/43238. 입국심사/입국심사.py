def solution(n, times):
    answer = 0
    left = 0
    right = times[-1] * n

    while left <= right:
        mid = (left + right) // 2
        count = 0

        for time in times:
            count += mid // time

        if count < n:
            left = mid + 1
        else:
            right = mid - 1
            answer = mid

    print(answer)
    return answer