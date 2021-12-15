#-*- coding: utf-8 -*-
n = int(input())
#a = int(input())
b = 0
maxb = 0
while n != 0:
	a = int(input())
	if a > n:
		b += 1
	else: 
		if b > maxb:
			maxb = b
		b = 0
	n = a
print(maxb)
