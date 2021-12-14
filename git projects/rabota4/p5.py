#-*- coding: utf-8 -*-
son = 'Какая-то  строка f с буквой f'
def venga(son):
	
	if son.count('f') == 1:
		print(son.find('f'))
	elif son.count('f') >= 2:
		print(son.find('f'), son.rfind('f'))
venga(son)
