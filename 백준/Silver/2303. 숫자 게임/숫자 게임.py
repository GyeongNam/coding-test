from itertools import combinations

N = int(input())
cards = [list(map(int, input().split())) for _ in range(N)]

max_digit = -1
winner = -1

for i in range(N):
    for combo in combinations(cards[i], 3):
        total = sum(combo)
        last_digit = total % 10
        
        if last_digit > max_digit or (last_digit == max_digit and i + 1 > winner):
            max_digit = last_digit
            winner = i + 1

print(winner)
