#-*- coding: utf-8 -*-
print("Введите числа A и B, где А > В")
a = int(input())
b = int(input())
def ber(a, b):
	if a < b:
		print('Ошибка')
	else:
		for i in range(a, b + 1, -1):
			if i % 2 != 0:
				print(i)
ber(a, b)