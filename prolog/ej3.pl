hombre(pedro).
hombre(manuel).
hombre(arturo).

hombre(jose).
hombre(pepe).

mujer(marta).
mujer(maría).
mujer(martina).

mujer(estela).
mujer(celina).

progenitor(pedro, manuel).
progenitor(pedro, arturo).
progenitor(pedro, maría).



progenitor(marta,maría).
progenitor(estela,pepe).
progenitor(jose,pepe).
progenitor(estela,celina).

/*hijo(X,Y) % expresa que X es un hijo varón de Y.*/
hijo(HIJO,PROGENITOR):-
    progenitor(PROGENITOR,HIJO),
    hombre(HIJO).
    
/*hijo(X,Y) % expresa que X es un hija de Y.*/
hija(HIJA,PROGENITOR):-
    progenitor(PROGENITOR,HIJA),
    mujer(HIJA).

/*niño(X,Y) % expresa que X es hijo o hija de Y.*/
niño(NIÑO,PROGENITOR):-
    progenitor(PROGENITOR,NIÑO).

/*hermano(X,Y) % expresa que X es un hermano de Y.*/
hermano(HERMANO,SU_HERMANO):-
	hombre(HERMANO),
    progenitor(PADRE,HERMANO),
    progenitor(PADRE,SU_HERMANO),
    HERMANO \== SU_HERMANO.
    
/*hermana(X,Y) % expresa que X es una hermana de Y.*/
hermana(HERMANA,SU_HERMANO):-
    mujer(HERMANA),
    progenitor(PADRE,HERMANA),
    progenitor(PADRE,SU_HERMANO),
    HERMANA \== SU_HERMANO.


/*hermano-o-hermana(X,Y) % expresa que X es hermano o hermana de Y.*/
hermano_o_hermana(HERMANO,SU_HERMANO):-
    progenitor(PADRE,HERMANO),
    progenitor(PADRE,SU_HERMANO),
    HERMANO \== SU_HERMANO.

