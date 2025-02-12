def fill_box(l, w, h, blocks):
    blocks.sort(reverse=True, key=lambda x: x[0])  # 블록 크기 순서대로 정렬
    total_count = 0
    volume = l * w * h  # 상자의 전체 부피
    used_volume = 0

    for i in range(len(blocks)):
        size = 2 ** blocks[i][0]  # 블록의 한 변 크기
        count = blocks[i][1]  # 해당 블록 크기의 개수

        if volume <= used_volume:
            break  # 상자를 이미 채웠다면 종료

        max_count = (l // size) * (w // size) * (h // size)  # 현재 크기로 채울 수 있는 최대 개수
        max_count -= used_volume // (size ** 3)  # 이미 채워진 공간 제외
        use_count = min(count, max_count)

        used_volume += use_count * (size ** 3)
        total_count += use_count

    # 상자를 다 채웠는지 확인
    if used_volume == volume:
        return total_count
    else:
        return -1
    
    
l, w, h = map(int, input().split())

n = int(input())  # 큐브의 종류 개수
blocks = []

    # 큐브 종류 및 개수 입력 받기
for _ in range(n):
    size, count = map(int, input().split())  # 큐브의 지수와 개수
    blocks.append([size, count])

        # 결과 출력
result = fill_box(l, w, h, blocks)
print(result)