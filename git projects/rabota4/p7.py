#-*- coding: utf-8 -*-
son = 'строка h с буквой h'
def venga(son):	
	h1 = son.find('h')
	h2 = son.rfind('h')

	print(son[:h1] + son[h2])
venga(son)
