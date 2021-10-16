# -*- coding: utf-8 -*-
print("Введите число n")
n = int(input())
f1 = f2 = 1
def ber(f1, f2, n):
	for i in range(2, n):
		f1, f2 = f2, f1 + f2 # переменной f1 присваивается значение f2, 
		                     # а переменной f2 присваивается значение f1 + f2 ''' 
		
		print(f2, end = ' ')
ber(f1, f2, n)

