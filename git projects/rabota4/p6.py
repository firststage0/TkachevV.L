#-*- coding: utf-8 -*-
s = 'Опять строка с буквой f'
def sr(s):
	
	if s.count('f') == 1:
		print('-1')
	elif s.count('f') >= 2:
		print('-2')
sr(s)