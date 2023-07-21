parcial1(ana,7).
parcial1(juan,4).
parcial1(julio, 2).
parcial1(maria, 10).
parcial1(jorge,9).
parcial1(cande,2).
parcial1(luis,10).
parcial1(martin,7).
parcial1(santi,10).

parcial2(ana,9).
parcial2(juan,8).
parcial2(julio, 4).
parcial2(maria, 2).
parcial2(jorge,10).
parcial2(cande,4).
parcial2(luis,9).
parcial2(martin,7).
parcial2(santi,10).

/*Se desea obtener: 1. a. El listado de los alumnos que promocionan la materia */
promociona(ESTUDIANTE,NOTA1,NOTA2):-
    parcial1(ESTUDIANTE,NOTA1),
    parcial2(ESTUDIANTE,NOTA2),
    NOTA1 >= 7,
    NOTA2 >=7.

lista_promocionados(ESTUDIANTE):-
    promociona(ESTUDIANTE,_,_),
    writeln(ESTUDIANTE),
    fail.


/*b.El mismo listado pero esta vez incluyendo la nota final (promedio de los dos parciales) para cada uno */
promedio(ESTUDIANTE,PROMEDIO):-
    parcial1(ESTUDIANTE,NOTA1),
    parcial2(ESTUDIANTE,NOTA2),
    PROMEDIO is (NOTA1+NOTA2) div 2.

lista_promedio_promocionados(ESTUDIANTE,PROMEDIO):-
    promociona(ESTUDIANTE,_,_),
    promedio(ESTUDIANTE,PROMEDIO).
   
promedio_promocionados(PROMEDIO):-
    promociona(ESTUDIANTE,_,_),
    promedio(ESTUDIANTE,PROMEDIO).

/*2. El listado de los alumnos que recursan la materia. */
recursa(ESTUDIANTE,NOTA1,NOTA2):-
    parcial1(ESTUDIANTE,NOTA1),
    parcial2(ESTUDIANTE,NOTA2),
    (NOTA1 < 4;
    NOTA2 < 4).

lista_recursados(ESTUDIANTE):-
    recursa(ESTUDIANTE,_,_),
    writeln(ESTUDIANTE),
    fail.

/*3. El listado de los alumnos que obtendrán la cursada. */
lista_alumnos(ESTUDIANTE):-
    writeln(ESTUDIANTE),
    fail.

cursada(ESTUDIANTE,NOTA1,NOTA2):-
    parcial1(ESTUDIANTE,NOTA1),
    parcial2(ESTUDIANTE,NOTA2),
    (\+ promociona(ESTUDIANTE,_,_),
    \+ recursa(ESTUDIANTE,_,_)).
	

lista_cursados(ESTUDIANTE):-
    cursada(ESTUDIANTE,_,_),
    writeln(ESTUDIANTE),
    fail.

/*4. A fin de entregar la medalla al mérito, encontrar de aquellos que promocionan (1b),
el o los alumnos con mayor nota final (nombre y nota) */
producto_cartesiano(NOTA,NOTA2):-
    lista_promedio_promocionados(_,NOTA),
    lista_promedio_promocionados(_,NOTA2).

notas_menos_mayor(NOTA):-
 	producto_cartesiano(NOTA,NOTA2),
    NOTA < NOTA2.


mayor_nota(NOTA):-
    promedio_promocionados(NOTA), \+ notas_menos_mayor(NOTA).

promocionado_mayor_nota(ESTUDIANTES,NOTA):-
    lista_promedio_promocionados(ESTUDIANTES,NOTA), \+ notas_menos_mayor(NOTA).


    


/*5. Ahora se desea obtener cuales fueron las dos notas más altas, 
considerando simplemente a la nota como el promedio de la nota de parcial1 y parcial2. 
Solo interesan los números. Un tip es pensar la resolución en dos etapas, la más alta,
y después la más alta de lo restante*/


promedios_menos_mayor(NOTA):-
    promedio_promocionados(NOTA), \+ mayor_nota(NOTA).

segundo_producto_cartesiano(NOTA,NOTA2):-
	promedios_menos_mayor(NOTA),
    promedios_menos_mayor(NOTA2).

segundo_notas_menos_mayor(NOTA):-
    segundo_producto_cartesiano(NOTA,NOTA2),
    NOTA < NOTA2.

segunda_mayor_nota(NOTA):-
   promedios_menos_mayor(NOTA), \+ segundo_notas_menos_mayor(NOTA).

mostrar_dos_mayores(NOTA1,NOTA2):-
	mayor_nota(NOTA1),
    segunda_mayor_nota(NOTA2).
 
/*6. El listado se compone de al menos una nota para cada alumno. 
 * En caso de que algún alumno adeude uno de los parciales
 *  (es decir no tenga un hecho relacionado a su parcial), su condición es ausente. 
 * No se toman en cuenta quienes no dieron ninguno de los parciales.*/
 
 
 ausentes(NOMBRE):-
    (parcial1(NOMBRE,_);parcial2(NOMBRE,_)),
    (\+parcial1(NOMBRE,_); \+parcial2(NOMBRE,_)).
      
