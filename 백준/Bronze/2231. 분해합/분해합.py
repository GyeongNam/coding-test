# 자릿수의 합을 계산하는 함수
def digit_sum(number):
    total = 0
    while number > 0: 
        total += number % 10
        number //= 10 
    return total

n = int(input())

result = 0
for i in range(max(1, n - len(str(n)) * 9), n): 
    decomposition_sum = i + digit_sum(i)
    if decomposition_sum == n:
        result = i
        break

print(result)