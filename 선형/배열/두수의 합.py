# 덧셈하여 타켓을 만들 수 있는 배열의 두 숫자 인덱스를 리턴

# 입력  [2, 7, 11, 15],  9
# 출력 [0, 1]


def twoSum ( nums: list[int], target: int) -> list[int]:
    for i in range(len(nums)):
        for j in range(i + 1, len(nums)):
            if nums[i] + nums[j] == target:
                return [i, j]

