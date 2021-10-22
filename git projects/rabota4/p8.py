#-*- coding: utf-8 -*-
s = 'строка h с буквой h'	
ab = s[:s.find('h')]
b = s[s.find('h'): s.rfind('h')]
c = s[s.rfind('h') + 1:]
print(ab + b[::-1] + c)
