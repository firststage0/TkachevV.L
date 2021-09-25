#-*- coding: utf-8 -*-
print('Введите вол-во минут')
n = int(input())
hours = 0

if n > 59:
	hours = hours + n // 60
	n = n % 60
if hours >= 24: 
	hours = 0
print(hours, ' часов ', n ,' минут')
