def robot_vacuum(N, M, start_r, start_c, start_d, room):
    # 방향 벡터 (북, 동, 남, 서)
    directions = [(-1, 0), (0, 1), (1, 0), (0, -1)]
    
    # 청소한 칸 수
    cleaned_count = 0
    
    # 현재 위치와 방향
    r, c, d = start_r, start_c, start_d
    
    # 청소 상태를 저장할 배열
    cleaned = [[False] * M for _ in range(N)]
    
    while True:
        # 현재 칸 청소
        if not cleaned[r][c]:
            cleaned[r][c] = True
            cleaned_count += 1
        
        # 주변 4칸 중 청소되지 않은 빈 칸 찾기
        found_empty = False
        for i in range(4):
            # 반시계 방향으로 회전
            d = (d + 3) % 4
            nr, nc = r + directions[d][0], c + directions[d][1]
            if 0 <= nr < N and 0 <= nc < M and room[nr][nc] == 0 and not cleaned[nr][nc]:
                found_empty = True
                r, c = nr, nc  # 한 칸 전진
                break
        
        # 주변에 청소되지 않은 빈 칸이 없을 경우
        if not found_empty:
            # 후진할 수 있는지 확인
            back_r, back_c = r - directions[d][0], c - directions[d][1]
            if 0 <= back_r < N and 0 <= back_c < M and room[back_r][back_c] == 0:
                r, c = back_r, back_c  # 한 칸 후진
            else:
                break  # 후진할 수 없으면 종료
    
    return cleaned_count

# 입력 받기
N, M = map(int, input().split())
start_r, start_c, start_d = map(int, input().split())
room = [list(map(int, input().split())) for _ in range(N)]

# 결과 출력
result = robot_vacuum(N, M, start_r, start_c, start_d, room)
print(result)
