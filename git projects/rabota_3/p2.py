#-*- coding: utf-8 -*-
print('Введите числа A и B')
a = int(input())
b = int(input())

def ber(a, b): 
	if a < b:
		for i in range(a, b + 1):
			print(a)
			a += 1
	else:
		for i in range(b, a + 1):
			print(a)
			a -= 1
ber(a, b)
