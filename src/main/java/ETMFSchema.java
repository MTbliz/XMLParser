import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@XmlRootElement(name = "etmfschema")
@XmlType(propOrder = {"name", "studyId", "rootNodes"})
public class ETMFSchema {

    private Long id;

    private String name;

    private Long studyId;

    private Set<ETMFSchemaNode> rootNodes = new HashSet<>();

    public Long getId() {
        return id;
    }

    @XmlTransient
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @XmlElement(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    public Long getStudyId() {
        return studyId;
    }

    @XmlElement(name = "studyid")
    public void setStudyId(Long studyId) {
        this.studyId = studyId;
    }

    public Set<ETMFSchemaNode> getRootNodes() {
        return rootNodes;
    }

    @XmlElement(name = "node", type = ETMFSchemaNode.class)
    public void setRootNodes(Set<ETMFSchemaNode> rootNodes) {
        this.rootNodes = rootNodes;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ETMFSchema that = (ETMFSchema) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
