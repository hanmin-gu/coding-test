class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        INT_MIN = -2**31
        INT_MAX = 2**31 - 1

        if(x == 0) : return 0

        string_num = str(x)
        if(string_num[0] == "-") :
            string_num = string_num[1:len(string_num)]
            reversed_num = string_num[::-1]
            reversed_num = "-" + reversed_num
             if int(reversed_num) < INT_MIN or int(reversed_num) > INT_MAX:
                 return 0
            return int(reversed_num)
        
        string_num = string_num[::-1]

        if int(string_num) < INT_MIN or int(string_num) > INT_MAX:
            return 0
    
        for s in string_num :
            if(s == "0") : string_num = string_num[1:len(string_num)]

            else: break

        
        return int(string_num)


        