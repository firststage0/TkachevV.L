#-*- coding: utf-8 -*-
stroka = 'Какая-то строка'
def venga(stroka):
	index_probela = stroka.index(' ')
	stroka = stroka[index_probela + 1:] + ' '+ stroka[:index_probela]
	print(stroka)
venga(stroka)
