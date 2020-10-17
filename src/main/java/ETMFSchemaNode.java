import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@XmlRootElement(name = "node")
@XmlType(propOrder = {"name", "index", "children"})
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

    @XmlTransient
    public void setId(Long id) {
        this.id = id;
    }

    public ETMFSchema getEtmfSchema() {
        return etmfSchema;
    }

    @XmlTransient
    public void setEtmfSchema(ETMFSchema etmfSchema) {
        this.etmfSchema = etmfSchema;
    }

    public String getName() {
        return name;
    }

    @XmlElement(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    @XmlTransient
    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getIndex() {
        return index;
    }

    @XmlElement(name = "index")
    public void setIndex(String index) {
        this.index = index;
    }

    public ETMFSchemaNode getParentNode() {
        return parentNode;
    }

    @XmlTransient
    public void setParentNode(ETMFSchemaNode parentNode) {
        this.parentNode = parentNode;
    }

    public void beforeUnmarshal(Unmarshaller u, Object parent) {
        if (parent instanceof ETMFSchema)
            this.etmfSchema = (ETMFSchema) parent;
        if (parent instanceof ETMFSchemaNode) {
            ETMFSchemaNode etmfSchemaNode = (ETMFSchemaNode) parent;
            this.parentNode = (ETMFSchemaNode) parent;
            this.etmfSchema = etmfSchemaNode.getEtmfSchema();
        }
    }

    public Set<ETMFSchemaNode> getChildren() {
        return children;
    }

    @XmlElement(name = "node")
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
