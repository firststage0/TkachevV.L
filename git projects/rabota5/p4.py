#-*- coding: utf-8 -*-
x = int(input())
y = int(input())
i = 1
while x < y:
	x = x * 1.1 #увеличение пробега на 10%
	i = i + 1 # дни
print(i)