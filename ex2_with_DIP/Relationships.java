import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Relationships implements IRelationshipBrowser {
    private List<Triplet<Person, RelationshipStatus, Person>> relations = new ArrayList<>();

    public void addParentAndChild(Person parent, Person child) {
        relations.add(new Triplet<>(parent, RelationshipStatus.PARENT, child));
        relations.add(new Triplet<>(child, RelationshipStatus.CHILD, parent));
    }

    public void addSibling(Person sibling1, Person sibling2) {
        relations.add(new Triplet<>(sibling1, RelationshipStatus.SIBLING, sibling2));
        relations.add(new Triplet<>(sibling2, RelationshipStatus.SIBLING, sibling1));
    }

    @Override
    public List<Person> findAllStatusOf(String name, RelationshipStatus status) {
        return relations.stream()
            .filter(x -> Objects.equals(x.getValue0().name, name) && x.getValue1() == status)
            .map(Triplet::getValue2)
            .collect(Collectors.toList());
    }
}