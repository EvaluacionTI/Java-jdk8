package pe.ias.bbva.evalua.java8.postgres.entity;

public class CEPagination {
    private Long numberRows;
    private Long numberPage;
    private Long currentPage;
    private Long recordPage;
    private CEPaginationLink oCEPagiationLink;
    
    public Long getNumberRows() {
        return numberRows;
    }

    public Long getNumberPage() {
        return numberPage;
    }

    public Long getCurrentPage() {
        return currentPage;
    }

    public Long getRecordPage() {
        return recordPage;
    }

    public CEPaginationLink getoCEPagiationLink() {
        return oCEPagiationLink;
    }

    public void setNumberRows(Long numberRows) {
        this.numberRows = numberRows;
    }

    public void setNumberPage(Long numberPage) {
        this.numberPage = numberPage;
    }

    public void setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
    }

    public void setRecordPage(Long recordPage) {
        this.recordPage = recordPage;
    }

    public void setoCEPagiationLink(CEPaginationLink oCEPagiationLink) {
        this.oCEPagiationLink = oCEPagiationLink;
    }

    @Override
    public String toString() {
        return "CEPagination{" + "numberRows=" + numberRows + ", numberPage=" + numberPage + ", currentPage=" + currentPage + ", recordPage=" + recordPage + ", oCEPagiationLink=" + oCEPagiationLink + '}';
    }    
}
