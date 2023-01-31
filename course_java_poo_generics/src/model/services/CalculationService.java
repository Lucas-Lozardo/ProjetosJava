package model.services;

import java.util.List;

public class CalculationService {
	
	public static <T extends Comparable<T>> T max(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		T max = list.get(0);
		for(T item : list) {
			if(item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}

}

///Generics é representado pelo <T>
/// Para utilizar o comparableTo adicionar no public  - <T extends Comparable<T>