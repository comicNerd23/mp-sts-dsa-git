package com.moulik.dsa.stack;

import java.util.HashMap;
import java.util.Map;

public class BracketSequence {

	public static void main(String[] args) {

		String str = "{[]()()}{}";
		
		System.out.println(isTrueBracketSequence(str));

	}

	private static boolean isTrueBracketSequence(String str) {
		Map<Character, Character> bracketsMap = new HashMap<>();
		bracketsMap.put('{', '}');
		bracketsMap.put('(', ')');
		bracketsMap.put('[', ']');
		
		StackFromArrayList<Character> stack = new StackFromArrayList<>();
		boolean b = false;
		for(char c : str.toCharArray()) {
			if(bracketsMap.containsKey(c)) {
				stack.push(c);
			} else if(bracketsMap.containsValue(c)) {
				if( c != bracketsMap.get(stack.pop()) || stack.isEmpty() ) {
					return false;
				}
			} else {
				throw new IllegalArgumentException("Unknown character found:"+c);
			}
		}
		return stack.isEmpty();
	}

}
