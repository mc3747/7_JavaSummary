class Untitled {
	public static void main(String[] args) {
		class Shape implements Cloneable {
			public int lineCount;
			public String name;
			
			public Shape(int lineCount, String name) {
				this.lineCount = lineCount;
				this.name = name;
			}
			
			public Shape clone() {
				try {
					return (Shape) super.clone();
				}
				catch (CloneNotSupportedException e) { return null; }
			}
		}
		
		Shape square = new Shape(4, "Square");
		
		//not deep copy
		Shape squareCopy = square.clone();
	}
}
