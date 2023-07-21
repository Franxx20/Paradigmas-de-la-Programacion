entrada(paella).
entrada(gazpacho).
entrada(consomé).

carne(filete_de_cerdo).
carne(pollo_asado).

pescado(trucha).
pescado(bacalao).

postre(flan).
postre(helado).
postre(pastel).

bebida(vino).
bebida(cerveza).
bebida(agua_mineral).


/*¿Cuáles son los menús que ofrece el restaurante? */ 

plato_principal(Y):-
    carne(Y); pescado(Y).

menu(X,Y,Z,W):-
    entrada(X),
    plato_principal(Y),
    postre(Z),
    bebida(W).


/*¿Cuáles son los menús que tienen Consomé en las entradas?*/
menu_consome(Y,Z,W):-
    entrada(consomé),
    plato_principal(Y),
    postre(Z),
    bebida(W).

menu_consome2(X,Y,Z,W):-
    X = consomé,
    plato_principal(Y),
    postre(Z),
    bebida(W).
/*¿Cuáles son los menús que no contienen flan como postre?*/
menu_sin_flan(X,Y,Z,W):-
	menu(X,Y,Z,W),
    Z \== flan.
