#-*- coding: utf-8 -*-
print('Введите год')
year = int(input())

if (year % 4) == 0:
	if(year % 400) != 0:
		print('Этот год високосный')
else:
	if (year % 100) != 0:
		print('Этот год не високосный')