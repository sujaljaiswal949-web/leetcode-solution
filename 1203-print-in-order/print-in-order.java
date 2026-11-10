class Foo {
    private volatile boolean firstDone = false;
    private volatile boolean secondDone = false;

    public Foo() {
    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        firstDone = true;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (!firstDone) {
            
        }
        printSecond.run();
        secondDone = true;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (!secondDone) {
        
        }
        printThird.run();
    }
}