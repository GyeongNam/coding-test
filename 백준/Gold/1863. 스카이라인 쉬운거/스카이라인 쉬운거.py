n = int(input())
buildings = [list(map(int, input().split())) for _ in range(n)]
buildings.sort() 
ans = 0
stack = []
for x, y in buildings:
    if y == 0:             
        ans += len(stack)   
        stack = []          
        continue

    while stack and stack[-1] > y:       
        stack.pop()                
        ans += 1                  
    if not stack or stack[-1] < y: 
        stack.append(y)

print(ans + len(stack)) 