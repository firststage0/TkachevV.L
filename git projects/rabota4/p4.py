#-*- coding: utf-8 -*-
s = 'Какая-то строка'
def sr(s):
	f = s[:s.find(' ')]
	sc = s[s.find(' ') + 1:]
	print(sc + ' ' + f)
sr(s)