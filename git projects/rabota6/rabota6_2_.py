#-- coding: utf-8 --
import tkinter as tk
from tkinter import *
from tkinter import ttk
from tkinter import scrolledtext

def ven1():
    n = int(name1.get())
    x = 0
    while x <= n:
            x = x ** 2
            res1.insert(INSERT, x)
            res1.insert(INSERT, " ",)   
            x = x + 1

def ven2():
    namen = int(name2.get())
    x = 2
    while namen % x != 0:
        x +=1
    res2.insert(INSERT, x,)
    res2.insert(INSERT, " ")
           

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
        x +=  x * 1.1
        i += 1
    res4.insert(INSERT, i)
    res4.insert(INSERT, " ")

def ven5():
    n = int(name5.get())
    i = int(restwo5.get())
    if n != 0:
        i += 1
        restwo5.delete(1.0, 'end')
        restwo5.insert(INSERT, i)    
    else:
        resone5.delete(1.0, 'end')
        resone5.insert(INSERT, i)


def ven6():
    sum = int(nameone6.get())
    dlinna = int(nametwo6.get())
    n = int(name6.get())
    if n != 0:
        sum = sum + n
        dlinna = dlinna + 1
        nameone6.delete(0,'end')
        nameone6.insert (INSERT, sum)
        nametwo6.delete(0,'end')
        nametwo6.insert(INSERT, dlinna)
    else:
        res6.delete(1.0, END)
        res6.insert (INSERT,sum/dlinna)
        nameone6.delete(0,'end')
        nameone6.insert(0,"0")
        nametwo6.delete(0,'end')
        nametwo6.insert(0,"0")
    name6.delete(0, tk.END) 

def ven7():
    a = int(name7.get())
    n = int(resone7.get())
    b = int(restwo7.get())
    maxb = int(res37.get())
    if a != 0:
        if a > n:
            b += 1
            restwo7.delete(0, tk.END)
            restwo7.insert(0, b)
        else:
            if b > maxb:
                res37.delete(0, tk.END)
                res37.insert(0, b)
            restwo7.delete(0, tk.END)
            restwo7.insert(0, '0')
        n = a
        resone7.delete(0, tk.END)
        resone7.insert(0, n)
    else:
        res7.delete(1.0, tk.END)
        res7.insert(INSERT, maxb - 1)
        resone7.delete(0, tk.END)
        resone7.insert(INSERT, '0')
        restwo7.delete(0, tk.END)
        restwo7.insert(0, '0')    
    name7.delete(0, tk.END)


def ven8():
    nn = int(name8.get())
    a = int(nameone8.get())
    amax = int(nametwo8.get())
    if nn != 0:
        if (nn == a):
            amax = amax + 1
            nametwo8.delete(0,"end")
            nametwo8.insert(0,amax)
            if amax > int(name38.get()):
                name38.delete(0,'end')
                name38.insert(0, amax + 1)
        else: 
            nameone8.delete(0,'end')
            nameone8.insert(0, nn)
            amax = 0
            nametwo8.delete(0, "end")
            nametwo8.insert(0, "0")
    else:
        adrmax=int(name38.get())
        res8.delete(1.0, tk.END)
        res8.insert(INSERT, adrmax)
        nameone8.delete(0,'end')
        nameone8.insert(0,"0")
        nametwo8.delete(0,'end')
        nametwo8.insert(0,"0")
        name38.delete (0,'end')
        name38.insert (0,'0')
    name8.delete(0, tk.END)       

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

tab6 = ttk.Frame(tab_control)
tab_control.add(tab6, text='ven6')


tab7 = ttk.Frame(tab_control)
tab_control.add(tab7, text='ven7')

tab8 = ttk.Frame(tab_control)
tab_control.add(tab8, text='ven8')


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





label = tk.Label(tab5, text="Программа не работает(все еще :/)").grid(row = 0, column = 0, stick = 'wesn')

#6
label = Label(tab6, text="Вводите число и нажимайте на кнопку ").grid(column=0, row=0)
name6 = Entry(tab6)
name6.grid(column=0, row=1)
btn6 = Button(tab6, text="Тык-тык", command = ven6).grid(row=1, column=3)
res6 = scrolledtext.ScrolledText(tab6, width=30, height=10)
res6.grid(row=3, column=0)
res6.insert(INSERT, 'Result: ')
nameone6 = Entry(tab6)
nameone6.grid(row = 3, column = 1)
nametwo6 = Entry(tab6)
nametwo6.grid(row = 4, column = 1)
nameone6.insert(INSERT,'0')
nametwo6.insert(INSERT,'0')

#7

lb7 = Label(tab7, text="Нужно ввести число, нажать на кнопку.(При вводе 0 программа завершается) ").grid(row = 0, column = 0)
name7 = Entry(tab7)
name7.grid(row=1, column=0)

btn7 = Button(tab7, text=" Тык-тык ", command = ven7).grid(row = 1, column = 2)

res7 = scrolledtext.ScrolledText(tab7, width=30, height=10)
res7.grid(row = 3, column = 0)
res7.insert(INSERT, 'Кол-во цифр, которые больше предыдущего ')

resone7 = Entry(tab7)
#resone7.grid(row = 3, column = 3)
resone7.insert(INSERT, '0')

restwo7 = Entry(tab7)
#restwo7.grid(row = 4, column = 3)
restwo7.insert (INSERT, '0')

res37 = Entry(tab7)
#res37.grid(row = 5, column = 3)
res37.insert(INSERT, '0')


#8
label = Label(tab8, text="Введите число").grid(row=0, column=0)
name8 = Entry(tab8)
name8.grid(row=1, column=0)
btn8 = Button(tab8, text="Тык-тык", command=ven8).grid(row=1, column=2)
res8 = scrolledtext.ScrolledText(tab8, width=30, height=10)
res8.grid(row=3, column=0)
res8.insert(INSERT, 'Result: ')

nameone8 = Entry(tab8)
#nameone8.grid(row=4, column=1)

nametwo8 = Entry(tab8)
#nametwo8.grid(row=5, column=1)

name38 = Entry(tab8)
#name38.grid(row=6, column=1)


nameone8.insert (INSERT,'0')
nametwo8.insert (INSERT,'0')
name38.insert (INSERT,'0')


win.mainloop()