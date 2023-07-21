module Main where

main = do
  putStrLn "Hello, World!"
  
division :: Int -> Int -> Int
division _ 0 = error "No se puede dividir por cero"
division 0 _ = 0
division dividendo divisor =
    if dividendo < divisor
        then 0
        else 1 + division (dividendo - divisor) divisor
-- 2. Escribir una función para hallar la potencia de un número
potencia :: Int -> Int -> Int
potencia 0 0  = error "indefinido"
potencia _ 0 = 1
potencia base 1 =  base
potencia base exponente =
    potencia base (exponente -1)

-- 3. Definir una función menor que devuelve el menor de sus dos argumentos enteros
menor :: Int -> Int -> Int
menor a b = if a <= b 
    then a
    else b 
-- 4. Definir una función maximoDeTres que devuelve el máximo de sus argumentos enteros
maximoDeDos :: Int -> Int -> Int
maximoDeDos a b = if a >= b
    then a 
    else b 
maximoDeTres :: Int -> Int -> Int -> Int
maximoDeTres  a b c = 
    if maximoDeDos a b > c
    then maximoDeDos a b
    else c
-- 5. Implemente una función recursiva para calcular el factorial de un número
factorial :: Int -> Int
factorial 0 = 1  
factorial 1 = 1
factorial num = 
    num * factorial (num -1)

