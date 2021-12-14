#-*- coding: utf-8 -*-
son = 'Опять строка с буквой f'
def venga(son):
	
	if son.count('f') == 1:
		print('-1')
	elif son.count('f') >= 2:
		print('-2')
venga(son)
