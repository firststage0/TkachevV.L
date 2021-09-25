#-*- coding: utf-8 -*-
print ('Введите a, b, l, N, > 0')
a = int(input())
b = int(input())
l = int(input())
N = int(input())

len = 1 * 2 + b * (N - 2) + a * (N - 1)
print('Длинна шнурка должна быть = ', len, ' см')