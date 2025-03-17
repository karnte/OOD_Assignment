import java.util.*;
import java.util.stream.*;
public interface IFilter<T>
{
    Stream<T> filter(List<T> items, ISpecification<T> spec);
}
