package statistics;

public abstract class AbstractDataSet implements DataSet {
    /**
     * Mô tả tập dữ liệu.
     * @return mô tả tập dữ liệu dạng [a1, a2, a3, ..., an].
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size(); i++){
            result.append(element(i));
            if (i < size() -1){
                result.append(", ");
            }
        }
        return result.toString();
    }
}
