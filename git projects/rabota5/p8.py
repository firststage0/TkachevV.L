#-*- coding: utf-8 -*-
start = int(input('Введите цифру '))
a = 0
maxa = 0
while start != 0:
    nn = int(input('Введите цифру '))
    if start == nn:
        maxa += a
        maxa += 1
        start = nn
    else:
        start = nn
    a = 0
print(maxa + 1)
