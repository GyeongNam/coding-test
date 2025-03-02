def draw_stars(n):
    if n == 1:
        return ['*']

    if n % 3 != 0:  # 예외 처리 추가
        raise ValueError("n은 3의 거듭제곱이어야 합니다.")

    stars = draw_stars(n // 3)  # n이 3의 거듭제곱이므로 안전하게 호출 가능
    result = []

    for star in stars:
        result.append(star * 3)  
    for star in stars:
        result.append(star + ' ' * (n // 3) + star)  
    for star in stars:
        result.append(star * 3)  

    return result

try:
    n = int(input())
    print('\n'.join(draw_stars(n)))
except ValueError as e:
    print(e)
