package org.git;

public class SampleGit {
	
	public static void main(String[] args) {
		
		System.out.println("working directory");
		System.out.println("system directory");
		System.out.println("local directory");
		System.out.println("remote directory");
		
		String s = "java program";
		String output = "";
		
		for (int i =s.length()-1; i>=0; i--) {
			char c = s.charAt(i);
			output = output + c;
		}
		System.out.println(output);
	}
}