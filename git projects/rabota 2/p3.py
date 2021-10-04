#-*- coding: utf-8 -*-
print('Введите кол-во минут')

n = int(input())
h = n % (1440) // 60
m = n % 60
print( h, m)

