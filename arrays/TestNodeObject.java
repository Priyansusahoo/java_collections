import java.util.Objects;

/**
 * @author Priyansu Sahoo
 * @created 11-05-2024 - 08:34 pm
 */
public class TestNodeObject {
    private String data;

    public TestNodeObject(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestNodeObject that = (TestNodeObject) o;
        return Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        return STR."TestNodeObject{data='\{data}\{'\''}\{'}'}";
    }
}
