entrada(paella).
entrada(gazpacho).
entrada(consome).

carne(filete_de_cerdo).
carne(pollo_asado).

pescado(trucha).
pescado(bacalao).

postre(flan).
postre(helado).
postre(pastel).


/*¿Cuáles son los menús que ofrece el restaurante? */ 

plato_principal(Y):-
    carne(Y); pescado(Y).

menu(X,Y,Z):-
    entrada(X),
    plato_principal(Y),
    postre(Z).


/*¿Cuáles son los menús que tienen Consomé en las entradas?*/
menu_consome(Y,Z):-
    entrada(consomé),
    plato_principal(Y),
    postre(Z).

menu_consome2(X,Y,Z):-
    X = consomé,
    plato_principal(Y),
    postre(Z).
/*¿Cuáles son los menús que no contienen flan como postre?*/
menu_sin_flan(X,Y,Z):-
	menu(X,Y,Z),
    Z \== flan.

   	
% corta en el primer verdadero
corte1(E,PP,P):-
	menu(E,PP,P),
	!.


% corta en el primer caso con pescado
corte2(E,PP,P):-
	menu(E,PP,P), pescado(PP), !.


% da falso antes de pescado(PP) y por el and queda falso?
corte3(E,PP,P):-
	menu(E,PP,P), !, pescado(PP).