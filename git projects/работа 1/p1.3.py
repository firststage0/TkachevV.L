#-*- coding: utf-8 -*-
age = int(input())
name = input()
if  ( 0 <= age < 75) and name != 'Иван':
	if 0 <= age < 16:
		print ('Сначала нужно окончить школу')
		b = 16 - age
		print(str(b) + ' лет(года) осталось учиться')
	else: 
		print('Поздравляю с поступлением в ВГУИТ')
else:
	print('Мы вам перезвоним(нет)')		