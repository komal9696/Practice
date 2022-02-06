public class Buffer {
  private List notify = new ArrayList();

  public void addItem(V obj) {
    synchronized (notify) {
      while (notify.size() >= maxSize) {
        notify.wait();
      }
      notify.add(obj);
    }
  }

  public void clear() {
    synchronized (notify) {
      notify.clear();
      notify.notifyAll();
    }
  }
}

