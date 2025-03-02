class Solution(object):
    def letterCombinations(self, digits):
        """cx
        :type digits: str
        :rtype: List[str]
        """
        if digits == "" : return []
        number_digit = {
            '1' : [],
            '2' : ['a', 'b', 'c'],
            '3' : ['d', 'e', 'f'],
            '4' : ['g', 'h', 'i'],
            '5' : ['j', 'k', 'l'],
            '6' : ['m', 'n', 'o'],
            '7' : ['p', 'q', 'r', 's'],
            '8' : ['t', 'u', 'v'],
            '9' : ['w', 'x', 'y', 'z']
        }
        answer = list()

        def append_string(index, current) :

            if(index == len(digits)) : 
                answer.append(current)
                return

            for i in number_digit[digits[index]] : 
                append_string(index + 1, current + i)

        append_string(0, "")

        return answer