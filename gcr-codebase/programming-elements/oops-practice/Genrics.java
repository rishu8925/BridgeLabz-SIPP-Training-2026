

/**
 * Genrics
 */
class Box<T> {
    private T data;
    public Box(T data) {
        this.data = data;
    }

    public void setItem(T data) {
        this.data = data;
    }



    public T getItem() {
        return data;
    }
    public T setItem() {
        return data;
    }
    public T fetch() {
        return data;
    }
    public static void main(String[] args) {
        Box<String> a = new Box<>("hello");
        System.out.println(a.fetch());
        System.out.println(a.getItem());
        

        a.setItem("world");
        System.out.println(a.getItem());
    }

}

