package com.example.lotto;

import java.util.List;

public interface NumbersGenerator {
	List<Integer> generate(int from, int to, int size);
}