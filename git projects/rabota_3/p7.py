#-*- coding: utf-8 -*-
print("Введите число N")
n = int(input())
ft = 1
sum = 0

def ber(n, sum, ft):
	if n > 0:
		for i in range(1, n + 1):
			ft *=  i
			sum += ft
		print(sum)	

ber(n, sum,ft)