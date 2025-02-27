class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        words = {
            "M" : 1000
            ,"CM" : 900
            ,"D" : 500
            ,"CD" : 400
            ,"C" : 100
            ,"XC" : 90
            ,"L" : 50
            ,"XL" : 40
            ,"X" : 10
            ,"IX" : 9
            ,"V" : 5
            ,"IV" : 4
            ,"I" : 1 
        }
        answer = 0
        i=0
        while(len(s) > 0):
            if(s[0:2] in words) :
                print(1)   
                answer += words.get(s[0:2], 0)                 
                s = s[2:len(s)]
               ## print(answer)
                continue

            answer += words.get(s[0:1], 0)
            print(answer)
            s = s[1:len(s)]

        return answer
        
        


