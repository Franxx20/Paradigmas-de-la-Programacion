multiplicar(_, 0, 0).
multiplicar(X, 1, X).
multiplicar(X, Y, R):-
    Y > 1,
    Y1 is Y - 1,
    multiplicar(X, Y1, R1),
    R is R1 + X.
