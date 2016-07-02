package cr.cdrb.web.edu.domains.easyui;

public class DataModel {
    private int total;
    private Object rows;
    private String info;
    private Boolean result;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Object getRows() {
        return rows;
    }

    public void setRows(Object rows) {
        this.rows = rows;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public DataModel withErr(String info) {
        this.result = false;
        this.info = info;
        return this;
    }

    public DataModel withErr(String info, Object rows) {
        this.result = false;
        this.info = info;
        this.rows = rows;
        return this;
    }
    
    public DataModel withData(Object rows) {
        return withData(rows, 0);
    }
    
    public DataModel withData(Object rows, int total) {
        this.result = true;
        this.rows = rows;
        this.total = total;
        return this;
    }
}
