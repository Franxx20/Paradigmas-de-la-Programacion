transporte(roma,20).
transporte(londres,30).
transporte(tunez,10).

alojamiento(roma,hotel,50).
alojamiento(roma,hostal,30).
alojamiento(roma,camping,10).
alojamiento(londres,hotel,60).
alojamiento(londres,hostal,40).
alojamiento(londres,camping,20).
alojamiento(tunez,hotel,40).
alojamiento(tunez,hostal,20).
alojamiento(tunez,camping,5).

/*Expresar la relación viaje(C,S,H,P) que se interpreta por: 
 * "el viaje a la ciudad C durante S semanas con estancia en H cuesta P pesos"*/

viaje(CIUDAD,SEMANAS,HOSPEDAJE,PESOS):-
  	SEMANAS >= 1,
    transporte(CIUDAD,COSTO_TRANSPORTE),
    alojamiento(CIUDAD,HOSPEDAJE,COSTO_ALOJAMIENTO),
    PESOS is COSTO_TRANSPORTE + (SEMANAS * COSTO_ALOJAMIENTO).
    
    

/*Completar con viajeeconomico(C,S,H,P,Pmax) que expresa que el costo P es menor que Pmax pesos.*/
viaje_economico(CIUDAD,SEMANAS,HOSPEDAJE,PESOS,PMAX):-
    viaje(CIUDAD,SEMANAS,HOSPEDAJE,PESOS),
	PESOS =< PMAX.