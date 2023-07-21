%1. Codifique en prolog las reglas necesarias para obtener el término N en la serie de
%Gauss


serie_de_gauss(0,0).
serie_de_gauss(Numero,Resultado):-
	Numero >0,
    Numero1 is Numero -1,
    serie_de_gauss(Numero1,Resultado1),
    Resultado is Numero + Resultado1.

 
%2. Codifique en prolog las reglas necesarias para obtener el término N en la serie de
%Fibonacci

serie_de_fibonacci(0,0).
serie_de_fibonacci(1,1).
serie_de_fibonacci(N0,R):-
   N0 > 0,
   N1 is N0 -1,
   N2 is N0 -2,
   serie_de_fibonacci(N1,R1),serie_de_fibonacci(N2,R2),
   R is R1+R2.
    


%3. Codifique en prolog las reglas necesarias para obtener el factorial de un número
%natural N.

factorial(0,1).
factorial(1,1).

factorial(N,R):-
    N > 0,
    N1 is N - 1,
    factorial(N1,R1),
    R is N * R1.
    


%4. Codifique en prolog las reglas necesarias para obtener el producto de dos numeros X e
%Y, aplicando sumas sucesivas.

producto_sumas(_,0,0).
producto_sumas(A,B,R):-
    B > 0,
   	B1 is B-1,
    producto_sumas(A,B1, R1),
    R is A + R1.


%5. Codifique en prolog las reglas necesarias para obtener la potencia N de un numero X
%aplicando multiplicaciones sucesivas.

potencia(_,0,1).
potencia(A,1,A).
potencia(A,B,R):-
	B > 0,
    B1 is B-1,
    potencia(A,B1,R1),
    R is A * R1.

%6. Codifique en prolog las reglas necesarias para obtener la el cociente entre dos números


division(_,0,_):- !,fail.
division(0,_,0).

division(Dividendo,Divisor,Cociente):-
    (Dividendo < Divisor, Cociente is 0);
    (Dividendo >= Divisor,
    Div1 is Dividendo - Divisor,
    division(Div1,Divisor,R1),
    Cociente is R1+1).




%7. Idem 6, pero que permita obtener el cociente y el resto. Definir la relación
%mcd(X,Y,Z) que se verifique si Z es el máximo común divisor entre X e Y. Por
%ejemplo:

division_resto(_,0,_,_):- !,fail.
division_resto(0,_,0,0).

/*
division_resto2(Dividendo,Divisor,Cociente,Resto):-
	division(Dividendo,Divisor,Cociente),
    Resto is Dividendo - Divisor * Cociente.
*/
 division_resto2(Dividendo,Divisor,Cociente,Resto):-
    (Dividendo < Divisor, Cociente is 0,Resto is Dividendo);
    (Dividendo >= Divisor,
    Div1 is Dividendo - Divisor,
    division_resto2(Div1,Divisor,R1,Resto),
    Cociente is R1+1).


mcd(A,B,R):-
    (   B =:= 0, R is A);
	(   B =\= 0,
        division_resto2(A,B,_,Resto),
        B1 is Resto,
    mcd(B, B1,R)).
    

%mcd(10,15,X).
%> X = 5


%8. Define un predicado mcm(X,Y,M) que signifique "M es el mínimo común múltiplo de
%X e Y
mcm2(A,B,R):-
   	mcd(A,B,R1),
    R is (A * B) div R1.

mcm(A,B,R):-
    mcm_interno(A,A,B,B,R).

mcm_interno(A,A0,B,B0,R):-
     (
    	A =:= B,
     	R is A)
    ;
    (  
       A < B,
       A1 is A0 + A,
       mcm_interno(A1,A0,B,B0,R) 
    )
    ;
    (
    	A > B,
        A1 is B0 + B,
        mcm_interno(A,A0,A1,B0,R)
    ).
    
