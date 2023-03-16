import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    //Triển khai LinkedList từ thư viện Java
    private LinkedList stack;

    //Khởi tạo Constructor
    public MyGenericStack() {
        stack = new LinkedList();
    }

    //Triển khai phương thức "push" thêm phần tử vào đầu chuỗi từ nguyên bản "addFirst" của Java
    public void push(T element) {
        stack.addFirst(element);
    }

    //Triển khai phương thức "pop" xoá phần từ đầu chuỗi từ nguyên bản "removeFirst" của Java
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) stack.removeFirst();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}
