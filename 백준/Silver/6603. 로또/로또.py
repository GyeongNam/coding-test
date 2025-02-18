def generate_lotto(numbers, selected, start, target):  # 목표 개수
    if len(selected) == target:  # 로또 번호 개수 체크
        print(' '.join(map(str, selected)))
        return

    for i in range(start, len(numbers)):
        selected.append(numbers[i])
        generate_lotto(numbers, selected, i + 1, target)  # 다음 시작 인덱스
        selected.pop()

while True:
    input_data = list(map(int, input().split()))
    if input_data[0] == 0:
        break

    k = input_data[0]
    numbers = input_data[1:]
    generate_lotto(numbers, [], 0, 6)
    print()
