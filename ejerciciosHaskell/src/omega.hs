--1. Escribir una función que sume dos números enteros.
suma :: Int -> Int -> Int
suma a b = 
    a + b
--2. Implementar una función que calcule el área de un círculo dado su radio.
area :: Float -> Float
area radio = 
    pi * radio * radio
--3. Definir una función que determine si un número es par o impar.
parOimpar :: Int -> String
parOimpar num = 
    if even num 
        then 
            "par"
        else 
            "impar"
--4. Escribir una función que calcule el factorial de un número.
factorial :: Int -> Int
factorial 0 = 1
factorial 1 = 1 
factorial num =
    num * factorial (num-1)
--5. Implementar una función que invierta una lista.
-- O(n²)
invertirLista :: [a] -> [a]
invertirLista [] = []
invertirLista (x:xs) = invertirLista xs ++ [x]


-- O(n)
rev :: [a] -> [a]
rev xs = go xs []
   where
   go :: [a] -> [a] -> [a]
   go []     ys = ys
   go (x:xs) ys = go xs (x:ys)

--6. Definir una función que determine si una lista está ordenada de forma ascendente.

estaOrdenada :: [Int] -> Bool
estaOrdenada [] = True
estaOrdenada [x] = True
estaOrdenada (x:y:xs) =
    x <= y && estaOrdenada (y:xs)


--7. Escribir una función que cuente la cantidad de elementos en una lista.
contarElementos :: [a] -> Int
contarElementos [] = 0
contarElementos (x:xs) = 
    1 + contarElementos xs


--8. Implementar una función que obtenga los elementos en posiciones pares de una lista.
pares :: [a] -> [a]
pares [] = []
pares [x] =[x]
pares (x:y:xs) = x : pares xs


--9. Definir una función que calcule el máximo común divisor de dos números.
mcd :: Int -> Int -> Int
mcd 0 0 = 0
mcd 1 1 = 1
mcd a b = if b == 0 
    then 
        a
    else 
        mcd b (mod a b)

--10. Implementar una función que calcule la suma de los dígitos de un número entero.
sumaDigitos :: Int -> Int

sumaDigitos 0 = 0
sumaDigitos num = 
    (num `mod` 10) +  sumaDigitos (num `div` 10)

--11. Definir una función que encuentre el elemento mínimo en una lista.
menor :: Int -> Int -> Int
menor a b = if a <= b 
    then a
    else b 

minimo :: [Int] -> Int
mimimo [] = error "no hay elementos"
minimo [x] = x
minimo (a:b:xs) = if a > b
    then minimo (b:xs)
    else minimo (a:xs)

minimo2 :: [Int] -> Int
mimimo2 [] = error "no hay elementos"
minimo2 [x] = x
minimo2 (x:xs) = menor x (minimo2 xs)


--12. Escribir una función que obtenga el enésimo número de la secuencia de Fibonacci.
fibonacci :: Int -> Int
fibonacci 0 = 0
fibonacci 1 = 1
fibonacci num = 
        fibonacci (num-1) + fibonacci (num-2)
--13. Implementar una función que verifique si una cadena de texto es un palíndromo.
esPalindromo2 :: String -> Bool
esPalindromo2 s = s == invertirLista s

palindromo :: String -> Bool
palindromo [] = True
palindromo [x] = True
palindromo xs = 
    head xs == last xs && palindromo (init (tail xs))
--14. Definir una función que elimine los duplicados de una lista.
eliminarDuplicados :: [Int] -> [Int]
eliminarDuplicados [] = []
eliminarDuplicados [x] = [x]
eliminarDuplicados (x:xs) = if x `elem` xs
    then eliminarDuplicados xs
    else x : eliminarDuplicados xs
        



--15. Implementar una función que obtenga el producto de todos los elementos de una lista
productoLista :: [Int]->Int
productoLista [x] = x
productoLista (x:xs) =
    x * productoLista xs
