package ch11;
class FruitBox2<T> {
    Object item;
    public void store(Object item) {
        this.item = item;
    }
    public Object pullOut() {
        return item;
    }
}

public class FruitBox2Ex {
    public static void main(String[] args) {
        FruitBox2 fb = new FruitBox2();
        fb.store(new Orange(10));
        Orange orange = (Orange) fb.pullOut();
        orange.showSugar();
        // 컴파일 할때는 문제가 발생하지 안지만 실행 할때 에러
        fb.store(new Apple(8));
        // 원래 사과를 넣었는데 Orange로 형변환 해서 에러 발생
        Orange og2 = (Orange) fb.pullOut();
        og2.showSugar();
    }
}