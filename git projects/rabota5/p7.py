#-*- coding: utf-8 -*-
n = int(input())
a = int(input())
b = 0
while a != 0:
	if a > n:
		b += 1
	n = a
	a = int(input())
print(b)