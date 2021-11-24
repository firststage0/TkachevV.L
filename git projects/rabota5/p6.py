#-*- coding: utf-8 -*-
sum = 0
dlinna = 0
n = int(input())
while n != 0:
    sum += n
    dlinna += 1
    n = int(input())
print(sum / dlinna)