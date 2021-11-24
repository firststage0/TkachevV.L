#-*- coding: utf-8 -*-
n = int(input('Введите любую цифру для начала: '))
a = 1
while n != 0:
    i = int(input())
    if i != 0 and n == i:
        a += 1
    n = i
print(a)
