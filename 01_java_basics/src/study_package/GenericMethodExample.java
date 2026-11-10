package study_package;

class GStack<T> {
    int tos;
    Object[] stck;

    public GStack() {
        tos = 0;
        stck = new Object[10];
    }

    public void push(T item) {
        if (tos == 10)
            return;

        stck[tos] = item;
        tos++;
    }

    public T pop() {
        if (tos == 0)
            return null;

        tos--;
        return (T) stck[tos];
    }
}

public class GenericMethodExample {

    // T가 타입 매개 변수인 제네릭 메소드
    public static <T> GStack<T> reverse(GStack<T> a) {
        GStack<T> s = new GStack<T>();

        while (true) {
            T tmp = a.pop(); // 원래 스택에서 요소 하나를 꺼냄

            if (tmp == null) // 스택이 비었음
                break;
            else
                s.push(tmp); // 새 스택에 요소 삽입
        }

        return s; // 새 스택 반환
    }

    public static void main(String[] args) {
        GStack<Double> gs = new GStack<Double>();

        for (int i = 0; i < 5; i++) {
            gs.push(Double.valueOf(i));
        }

        gs = reverse(gs);

        for (int i = 0; i < 5; i++) {
            System.out.println(gs.pop());
        }
    }
}