--1. Dado dos números enteros A y B, implemente una función que retorne la división
--entera de ambos por el método de las restas sucesivas


division :: Int -> Int -> Int
division _ 0 = error "No se puede dividir por cero"
division 0 _ = 0
division dividendo divisor = if dividendo < divisor  
    then  0
    else  1 +division (dividendo - divisor) divisor

--2. Escribir una función para hallar la potencia de un número

--potencia :: Int -> Int -> Int 
--potencia _ 0 1

--3. Definir una función menor que devuelve el menor de sus dos argumentos enteros
--4. Definir una función maximoDeTres que devuelve el máximo de sus argumentos enteros
--5. Implemente una función recursiva para calcular el factorial de un número