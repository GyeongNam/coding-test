def binary_search(arr, target):
    left, right = 0, len(arr) - 1
    
    # 이진탐색이 계속 실행될 조건
    while left <= right:
        mid = (left + right) // 2
        
        if arr[mid] == target: # 이진 탐색에서 타겟을 찾았는지 확인하는 조건
            return True
        elif arr[mid] < target: # 타겟 값이 중간 값보다 큰 경우의 조건
            left = mid + 1
        else:
            right = mid - 1
    return False

# 입력 처리
N = int(input().strip())
A = list(map(int, input().strip().split()))
M = int(input().strip())
queries = list(map(int, input().strip().split()))

# 정렬
A.sort()

# 이진 탐색을 통한 결과 계산
results = []
for query in queries:
    if binary_search(A, query):
        results.append(1)
    else:
        results.append(0)

# 결과 출력
for result in results:
    print(result)