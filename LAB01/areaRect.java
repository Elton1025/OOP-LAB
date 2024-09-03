class areaRect {
	public static void main(String args[]) {
		int l=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int area= l*b;
		int circum= 2*(l+b);
		System.out.println("Length of the rectangle:"+l);
		System.out.println("Breadth of the rectangle:"+b);
		System.out.println("Area:"+area);
		System.out.println("Circumference:"+circum);
	}
}