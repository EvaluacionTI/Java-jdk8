package pe.ias.bbva.evalua.java8.postgres.entity;

public class CEPaginationLink {
    private Long first;
    private Long next;
    private Long previous;
    private Long last;
    
    public Long getFirst() {
        return first;
    }

    public Long getNext() {
        return next;
    }

    public Long getPrevious() {
        return previous;
    }

    public Long getLast() {
        return last;
    }

    public void setFirst(Long first) {
        this.first = first;
    }

    public void setNext(Long next) {
        this.next = next;
    }

    public void setPrevious(Long previous) {
        this.previous = previous;
    }

    public void setLast(Long last) {
        this.last = last;
    }

    @Override
    public String toString() {
        return "CEPaginationLink{" + "first=" + first + ", next=" + next + ", previous=" + previous + ", last=" + last + '}';
    }

}
