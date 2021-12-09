#-*- coding: utf-8 -*-
s = 'Строка для задания'
def sr(s):
	f = s[len(s) // 2:] 
	sec = s[:len(s) // 2]
	print(f + sec)
sr(s)