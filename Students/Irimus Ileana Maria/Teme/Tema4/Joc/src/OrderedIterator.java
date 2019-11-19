
import java.util.*; 


public interface OrderedIterator extends Iterator<Card>
{
	int put(Comparable comparable);
}