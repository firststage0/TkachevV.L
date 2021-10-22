#-*- coding: utf-8 -*-
s = 'Строка для задания'
def sr(s):
	a = (s[len(s) // 2:] + s[:len(s) // 2])
	print(a)
sr(s)