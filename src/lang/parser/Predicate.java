package lang.parser;

import java.util.List;

public interface Predicate {

	public boolean eval(List<?> args);
	
}
