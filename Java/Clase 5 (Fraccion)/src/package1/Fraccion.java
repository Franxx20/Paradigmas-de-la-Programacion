package package1;

public class Fraccion implements Comparable<Fraccion> { //
  // (si no pongo nada antes de la varaible, es package que acceden desde el
  // paquete)
  private final int num; // fuerza a no modificar la variable una vez creada
  private int den;
  public static int x;
  public static final double PI = 3.14159; // constante

  @Override
  public String toString() {
    return this.num + "/" + this.den;
  }

  public String toLatex() {
    return "\\frac {" + this.num + "}{" + this.den + "}";
  }

  /*
   * coparo 1 elemento comparadpo con otoro elemento, que cuando los compare
   * si los codigos son iguales, son el mismo objeto
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    try {
      Fraccion self = this.simplificar();
      result = prime * result + self.den;
      result = prime * result + self.num;
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Fraccion other = (Fraccion) obj;
    Fraccion self = null;
    try {
      self = this.simplificar();
      other = other.simplificar();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    if (self.den != other.den)
      return false;
    if (self.num != other.num)
      return false;
    return true;
  }

  public static int mcd(int a, int b) {
    x = 100;
    int temporal;// Para no perder b
    while (b != 0) {
      temporal = b;
      b = a % b;
      a = temporal;
    }
    return a;
  }

  public int getNum() {
    return num;
  }

  // public void setNum(int num) {
  // this.num = num;
  // }

  public int getDen() {
    return den;
  }

  // public void setDen(int den) {
  // this.den = den;
  // }

  public Fraccion(int a, int b) throws Exception {
    if (b == 0)
      throw new Exception("denominador menor a 0");
    num = a;
    den = b;
  }

  // public Fraccion() {
  // // TODO Auto-generated constructor stub
  // num = 1;
  // den = 1;
  // }

  public Fraccion simplificar() throws Exception {

    int mcd = mcd(num, den);
    return new Fraccion(num / mcd, den / mcd);
  }

  public Fraccion multiplicar(Fraccion otro) throws Exception {

    return new Fraccion(num * otro.num, den * otro.den).simplificar();
  }

  public Fraccion multiplicar(int otro) throws Exception {

    return new Fraccion(num * otro, den).simplificar();

  }

  public Fraccion sumar(Fraccion otro) throws Exception {
    return new Fraccion(num * otro.den + otro.num * den, den * otro.den);
  }

  public Fraccion dividir(Fraccion otro) throws Exception {
    return new Fraccion(num * otro.den, den * otro.num);
  }

  public Fraccion restar(Fraccion otro) throws Exception {
    return new Fraccion(num * otro.den - otro.num * den, den * otro.den);
  }


  @Override
  public int compareTo(Fraccion o) {
    double thisDecimal = ((double) this.num) / ((double) this.den);
    double otraDecimal = ((double) o.num) / ((double) o.den);
    return Double.compare(thisDecimal, otraDecimal);
    // return (this.num*o.den-o.num*this.den);

  }
}
