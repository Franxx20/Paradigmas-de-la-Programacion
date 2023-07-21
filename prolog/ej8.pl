entrada(paella,10).
entrada(gazpacho,20).
entrada(consomé,5).

carne(filete_de_cerdo,7).
carne(pollo_asado,6).

pescado(trucha,4).
pescado(bacalao,5).

postre(flan,15).
postre(helado,20).
postre(pastel,25).

bebida(vino,13).
bebida(cerveza,16).
bebida(agua_mineral,0).


/*¿Cuáles son los menús que ofrece el restaurante? */ 

plato_principal(Y,_):-
    carne(Y,_); pescado(Y,_).

menu(X,Y,Z,W):-
    entrada(X,_),
    plato_principal(Y,_),
    postre(Z,_),
    bebida(W,_).


/*¿Cuáles son los menús que tienen Consomé en las entradas?*/
menu_consome(Y,Z,W):-
    entrada(consomé,_),
    plato_principal(Y,_),
    postre(Z,_),
    bebida(W,_).

menu_consome2(X,Y,Z,W):-
    X = consomé,
    plato_principal(Y,_),
    postre(Z,_),
    bebida(W,_).
/*¿Cuáles son los menús que no contienen flan como postre?*/
menu_sin_flan(X,Y,Z,W):-
	menu(X,Y,Z,W),
    Z \== flan.

/* Ejercicio 08
Modificar el programa del Ejercicio 01 (menú) para poder consultar cual es el menú completo
que tiene menor cantidad de calorías.*/

plato_principal_con_valor(Pp,Cpp):-
    carne(Pp,Cpp);
    pescado(Pp,Cpp).

menu_con_calorias(Entrada,Pp,Postre,Bebida,Calorias):-
    entrada(Entrada,Ce),
    plato_principal_con_valor(Pp,Cpp),
	postre(Postre,Cpos),
    bebida(Bebida,Cbeb),
    Calorias is (Ce+ Cpp + Cpos+ Cbeb).

producto_cartesiano(C1,C2):-
    menu_con_calorias(_,_,_,_,C1),
    menu_con_calorias(_,_,_,_,C2).

calorias_menos_mayor(C):-
    producto_cartesiano(C,C2),
    C > C2.

menu_con_menos_calorias(Entrada,Pp,Postre,Bebida,Calorias):-
    menu_con_calorias(Entrada,Pp,Postre,Bebida,Calorias), \+ calorias_menos_mayor(Calorias).

