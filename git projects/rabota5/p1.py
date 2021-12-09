#-*- coding: utf-8 -*-
n = int(input())
x = 1
for i in range(1, n + 1):
	if n > x:
		x = i ** 2
		i = i + 1
		print(x)
