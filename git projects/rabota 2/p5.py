#-*- coding: utf-8 -*-
def sum(a,b,c):
	if c < a > b: 
		print(a)	    
	if c < b > a:
		print(b)
	else:
		if a < c > b:
	 		print(c)


print('Введите первое число')
a = int(input())
print('Введите второе число')
b = int(input())
print('Ведите третье число')
c = int(input())

sum(a, b, c)
