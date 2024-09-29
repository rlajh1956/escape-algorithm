# 모든 부분 집합 

# 입력  nums = [1,2,3]
# 출력 [[], [1], [1, 2], [1, 2, 3], [1, 3], [2], [2, 3], [3]]


def subsets(nums):
    result = []

    def dfs(index, path):
        result.append(path)
        for i in range(index, len(nums)):
            dfs(i + 1, path + [nums[i]])
    
    dfs(0, [])
    return result

     



print(subsets([1,2,3]))