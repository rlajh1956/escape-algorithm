# n개의 페어를 이용한 min(a, b)의 합으로 만들 수 잇는 가장 큰 수를 출력하라

# 입력  [1, 4, 3, 2]
# 출력 4


def arrayPairSum( nums:list[int]) -> int:
    sum  = 0
    pair = []
    nums.sort()

    for n in nums: 
        pair.append(n)
        if len(pair) == 2:
            sum += min(pair)
            pair = []

    return sum

print(arrayPairSum([1, 4, 3, 2]))

