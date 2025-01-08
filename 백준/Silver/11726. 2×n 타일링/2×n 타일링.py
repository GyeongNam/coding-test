n = int(input())
a, b = 1, 1

for i in range(1, n):
    a, b = b, (a + b) % 10007

print(b)