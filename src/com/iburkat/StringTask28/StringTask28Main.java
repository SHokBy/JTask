package com.iburkat.StringTask28;

public class StringTask28Main {
	public static void main(String[] args){
		String text = "some text for task N28  double spaces";
		System.out.println(modifyText(text));
	}
	
	private static String modifyText(String inputText){
		String[] words = inputText.split(" ");
		String result = "";
		
		for (String word: words){
			if (!word.isEmpty()){
				String first = word.substring(0,1).toUpperCase();
				String all = word.substring(1);
				result +=  first+all+" ";
			}else{
				result += " ";
			}
				
		}
		return result;
	}

}
