from collections import deque

def bfs(A, B, C):
    visited = set()
    possible_amounts = set()
    
    queue = deque([(0, 0, C)])  
    visited.add((0, 0, C))
    
    while queue:
        a, b, c = queue.popleft()
        
        if a == 0:
            possible_amounts.add(c)
        
        if a + b <= B:
            new_state = (0, a + b, c)
            if new_state not in visited:
                visited.add(new_state)
                queue.append(new_state)
        else:
            new_state = (a - (B - b), B, c)
            if new_state not in visited:
                visited.add(new_state)
                queue.append(new_state)
        
        if a + c <= C:
            new_state = (0, b, a + c)
            if new_state not in visited:
                visited.add(new_state)
                queue.append(new_state)
        else:
            new_state = (a - (C - c), b, C)
            if new_state not in visited:
                visited.add(new_state)
                queue.append(new_state)
        
        if b + a <= A:
            new_state = (b + a, 0, c)
            if new_state not in visited:
                visited.add(new_state)
                queue.append(new_state)
        else:
            new_state = (A, b - (A - a), c)
            if new_state not in visited:
                visited.add(new_state)
                queue.append(new_state)
        
        if b + c <= C:
            new_state = (a, 0, b + c)
            if new_state not in visited:
                visited.add(new_state)
                queue.append(new_state)
        else:
            new_state = (a, b - (C - c), C)
            if new_state not in visited:
                visited.add(new_state)
                queue.append(new_state)
        
        if c + a <= A:
            new_state = (c + a, b, 0)
            if new_state not in visited:
                visited.add(new_state)
                queue.append(new_state)
        else:
            new_state = (A, b, c - (A - a))
            if new_state not in visited:
                visited.add(new_state)
                queue.append(new_state)
        
        if c + b <= B:
            new_state = (a, c + b, 0)
            if new_state not in visited:
                visited.add(new_state)
                queue.append(new_state)
        else:
            new_state = (a, B, c - (B - b))
            if new_state not in visited:
                visited.add(new_state)
                queue.append(new_state)

    return sorted(possible_amounts)

A, B, C = map(int, input().split())
result = bfs(A, B, C)

print(" ".join(map(str, result)))
