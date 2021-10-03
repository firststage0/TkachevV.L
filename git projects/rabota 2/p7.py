#-*- coding: utf-8 -*-

def years(year):
	if (year % 4) == 0:
		if(year % 400) != 0:
			print('Этот год високосный')
	else:
		if (year % 100) != 0:
			print('Этот год не високосный')

print('Введите год')
year = int(input())

years(year)