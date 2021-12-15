#-*- coding: utf-8 -*-
son = 'Строка для задания'
def venga(son):
	per = son[len(son) // 2:] 
	twos = son[:len(son) // 2]
	print(per + " " + twos)
venga(son)
