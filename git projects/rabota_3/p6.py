#-*- coding: utf-8 -*-
print("Введите число N")
n = int(input())
sum = 1

def ber(n, sum):
	if n > 0:
		for i in range(1, n + 1):
			sum = sum * i
		print(sum)	

ber(n, sum)