# 정렬된 nums를 입력 받아 이진 겁색으로 target에 해당하는 인덱스를 찾기

# 입력  nums = [-1, 0, 3, 5, 9, 12], target = 9
# 출력 4


def search(nums, target):
    left, right = 0, len(nums) - 1
    while left <= right:
        mid = (left + right) // 2

        if nums[mid] < target:
            left = mid + 1
        elif nums[mid] > target:
            right = mid - 1
        else:
            return mid
        
    return -1

     



print(search([-1, 0, 3, 5, 9, 12], 9))