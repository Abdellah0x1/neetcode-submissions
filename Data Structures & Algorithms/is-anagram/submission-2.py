class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        if(len(s) != len(t)): return False

        s_dict = {}
        t_dict = {}

        for c in s:
            if c in s_dict.keys():
                s_dict[c] +=1

            else:
                s_dict[c] = 1

        for c in t:
            if c in t_dict.keys():
                t_dict[c] +=1

            else:
                t_dict[c] = 1

        for key,value in s_dict.items():
            if key not in t_dict.keys() or t_dict[key] != value:
                return False
        
        return True
        
        