#-*- coding: utf-8 -*-
n = int(input())
dva = 2
st = 0
while dva <= n:
	dva *= 2
	st += 1
print(st, dva // 2)
