#-*- coding: utf-8 -*-
son = 'строка h с буквой h'
def venga(son):	
	son = son[:son.find('h')] + son[son.rfind('h') + 1:]
	print(son)
venga(son)
