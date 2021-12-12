#-- coding: utf-8 --
import tkinter as tk
from tkinter import *
from tkinter import ttk
from tkinter import scrolledtext

def ven1():
    n = int(name1.get())
    x = 0
    for i in range(1, n + 1):
        if n >= x:
            x = i ** 2
            res1.insert(INSERT, x)
            res1.insert(INSERT, " ",)   
            i = i + 1

def ven2():
    n = int(name2.get())
    i = 2
    while i <= n:
        i += 1
        if n % i == 0:
            res2.insert(INSERT, i)
            res2.insert(INSERT, " ",)
            break

def ven3():
    n = int(name3.get())
    dva = 2
    st = 1
    while dva <= n:
            dva *= 2
            st +=1
    res3.insert(INSERT, st - 1)
    res3.insert(INSERT, " ")
    res3.insert(INSERT, dva // 2)

def ven4():
    x = int(nameone4.get())
    y = int(nametwo4.get())
    i = 1
    while x <= y:
        if x == y:
            break
        x += x/10
        i += 1
    res4.insert(INSERT, i)

def ven7():
    n = int(resone7.get())
    a = int(nameone7.get())
    b = int(restwo7.get())
    if a != 0:
        if a > n:
            b += 1
            restwo7.delete(0, tk.END)
            restwo7.insert(INSERT, b)
        n = a
        resone7.delete(0, tk.END)
        resone7.insert(0, n)
    elif a < n:
        nameone7.delete(0, tk.END)
        res7.insert(INSERT, b)
        resone7.delete(0, tk.END)
        resone7.insert(0, tk.END)
        restwo7.delete(0, tk.END)
        restwo7.insert(0, tk.END)
   

win = tk.Tk() # Главное окно
win.config(bg="#CBB8D7")
win.title("Почему оно работает? \(-_-)/)") # Название программы
win.geometry("900x600+500+200") # Размер и положение окна
win.resizable(False, False) #Запрет на изменение размеров окна

tab_control = ttk.Notebook(win) # Вкладки

tab1 = ttk.Frame(tab_control)
tab_control.add(tab1, text='ven1')

tab2 = ttk.Frame(tab_control)
tab_control.add(tab2, text='ven2')

tab3 = ttk.Frame(tab_control)
tab_control.add(tab3, text='ven3')

tab4 = ttk.Frame(tab_control)
tab_control.add(tab4, text='ven4')

tab5 = ttk.Frame(tab_control)
tab_control.add(tab5, text='ven5')


tab7 = ttk.Frame(tab_control)
tab_control.add(tab7, text='ven7')


tab_control.pack(expand=1, fill='both')




#ПРОГРАММЫ

label = tk.Label(tab1, text="Введите число n").grid(row=0, column=0, stick = 'w')

name1 = tk.Entry(tab1) #Окно ввода
name1.grid(row=1, column=0, stick = 'we')# Расположение окна ввода

btn1 = tk.Button(tab1, text="calc", command = ven1).grid(row=1, column=4) # Кнопка для выполнения команды

res1 = scrolledtext.ScrolledText(tab1, width=30, height=10) #Окно вывода
res1.grid(row=3, column=0)
res1.insert(INSERT, 'Result = ')







label = tk.Label(tab2, text="Введите число n, которое больше 2").grid(row=0, column=0, stick = 'w')

name2 = tk.Entry(tab2) #Окно ввода
name2.grid(row=1, column=0, stick = 'we')# Расположение окна ввода

btn2 = tk.Button(tab2, text="calc", command = ven2).grid(row=1, column=4) # Кнопка для выполнения команды

res2 = scrolledtext.ScrolledText(tab2, width=30, height=10) #Окно вывода
res2.grid(row=3, column=0)
res2.insert(INSERT, 'Result = ')





label = tk.Label(tab3, text="Введите число n").grid(row=0, column=0, stick = 'w')

name3 = tk.Entry(tab3) #Окно ввода
name3.grid(row=1, column=0, stick = 'we')# Расположение окна ввода

btn3 = tk.Button(tab3, text="calc", command = ven3).grid(row=1, column=4) # Кнопка для выполнения команды

res3 = scrolledtext.ScrolledText(tab3, width=30, height=10) #Окно вывода
res3.grid(row=3, column=0)
res3.insert(INSERT, 'Result = ')





label = tk.Label(tab4, text="Введите число x").grid(row=0, column=0, stick = 'w')

nameone4 = tk.Entry(tab4) #Окно ввода
nameone4.grid(row=1, column=0, stick = 'we')# Расположение окна ввода

label = tk.Label(tab4, text="Введите число y").grid(row=3, column=0, stick = 'w')

nametwo4 = tk.Entry(tab4) #Окно ввода
nametwo4.grid(row=4, column=0, stick = 'we')# Расположение окна ввода

btn4 = tk.Button(tab4, text="calc", command = ven4).grid(row=1, column=4) # Кнопка для выполнения команды

res4 = scrolledtext.ScrolledText(tab4, width=30, height=10) #Окно вывода
res4.grid(row = 5, column = 0)
res4.insert(INSERT, 'Result = ')





label = tk.Label(tab5, text="Программа не работает(я не понял как это написать :/ )").grid(row = 0, column = 0, stick = 'w')




label = tk.Label(tab7, text="Нужно ввести число, нажать на кнопку.(При вводе 0 программа завершается)")
label.grid(row = 0, column = 0)

nameone7 = tk.Entry(tab7)
nameone7.grid(row = 1, column = 0)

btn7 = tk.Button(tab7, text = "Тык-тык", command = ven7).grid(row = 1, column = 1)

res7 = scrolledtext.ScrolledText(tab7, width = 30, height = 10)
res7.grid(row = 3, column = 0)
res7.insert(INSERT, 'Цепочка чисел ')

resone7 = tk.Entry(tab7)
resone7.grid(row = 3, column = 1)
resone7.insert(INSERT,' 0 ')

restwo7 = tk.Entry(tab7)
restwo7.grid(row = 4, column = 1)
restwo7.insert(INSERT,' 0 ')


win.mainloop()