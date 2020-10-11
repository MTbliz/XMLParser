import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ETMFSchema {

    private Long id;

    private String name;

    private Long studyId;

    private Set<ETMFSchemaNode> rootNodes = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getStudyId() {
        return studyId;
    }

    public void setStudyId(Long studyId) {
        this.studyId = studyId;
    }

    public Set<ETMFSchemaNode> getRootNodes() {
        return rootNodes;
    }

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
