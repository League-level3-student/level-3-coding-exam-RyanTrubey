import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapCalculator {

	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int numcommonpairs = 0;
		Set<String> keys1 = hashmap1.keySet();
		Collection<String> values1 = hashmap1.values();
		Object[] value1list = values1.toArray();
		Object[] key1list = keys1.toArray();
		
		Set<String> keys2 = hashmap2.keySet();
		Collection<String> values2 = hashmap2.values();
		Object[] value2list = values2.toArray();
		Object[] key2list = keys2.toArray();
		for(int i = 0; i < hashmap1.size(); i++) {
			for(int j = 0; j < hashmap2.size(); j++) {
				if(value1list[i] == value2list[j] && key1list[i] == key2list[j]) {
					numcommonpairs += 1;
				}
			}
		}
		return numcommonpairs;
	}
}
