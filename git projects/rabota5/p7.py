#-*- coding: utf-8 -*-
n = int(input())
a = int(input())
b = 0
maxb = 0
while a != 0:
	if a > n:
		b += 1
	elif b > maxb:
		maxb = b
		b = 0
	n = a
	a = int(input())
print(b)