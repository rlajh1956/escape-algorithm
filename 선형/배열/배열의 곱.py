# 배열을 입력 받아 output[i]가 자신을 제외한 나머지 모든 요소의 곱셈 결과가 되도록 출력

# 입력  [1,2,3,4]
# 출력 [24,12,8,6]

def productExceptSelf(nums: list[int]) -> list[int]:
    out = []
    p = 1
    for i in range(0, len(nums)):
        out.append(p)
        p = p * nums[i]

    p = 1
    for i in range(len(nums) - 1, 0 -1, -1):
        out[i] = out[i] * p
        p = p * nums[i]

    return out

print(productExceptSelf([1,2,3,4]))