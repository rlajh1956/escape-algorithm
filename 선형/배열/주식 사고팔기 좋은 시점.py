# 배열을 입력 받아 output[i]가 자신을 제외한 나머지 모든 요소의 곱셈 결과가 되도록 출력

# 입력  [7, 1, 5, 3, 6, 4]
# 출력 5

def maxProfit(prices: list[int]) -> int:
    max_price = 0

    for i, price in enumerate(prices):
        for j in range(i, len(prices)):
            max_price = max(prices[j] - price, max_price)

    return max_price



print(maxProfit([7, 1, 5, 3, 6, 4]))