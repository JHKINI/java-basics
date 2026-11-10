package study_package;

 class MyString{

	String str;  
	//char[ ] s = new char[50];
	int length;
	
	public MyString(MyString str) {
		this.str = str;
		int count = 0;
		for(int i = 0; i <= 50; i++) 
			s[i] = str.charAt(i);
	}
	
	public String toString() {
		return str;
	}
	
	// 직접 구현
	public String concat(MyString str) {
		this.str += str;
		return 
		int count = 0;
		for(int i = 0; i<50; i++) {
		if(s[i] == '\0')
			count = i;
		}
		for(int i = count; i < str.length(); i++) {
			s[i] = str.charAt(i);
		}
		return str;
		
	}
	public String trim() {
		return "";
	}
        public boolean contains() {
		return "";
        }
        public int compareTo() {
		return "";
        }
	public String replace() {
		return "";
	}
	public String split() {
		return "";
	}
	public String substring() {
		return "";
        }
        public String toLowerCase() {
		return "";
        } 
       public String toUpperCase() {
		return "";


	}
}

public class MyStringEx {
	public static void main(String[] args) {
		MyString a = new MyString(" C#");
 		MyString b = new MyString(",C++");
		System.out.println(a);
		System.out.println(b);
		a = a.concat(b);
		System.out.println(a);
	}
}
