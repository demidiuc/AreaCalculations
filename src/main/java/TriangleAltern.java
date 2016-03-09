public class TriangleAltern {
    private double side;
    private double height;
    
    //сеттер для стороны
    public void setSide(double x) {
      this.side = x; //мы обращаемся к внутренней переменной этого класса и устанавливаем её в принятое извне значение
    }
    
    //сеттер для высоты
    public void setHeight(double y) {
      this.height = y; //мы обращаемся к внутренней переменной этого класса и устанавливаем её в принятое извне значение
    }

    //так же мы может создать "геттеры" - методы с помощью которых мы сможем снаружи считать значения переменных этого класса
    //мы им ничего не передаем, просто вызываем, как бы говоря "дай сторону" или "дай высоту"
    public double getSide() {
      return side;
    }
    
    public double getHeight() {
      return height;
    }
    
    public double triangleArea() {
        return (side*height)/2;
    }
}
