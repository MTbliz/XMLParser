import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ETMFSchemaNode {

    private Long id;

    private ETMFSchema etmfSchema;

    private String name;

    private Integer level;

    private String index;

    private ETMFSchemaNode parentNode;

    private Set<ETMFSchemaNode> children = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ETMFSchema getEtmfSchema() {
        return etmfSchema;
    }

    public void setEtmfSchema(ETMFSchema etmfSchema) {
        this.etmfSchema = etmfSchema;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public ETMFSchemaNode getParentNode() {
        return parentNode;
    }

    public void setParentNode(ETMFSchemaNode parentNode) {
        this.parentNode = parentNode;
    }

    public Set<ETMFSchemaNode> getChildren() {
        return children;
    }

    public void setChildren(Set<ETMFSchemaNode> children) {
        this.children = children;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ETMFSchemaNode that = (ETMFSchemaNode) o;
        return etmfSchema.equals(that.etmfSchema) &&
                name.equals(that.name) &&
                index.equals(that.index);
    }

    @Override
    public int hashCode() {
        return Objects.hash(etmfSchema, name, index);
    }
}
