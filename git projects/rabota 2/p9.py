#-*- coding: utf-8 -*-

def chocolate(n, m, k):
	if (n * m > k) and (k % n == 0 or k % m == 0):
		print('Да')
	else:
		print('Нет')
		
print('Введите  число n')
n = int(input())
print('Введите число m')
m = int(input())
print('Введите число k')
k = int(input())

chocolate(n,m,k)
