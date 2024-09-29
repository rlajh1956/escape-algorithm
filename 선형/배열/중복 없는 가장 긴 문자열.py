# 중복 문자가 없는 가장 긴 부분 문자열

# 입력  "abcabcbb"
# 출력 3


def lengthOfLongestSubstring (s):
    used = {}
    max_length = start = 0
    for index, char in enumerate(s):
        if char in used and start <= used[char]:
            start = used[char] + 1
        else:
            max_length = max(max_length, index - start + 1)

        used[char] = index
    
    return max_length

     



print(lengthOfLongestSubstring('abcabcbb'))