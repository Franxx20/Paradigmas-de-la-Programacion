module Main where

main = do
  putStrLn "Hello, World!"

hailstone :: Int -> Int
hailstone n =
  if even n
    then n `div` 2
    else 3 * n + 1

fibonacci :: Int -> Int
fibonacci 0 = 0
fibonacci 1 = 1
fibonacci n = fibonacci (n - 1) + fibonacci (n - 2)

lst = [2, 3, 5, 7, 11]

total = sum (map (3 *) lst)

sumar :: Int -> Int -> Int
sumar x y = x + y

sumatoria :: Int -> Int
sumatoria 0 = 0
sumatoria n = n + sumatoria (n - 1)

-- cuenta los elementos de la lista
misterio :: [Int] -> Int
misterio [] = 0
misterio (x : xs) = 1 + misterio xs

-- multiplica todo por 2
--misterioDos :: [Int] -> [Int]
--misterioDos [] = []
--misterioDos (x : xs) = x * x : (misterioDos xs)

pares :: Int -> Int
pares x =
  if even x
    then 1
    else 0

contarPares :: [Int] -> Int
contarPares [] = 0
zsh:1: command not found: :exit

notable :: Int -> Int
notable x =
  if even x
    then 1
    else 0

contarNotables :: (Int -> Int) -> [Int] -> Int
contarNotables f [] = 0
contarNotables f (x : xs) = f x + contarNotables f xs

numbers1 = [1, 2, 3, 4]

numbers2 = [10, 20, 30, 40]

zipped = zip numbers1 numbers2

numbers = [1, 2, 3, 4, 5]

sumResult = foldl (+) 0 numbers

-- fold (foldl / foldr)
-- combina los elementos de una lista en un solo valor

resultados = foldl (+) 0 numbers

evenNumbers = filter even numbers

quitaTres :: [a]->[a]
quitaTres (_:_:_:xs) = xs
quitaTres _ = []

-- function :: Int -> Int -> Int
function x y = x + y
-- fun :: Int -> Int
fun y = function 3 y
main = print (fun 2)
