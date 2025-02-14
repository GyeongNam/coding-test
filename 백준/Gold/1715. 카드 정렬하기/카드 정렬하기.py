import heapq

def card_sorting(N, cards):
    # 우선순위 큐(힙)에 카드 묶음 크기 삽입
    heapq.heapify(cards)
    total_cost = 0

    # 카드가 하나 남을 때까지 묶음 합치기
    while len(cards) > 1:
        # 가장 작은 두 묶음 크기 꺼내기
        first = heapq.heappop(cards)
        second = heapq.heappop(cards)
        
        # 합치는 비용 계산
        cost = first + second
        total_cost += cost
        
        # 새로운 묶음을 큐에 삽입
        heapq.heappush(cards, cost)

    return total_cost

# 입력 받기
N = int(input())
cards = [int(input()) for _ in range(N)]

# 결과 출력
print(card_sorting(N, cards))
