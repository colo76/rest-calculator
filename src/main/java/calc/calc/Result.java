package calc.calc;
/*
* Simple POJO to represent an operation and the result of applying it
 */
public class Result {

    private String operation;

    private String result;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public static Result addOp(Integer a, Integer b, int c,int res) {
        Result result = new Result();
        result.setOperation(String.valueOf(a) + "+" + String.valueOf(b) + "+" + String.valueOf(c));
        result.setResult(String.valueOf(res));
        return result;
    }

    public static Result diffOp(Integer a, Integer b, int c,int res) {
        Result result = new Result();
        result.setOperation(String.valueOf(a) + "-" + String.valueOf(b) + "-" + String.valueOf(c));
        result.setResult(String.valueOf(res));
        return result;
    }

    public static Result multOp(Integer a, Integer b, int c, int res) {
        Result result = new Result();
        result.setOperation(String.valueOf(a) + "*" + String.valueOf(b) + "*" + String.valueOf(c));
        result.setResult(String.valueOf(res));
        return result;
    }

    public static Result divOp(Integer a, Integer b, int c, int res) {
        Result result = new Result();
        result.setOperation(String.valueOf(a) + "/" + String.valueOf(b) + "/" + String.valueOf(c));
        result.setResult(String.valueOf(res));
        return result;
    }
}
