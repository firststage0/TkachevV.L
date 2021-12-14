#-*- coding: utf-8 -*-
start = int(input('Введите любую цифру для начала: '))
a = 1
maxa = 0
while start != 0:
    vvod = int(input())
    if vvod != 0 and start == vvod:
        a += 1
    elif a > maxa:
    	maxa = a
    	a = 1
    start = vvod 	
    
print(maxa)
