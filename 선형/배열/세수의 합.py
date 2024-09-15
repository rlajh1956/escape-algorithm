# 합으로 0을 만들 수 있는 3개의 엘리먼트 출력

# 입력 [-1, 0, 1, 2, -1, -4]
# 출력 [[-1, 0 , 1], [-1, -1, 2]]

def threeSum(nums):
    results = []
    nums.sort()

    for i in range(len(nums) - 2):
        if i > 0 and nums[i] == nums[i - 1]:
            continue
        left, right = i + 1, len(nums) - 1
        while left < right:
            sum = nums[i] + nums[left] + nums[right]
            if sum < 0: 
                left += 1
            elif sum > 0:
                right -= 1
            else:
                results.append([nums[i], nums[left], nums[right]])

                while left < right and nums[left] == nums[left + 1]:
                    left += 1
                while left < right and nums[right] == nums[right - 1]:
                    right -= 1
                left += 1
                right -= 1

    return results


print(threeSum([-1, 0, 1, 2, -1, -4]))