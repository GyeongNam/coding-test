import bisect

def longest_increasing_subsequence(arr):
    # LIS를 구성하는 부분 수열을 저장하는 리스트
    lis = []
    
    for num in arr:
        # num이 lis에 들어갈 위치를 찾는다.
        pos = bisect.bisect_left(lis, num)
        
        # lis에 num이 들어갈 위치가 존재하면 해당 위치의 값을 num으로 대체
        if pos < len(lis):
            lis[pos] = num
        else:
            # lis에 추가
            lis.append(num)
    
    # lis의 길이가 가장 긴 증가하는 부분 수열의 길이
    return len(lis)

# 입력
n = int(input())  # 카드의 개수
arr = list(map(int, input().split()))  # 수열

# 결과 출력
print(longest_increasing_subsequence(arr))
