#-*- coding: utf-8 -*-

def chisla(a,b,c):
	if a == b == c:
		print(3)
	else:
		if (a == b != c) or (a != b == c) or  (a == c != b):
			print(2)
		else:
			if a != b != c:
				print(0)			
	
print('Введите первое число')
a = int(input())
print('Введите второе число')
b = int(input())
print('Ведите третье число')
c = int(input())

chisla(a,b,c)